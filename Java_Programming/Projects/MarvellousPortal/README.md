# 🎓 MarvellousPortal - Batch Management System

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.0-green)
![MongoDB](https://img.shields.io/badge/MongoDB-7.0-brightgreen)
![Maven](https://img.shields.io/badge/Maven-4.0-red)

A production-ready RESTful API built with Spring Boot and MongoDB to manage batch entries for a coaching institute. This project demonstrates complete CRUD operations with proper validation, exception handling, and clean architecture.

---

## 📌 Table of Contents
- [About the Project](#about-the-project)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [API Endpoints](#api-endpoints)
- [Sample Requests](#sample-requests)
- [Validation Rules](#validation-rules)
- [Exception Handling](#exception-handling)

---

## 📖 About the Project

MarvellousPortal is a backend REST API application designed to manage batch entries for a coaching institute. It allows administrators to:

- Add new batch entries with student name and fees
- View all batch entries stored in MongoDB
- Search for a specific batch entry by ID
- Update existing batch entry details
- Delete batch entries when required

The project follows a clean **Layered Architecture**:

Controller → Service → Repository → MongoDB

---

## 🛠️ Technologies Used

| Technology | Version | Purpose |
|------------|---------|---------|
| Java | 21 | Core programming language |
| Spring Boot | 3.5.0 | Backend framework |
| Spring Data MongoDB | 4.5.0 | Database integration |
| MongoDB | 7.0 | NoSQL database |
| Maven | 4.0 | Build tool |
| Lombok | 1.18.38 | Reduces boilerplate code |
| Spring Validation | 3.5.0 | Input validation |
| Tomcat | 10.1.41 | Embedded server |

---

## 🏗️ Project Structure

```
src/
└── main/
    └── java/
        └── com/marvellous/MarvellousPortal/
            ├── controller/
            │   ├── BatchEntryController.java   → CRUD API endpoints
            │   └── HealthCheck.java            → Server health check
            ├── Entity/
            │   └── BatchEntry.java             → MongoDB document model
            ├── Repository/
            │   └── BatchEntryRepository.java   → Database operations
            ├── service/
            │   └── BatchEntryService.java      → Business logic
            ├── exception/
            │   └── GlobalExceptionHandler.java → Centralized error handling
            └── MarvellousPortalApplication.java → Main entry point
```

---

## ⚙️ Prerequisites

- ✅ Java 21+
- ✅ Maven 4.0+
- ✅ MongoDB 7.0 running on localhost:27017
- ✅ Git

---

## 🚀 Getting Started

### 1. Clone the repository
```
git clone https://github.com/VaishnaviAtmaramKadam/Programming.git
```

### 2. Navigate to project folder
```
cd Programming/Java_Programming/Projects/MarvellousPortal
```

### 3. Start MongoDB
```
net start MongoDB
```

### 4. Run the project
```
mvn spring-boot:run
```

### 5. Verify server is running
```
http://localhost:8080/HealthCheck
```
Expected Response: Everything is OK

---

## 📌 API Endpoints

| Method | URL | Description | Status Code |
|--------|-----|-------------|-------------|
| GET | /batches | Get all batch entries | 200 OK |
| POST | /batches | Create new batch entry | 201 Created |
| GET | /batches/id/{id} | Get batch entry by ID | 200 OK |
| PUT | /batches/id/{id} | Update batch entry by ID | 200 OK |
| DELETE | /batches/id/{id} | Delete batch entry by ID | 204 No Content |
| GET | /HealthCheck | Check server status | 200 OK |

---

## 📝 Sample Requests & Responses

### POST /batches - Create Entry
Request Body:
```json
{
    "name": "Rahul Sharma",
    "fees": 5000
}
```
Response (201 Created):
```json
{
    "id": "6a3ee8a2abce11ed7abd8dfe",
    "name": "Rahul Sharma",
    "fees": 5000
}
```

### GET /batches - Get All Entries
Response (200 OK):
```json
[
    {
        "id": "6a3ee8a2abce11ed7abd8dfe",
        "name": "Rahul Sharma",
        "fees": 5000
    }
]
```

### PUT /batches/id/{id} - Update Entry
Request Body:
```json
{
    "name": "Rahul Patil",
    "fees": 7000
}
```
Response (200 OK):
```json
{
    "id": "6a3ee8a2abce11ed7abd8dfe",
    "name": "Rahul Patil",
    "fees": 7000
}
```

### DELETE /batches/id/{id}
Response: 204 No Content

---

## ✅ Validation Rules

| Field | Rule | Error Message |
|-------|------|---------------|
| name | Cannot be empty | "Name cannot be empty!" |
| fees | Must be greater than 0 | "Fees must be greater than 0!" |

Validation Error Response:
```json
{
    "name": "Name cannot be empty!",
    "fees": "Fees must be greater than 0!"
}
```

---

## ⚠️ Exception Handling

| Exception | HTTP Status | Description |
|-----------|-------------|-------------|
| MethodArgumentNotValidException | 400 Bad Request | Validation failures |
| IllegalArgumentException | 400 Bad Request | Invalid arguments |
| Exception | 500 Internal Server Error | Unexpected errors |

---

## 🗄️ Database Configuration

```
spring.application.name=MarvellousPortal
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=MarvellousFullStack
```

MongoDB Collection: BatchDetails

---

## 👩‍💻 Author

Vaishnavi Atmaram Kadam
- GitHub: https://github.com/VaishnaviAtmaramKadam
