# Todo App — Spring Boot



A full-stack **Todo Application** built with **Spring Boot** that lets users create, update, delete, and manage tasks — backed by a **MySQL** database.

> Built to practice backend development with RESTful APIs, MVC architecture, and database integration.

---

##  Features

- Add new tasks
- Update task title
- Delete tasks
- Toggle task completion status
- Persistent storage with MySQL

---

## Tech Stack

| Layer | Technology |
|-------|------------|
| Language | Java |
| Backend Framework | Spring Boot |
| Database ORM | Spring Data JPA (Hibernate) |
| Database | MySQL |
| Templating Engine | Thymeleaf |
| Frontend Styling | Bootstrap |
| Boilerplate Reduction | Lombok |

---



##  API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/tasks` | Retrieve all tasks |
| `POST` | `/tasks` | Create a new task |
| `POST` | `/tasks/{id}/update` | Update task title |
| `GET` | `/tasks/{id}/delete` | Delete a task |
| `GET` | `/tasks/{id}/toggle` | Toggle task completion |


---

##  Request Details

<details>
<summary><strong>POST</strong> <code>/tasks</code> — Create a task</summary>

| Parameter | Type | Description |
|-----------|------|-------------|
| `title` | `String` | Title of the task |

</details>

<details>
<summary><strong>POST</strong> <code>/tasks/{id}/update</code> — Update a task</summary>

| Parameter | Type | Description |
|-----------|------|-------------|
| `id` | `Long` | ID of the task (path variable) |
| `title` | `String` | New title for the task |

</details>

<details>
<summary><strong>GET</strong> <code>/tasks/{id}/delete</code> — Delete a task</summary>

| Parameter | Type | Description |
|-----------|------|-------------|
| `id` | `Long` | ID of the task (path variable) |

</details>

<details>
<summary><strong>GET</strong> <code>/tasks/{id}/toggle</code> — Toggle task status</summary>

| Parameter | Type | Description |
|-----------|------|-------------|
| `id` | `Long` | ID of the task (path variable) |

</details>

---

##  How to Run Locally

### Prerequisites
- Java 17+
- MySQL installed and running
- Maven

### Steps

1. **Clone the repository**
   ```bash
   git clone https://github.com/ishita0752/todo-app.git
   cd todo-app
   ```

2. **Create a MySQL database**
   ```sql
   CREATE DATABASE todo_db;
   ```

3. **Configure the database** in `src/main/resources/application.properties`
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```

4. **Run the application**
   ```bash
   ./mvnw spring-boot:run
   ```

5. **Open in browser**
   ```
   http://localhost:8080/tasks
   ```



This project was built as part of learning backend development with **Spring Boot** and real-world **CRUD operations**.


