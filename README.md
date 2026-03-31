# 🏥 Patient Archive System

A Spring Boot REST API for managing patient records with CRUD operations, validation, and search functionality.
# 🏥 Patient Archive System

A scalable Spring Boot REST API for managing patient records efficiently, designed with real-world healthcare use cases in mind.

---

## 💡 Overview

The Patient Archive System is a backend application that provides efficient management of patient data through RESTful APIs. It is built with a focus on scalability, modular architecture, and clean code practices.

This project simulates how healthcare systems like OpenMRS can manage patient records while maintaining performance and data integrity.

---

## 🚀 Features

- Add patient records
- Retrieve all patients
- Update patient details
- Delete patient data
- Search patients by name and age
- Input validation
- Global exception handling
- API testing using Swagger UI

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

| Method | Endpoint            | Description              |
|--------|--------------------|--------------------------|
| POST   | /api/add           | Add a new patient        |
| GET    | /api/all           | Get all patients         |
| PUT    | /api/update/{id}   | Update patient details   |
| DELETE | /api/delete/{id}   | Delete patient           |
| GET    | /api/search        | Search patients          |

---

## ▶️ How to Run

1. Clone the repository

```bash
git clone https://github.com/mansi2830441/patient-archive-system.git
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
## 📸 Screenshots

### Swagger UI
<img width="938" height="457" alt="image" src="https://github.com/user-attachments/assets/2f97e85a-4601-4f98-a83f-7fabbd304891" />
<img width="941" height="477" alt="image" src="https://github.com/user-attachments/assets/e2db8d2c-e6fd-4bdd-a5e2-eece7cd89374" />
<img width="942" height="489" alt="image" src="https://github.com/user-attachments/assets/ecb372a0-ff71-4a30-88bc-d46051cfd328" />


