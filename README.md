# 📋 Task Scheduler App

Real-time task scheduling with priority queues and RabbitMQ

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

---

## 🎯 Overview

A full-stack application for managing and executing tasks with real-time scheduling capabilities. Built with modern architecture using Spring Boot backend, React frontend, and PostgreSQL database.

### Key Features
- ⚡ **Real-time Task Scheduling** - Schedule tasks to run at specific times
- 🔄 **Priority Queues** - Process tasks based on priority levels
- 📨 **Message Queue Integration** - Asynchronous processing with RabbitMQ
- 🗄️ **Persistent Storage** - PostgreSQL database for task management
- 🎨 **Modern UI** - React-based user interface

---

## 🏗️ Architecture

```
task-scheduler-app/
├── backend/          # Spring Boot API
├── frontend/         # React Application
└── docker-compose.yml # Container orchestration
```

| Component | Technology | Port |
|-----------|-----------|------|
| Backend API | Java Spring Boot | 8080 |
| Frontend | React | 3000 |
| Database | PostgreSQL 16 | 5432 |
| Message Queue | RabbitMQ | - |

---

## 🚀 Quick Start

### Option 1: Docker Compose (Recommended)

```bash
docker compose up --build
```

This will start:
- PostgreSQL database (port 5432)
- Spring Boot backend (port 8080)
- React frontend (port 3000)

To stop:
```bash
docker compose down
```

### Option 2: Local Development

#### Backend Setup
```bash
# Start PostgreSQL
docker run --name task-scheduler-postgres \
  -e POSTGRES_PASSWORD=postgres \
  -e POSTGRES_DB=task_scheduler \
  -p 5432:5432 -d postgres:16

# Create database
PGPASSWORD=postgres psql -U postgres -h localhost -c "CREATE DATABASE task_scheduler;"

# Start Spring Boot
cd backend
mvn spring-boot:run
```

#### Frontend Setup
```bash
cd frontend
npm install
npm start
```

---

## 📖 Usage

### Frontend
- Navigate to `http://localhost:3000`
- Create, view, and manage tasks through the UI

### API Endpoint
- Base URL: `http://localhost:8080/api`
- Tasks endpoint: `http://localhost:8080/api/tasks`

---

## 🔧 Configuration

### Backend (`backend/src/main/resources/application.yml`)
Configure database connection, server port, and RabbitMQ settings here.

### Frontend (`.env` in frontend directory)
Set API endpoint and other environment variables.

---

## 📦 Dependencies

**Backend:**
- Spring Boot
- PostgreSQL Driver
- RabbitMQ Client

**Frontend:**
- React
- Axios (or similar HTTP client)

---

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

---

## 📞 Support

For issues or questions, please open an issue on the repository.
