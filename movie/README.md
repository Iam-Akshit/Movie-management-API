# Movie Management API

A simple RESTful Java backend application built with Spring Boot for managing a collection of movies.
This project was created as a sample task for the Java Developer Opportunity.

## 🛠 Tech Stack
- **Language:** Java 21
- **Framework:** Spring Boot 4.0.2
- **Build Tool:** Maven
- **Database:** In-memory storage (ArrayList)

## 🚀 How to Run Locally
1. Clone the repository or extract the zip file.
2. Open the project in **IntelliJ IDEA** or **Eclipse**.
3. Run the `MovieApplication.java` file.
4. The server will start at `http://localhost:8080`.

## 📡 API Endpoints

### 1. Add a New Movie
- **URL:** `/api/movies`
- **Method:** `POST`
- **Body (JSON):**
    ```json
    {
        "title": "Inception",
        "description": "A mind-bending thriller",
        "rating": 9.0
    }
    ```
- **Response:** Returns the created movie with a generated ID.
- **Validation:**
    - Title cannot be empty.
    - Description must be under 200 characters.
    - Rating is required.

### 2. Get Movie by ID
- **URL:** `/api/movies/{id}`
- **Method:** `GET`
- **Example:** `/api/movies/1`
- **Response:** Returns the movie details.

### 3. Get All Movies
- **URL:** `/api/movies`
- **Method:** `GET`
- **Response:** Returns a list of all movies.

## 🧪 Testing
You can use **Postman** to test the API endpoints.