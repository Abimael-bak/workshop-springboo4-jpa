📦 Workshop Spring Boot + JPA

This project was developed using Spring Boot and Spring Data JPA, focusing on practicing RESTful APIs, JPA/Hibernate persistence, layered architecture, and custom exception handling.

The project was built while following practical lessons, aiming to strengthen core backend development concepts with Java and Spring.

🧱 Project Structure

The project follows a well-defined layered architecture, separating responsibilities clearly:

📦 com.educandoweb.couse
 ┣ 📂 config
 ┃ ┗ TestConfig.java
 ┣ 📂 entities
 ┃ ┣ Category.java
 ┃ ┣ Order.java
 ┃ ┣ OrderItem.java
 ┃ ┣ Payment.java
 ┃ ┣ Product.java
 ┃ ┗ User.java
 ┣ 📂 entities.enums
 ┃ ┗ OrderStatus.java
 ┣ 📂 entities.PK
 ┃ ┗ OrderItemPK.java
 ┣ 📂 repository
 ┃ ┣ CategoryRepository.java
 ┃ ┣ OrderItemRepository.java
 ┃ ┣ OrderRepository.java
 ┃ ┣ PaymentRepository.java
 ┃ ┣ ProductRepository.java
 ┃ ┗ UserRepository.java
 ┣ 📂 service
 ┃ ┣ OrderService.java
 ┃ ┣ ProductService.java
 ┃ ┣ UserService.java
 ┃ ┗ 📂 exception
 ┃   ┗ ResourceNotFoundException.java
 ┣ 📂 resource
 ┃ ┣ OrderResource.java
 ┃ ┣ ProductResource.java
 ┃ ┣ UserResource.java
 ┃ ┗ 📂 exception
 ┃   ┣ DatabaseException.java
 ┃   ┣ ResourceExceptionHandler.java
 ┃   ┗ StandardError.java
 ┗ CourseApplicationTests.java

🚀 Features

✔ REST API built with Spring Boot
✔ Full CRUD operations
✔ JPA relationships (@OneToMany, @ManyToMany, @OneToOne)
✔ Composite primary key (OrderItemPK)
✔ H2 in-memory database for testing
✔ Centralized custom exception handling
✔ Clean layered architecture

🛠️ Technologies Used

Java 17+

Spring Boot 3

Spring Data JPA

Hibernate

H2 Database

Maven

▶️ How to Run the Project

Clone the repository:

git clone https://github.com/Abimael-bak/workshop-springboo4-jpa.git
cd workshop-springboo4-jpa


Run the application:

mvn spring-boot:run


Or run it directly from your IDE using:

CourseApplicationTests.java


The application will be available at:

http://localhost:8080

🗄️ H2 Database

The project uses an H2 in-memory database for development and testing.

Access the H2 console:

http://localhost:8080/h2-console


Default configuration:

JDBC URL: jdbc:h2:mem:testdb
User: sa
Password: (empty)

🧠 Domain Model

Main entities in the system:

Entity	Description
User	System users
Product	Registered products
Category	Product categories
Order	Customer orders
OrderItem	Order items
Payment	Order payment

All relationships are implemented using JPA/Hibernate, following best practices.

⚠️ Exception Handling

The project includes custom exception handling, separated by layers:

📌 Service Layer

ResourceNotFoundException

📌 Resource (Controller) Layer

DatabaseException

ResourceExceptionHandler

StandardError

This ensures standardized HTTP responses and centralized error handling.

🧪 Test Data Population

The TestConfig.java class is responsible for populating the H2 database automatically when the application starts in the test profile.

📚 Project Purpose

This project is educational, designed to practice and consolidate knowledge in:

Spring Boot

JPA / Hibernate

RESTful APIs

Layered architecture

Exception handling

Backend project organization with Java

🔜 Possible Improvements

Add DTOs

Implement Bean Validation

Integrate MySQL or PostgreSQL

Add authentication with Spring Security

Document the API using Swagger/OpenAPI

🧑‍💻 Author

Abimael Abreu
Bachelor in Systems Analysis and Development
Java & Spring Boot Student
