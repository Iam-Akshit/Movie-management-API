# 🎬 Movie Management API

A robust RESTful Backend Application built with **Java Spring Boot** to manage movie records.
This project demonstrates REST API development, Input Validation, Docker Containerization, and Cloud Deployment.

---

## 🚀 Live Demo
The application is deployed live on Render using Docker containers.

**Base URL:** `https://movie-management-api-kh9s.onrender.com/api/movies`

**Test Endpoints Live:**
1. **Get All Movies:**
   (https://movie-management-api-kh9s.onrender.com/api/movies)
2. **Add Movie (POST):** Use Postman or curl to send a POST request to the URL above.

---

## 🛠 Tech Stack
* **Language:** Java 21
* **Framework:** Spring Boot 4.0.2
* **Build Tool:** Maven
* **Containerization:** Docker
* **Deployment:** Render (Cloud Platform)
* **Database:** In-memory storage

---

## 📡 API Endpoints

### 1. Add a New Movie
* **Endpoint:** `/api/movies`
* **Method:** `POST`
* **Body:**
    ```json
    {
        "title": "Inception",
        "description": "A mind-bending thriller by Christopher Nolan.",
        "rating": 9.0
    }
    ```
* **Validation Rules:**
  * `title`: Cannot be empty.
  * `description`: Must be under 200 characters.
  * `rating`: Required field.

### 2. Get All Movies
* **Endpoint:** `/api/movies`
* **Method:** `GET`
* **Response:** Returns a list of all movies.

### 3. Get Movie by ID
* **Endpoint:** `/api/movies/{id}`
* **Method:** `GET`
* **Example:** `/api/movies/1`

---

## 💻 How to Run Locally

You can run this project either using **Maven** or **Docker**.

### Option 1: Using Maven (Standard)
1.  Clone the repository.
2.  Open the project in **IntelliJ IDEA** or **Eclipse**.
3.  Run the command:
    ```bash
    ./mvnw spring-boot:run
    ```
4.  The server will start at `http://localhost:8080`.

## 🧪 Testing
You can use **Postman** to test the API endpoints.

### Option 2: Using Docker (Containerized)
Since this project includes a `Dockerfile`, you can build and run it as a container.

1.  **Build the Image:**
    ```bash
    docker build -t movie-api .
    ```
2.  **Run the Container:**
    ```bash
    docker run -p 8080:8080 movie-api
    ```
3.  Access the API at `http://localhost:8080/api/movies`.

---

## ☁️ Deployment Details
This project implements a CI/CD workflow:
1.  **Source Code:** Hosted on GitHub.
2.  **Containerization:** A `Dockerfile` is used to build a lightweight Alpine Linux-based Java image.
3.  **Hosting:** Deployed on **Render**, which automatically builds and deploys the Docker container whenever changes are pushed to the `main` branch.

---

### 👤 Author
**Akshit Goyal**
*Java Backend Developer*