# 🎓 MarvellousPortal – Batch Management System

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.0-brightgreen)
![MongoDB](https://img.shields.io/badge/MongoDB-7.0-green)
![Maven](https://img.shields.io/badge/Maven-4.0-blue)
![REST API](https://img.shields.io/badge/REST-API-blue)

A production-ready **RESTful API** built using **Spring Boot** and **MongoDB** to manage batch records for a coaching institute. The project demonstrates clean architecture, CRUD operations, validation, exception handling, and NoSQL database integration.

---

# 📌 Features

- ✅ Create, Read, Update and Delete (CRUD) operations
- ✅ RESTful API development using Spring Boot
- ✅ MongoDB integration using Spring Data MongoDB
- ✅ Layered Architecture (Controller → Service → Repository)
- ✅ Input validation using Spring Validation
- ✅ Global Exception Handling
- ✅ JSON request and response handling
- ✅ Maven project structure

---

# 🛠️ Technology Stack

| Technology | Version |
|------------|---------|
| Java | 21 |
| Spring Boot | 3.5.0 |
| Spring Data MongoDB | 4.5.0 |
| MongoDB | 7.0 |
| Maven | 4.0 |
| Lombok | 1.18.38 |

---

# 🏗️ Project Architecture

```
                Client
                   │
                   ▼
          BatchEntryController
                   │
                   ▼
          BatchEntryService
                   │
                   ▼
        BatchEntryRepository
                   │
                   ▼
               MongoDB
```

---

# 📂 Project Structure

```
src
└── main
    ├── java
    │   └── com.marvellous.MarvellousPortal
    │       ├── controller
    │       │   ├── BatchEntryController.java
    │       │   └── HealthCheck.java
    │       │
    │       ├── Entity
    │       │   └── BatchEntry.java
    │       │
    │       ├── Repository
    │       │   └── BatchEntryRepository.java
    │       │
    │       ├── service
    │       │   └── BatchEntryService.java
    │       │
    │       ├── exception
    │       │   └── GlobalExceptionHandler.java
    │       │
    │       └── MarvellousPortalApplication.java
    │
    └── resources
        └── application.properties
```

---

# ⚙️ Prerequisites

- Java 21+
- Maven 4+
- MongoDB 7+
- Git

---

# 🚀 Getting Started

### Clone Repository

```bash
git clone https://github.com/VaishnaviAtmaramKadam/Programming.git
```

### Navigate to Project

```bash
cd Programming/Java_Programming/Projects/MarvellousPortal
```

### Start MongoDB

```bash
net start MongoDB
```

### Run Application

```bash
mvn spring-boot:run
```

---

# 🌐 Health Check

```
GET /HealthCheck
```

Response

```
Everything is OK
```

---

# 📌 REST API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /HealthCheck | Check server status |
| POST | /batches | Create batch |
| GET | /batches | Get all batches |
| GET | /batches/id/{id} | Get batch by ID |
| PUT | /batches/id/{id} | Update batch |
| DELETE | /batches/id/{id} | Delete batch |

---

# 📝 Sample Request

### Create Batch

```http
POST /batches
```

```json
{
  "name": "Rahul Sharma",
  "fees": 5000
}
```

Response

```json
{
  "id": "6a3ee8a2abce11ed7abd8dfe",
  "name": "Rahul Sharma",
  "fees": 5000
}
```

---

# ✅ Validation

| Field | Validation |
|---------|------------------------|
| name | Cannot be empty |
| fees | Must be greater than 0 |

Example Response

```json
{
  "name": "Name cannot be empty!",
  "fees": "Fees must be greater than 0!"
}
```

---

# ⚠️ Exception Handling

| Exception | Status |
|-------------------------------|------------|
| MethodArgumentNotValidException | 400 Bad Request |
| IllegalArgumentException | 400 Bad Request |
| Exception | 500 Internal Server Error |

---

# 🗄️ Database Configuration

```properties
spring.application.name=MarvellousPortal

spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=MarvellousFullStack
```

**Collection Name**

```
BatchDetails
```

---

# 📸 API Screenshots

Add screenshots here:

- Create Batch (POST)
- Get All Batches (GET)
- Update Batch (PUT)
- Delete Batch (DELETE)
- MongoDB Collection
- Postman Testing

---

# 🚀 Future Enhancements

- Spring Security with JWT Authentication
- Swagger/OpenAPI Documentation
- Pagination & Sorting
- Docker Support
- Unit Testing (JUnit & Mockito)
- Batch Search & Filtering

---

# 👩‍💻 Author

**Vaishnavi Atmaram Kadam**

GitHub:  
https://github.com/VaishnaviAtmaramKadam

---

⭐ If you like this project, consider giving it a Star!
