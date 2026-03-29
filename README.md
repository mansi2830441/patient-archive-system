# 🏥 Patient Archive System

A Spring Boot REST API for managing patient records with CRUD operations, validation, and search functionality.

---

## 🚀 Features

- Add patient
- View all patients
- Update patient details
- Delete patient
- Search patients (by name and age)
- Input validation (no empty name, valid age)
- Global exception handling
- Swagger UI for API testing
- In-memory H2 database

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Swagger (OpenAPI)

---

## 📦 API Endpoints

| Method | Endpoint | Description |
|--------|---------|------------|
| POST | `/api/add` | Add a new patient |
| GET | `/api/all` | Get all patients |
| PUT | `/api/update/{id}` | Update patient |
| DELETE | `/api/delete/{id}` | Delete patient |
| GET | `/api/search` | Search patients |

---

## 🔍 Example Request

```json
{
  "name": "Mansi",
  "age": 22
}
