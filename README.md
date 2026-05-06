# task-scheduler-app

Real-time task scheduling with priority queues and RabbitMQ.

## Backend

1. Ensure PostgreSQL is running and create the database:
   ```bash
   docker run --name task-scheduler-postgres -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=task_scheduler -p 5432:5432 -d postgres:16
   PGPASSWORD=postgres psql -U postgres -h localhost -c "CREATE DATABASE task_scheduler;"
   ```
2. Start the backend:
   ```bash
   cd backend
   mvn spring-boot:run
   ```

The backend uses `backend/src/main/resources/application.yml` for configuration.

## Frontend

1. Install dependencies:
   ```bash
   cd frontend
   npm install
   ```
2. Start the frontend:
   ```bash
   npm start
   ```

The frontend expects the backend API to be available at `http://localhost:8080/api`.

## Docker Compose

You can start the backend and PostgreSQL together using Docker Compose.

```bash
cd task-scheduler-app
docker compose up --build
```

This will bring up:
- PostgreSQL on port `5432`
- backend on port `8080`
- frontend on port `3000`

If you need to stop it:

```bash
docker compose down
```
