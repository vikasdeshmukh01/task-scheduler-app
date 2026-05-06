import { useEffect, useState } from 'react';

function App() {
  const [tasks, setTasks] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    fetch('/api/tasks')
      .then((response) => {
        if (!response.ok) {
          throw new Error('Unable to load tasks.');
        }
        return response.json();
      })
      .then((data) => {
        setTasks(data);
        setLoading(false);
      })
      .catch((err) => {
        setError(err.message);
        setLoading(false);
      });
  }, []);

  return (
    <div className="app-container">
      <header>
        <h1>Task Scheduler</h1>
        <p>View scheduled tasks from the backend.</p>
      </header>

      <main>
        {loading && <div className="status-message">Loading tasks...</div>}
        {error && <div className="status-message error">{error}</div>}
        {!loading && !error && (
          <div className="task-grid">
            {tasks.length === 0 ? (
              <div className="status-message">No tasks found.</div>
            ) : (
              tasks.map((task) => (
                <article key={task.id} className="task-card">
                  <h2>{task.title}</h2>
                  <p>{task.description || 'No description provided.'}</p>
                  <ul>
                    <li><strong>Status:</strong> {task.status}</li>
                    <li><strong>Priority:</strong> {task.priority}</li>
                    <li><strong>Cron:</strong> {task.cronExpression}</li>
                    <li><strong>User:</strong> {task.userId || 'N/A'}</li>
                  </ul>
                </article>
              ))
            )}
          </div>
        )}
      </main>
    </div>
  );
}

export default App;
