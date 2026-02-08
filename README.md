# Secure RBAC API

A Spring Boot backend service implementing JWT-based authentication and
role-based access control (RBAC) for secure user management.

This project was built by extending an open-source JWT authentication
template and enhancing it with better structure, security, and scalability.

---

## 🚀 Tech Stack

- Java 17
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- Spring Data JPA
- MySQL
- Maven

---

## 🔐 Features

- User registration and login
- JWT-based authentication
- Role-based authorization (ADMIN / USER)
- Secured REST APIs
- Centralized exception handling
- DTO-based request/response mapping
- Password encryption using BCrypt

---

## 📂 Project Structure
com.shwet.secureapi
├── Auth
├── config
├── controllers
├── dto
├── entity
├── repo
├── service
└── exp


---

## ⚙️ Setup & Run

### Prerequisites

- Java 17+
- Maven
- MySQL

### Steps

1. Clone the repository

```bash
git clone https://github.com/ShwetaRawat09/secure-rbac-api.git


Configure database in application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/secureapi
spring.datasource.username=root
spring.datasource.password=yourpassword


Run the application

./mvnw spring-boot:run

📌 API Authentication Flow

User logs in with credentials

Server generates JWT token

Client sends token in Authorization header

Server validates token for each request

Example:

Authorization: Bearer <your_token_here>

🧪 Future Improvements

Refresh token support

Pagination and filtering

Docker containerization

Unit and integration testing

CI/CD pipeline

Deployment on cloud

👩‍💻 Author

Shweta Rawat

GitHub: https://github.com/ShwetaRawat09

📄 License

This project is for learning and portfolio purposes.


---

## ✅ After Pasting: Commit It

Run:

```powershell
git add README.md
git commit -m "Rewrite README with project overview and setup"
git push



