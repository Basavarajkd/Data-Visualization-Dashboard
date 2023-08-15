# Data-Visualization-Dashboard
A data visualization dashboard project is a dynamic and interactive digital platform designed to present complex data and information in a visually engaging and understandable manner.


# Visual Dashboard Application

The Visual Dashboard Application is a Spring Boot project that provides a RESTful API for fetching data with various filtering options from a MySQL database. This application is designed to demonstrate the use of Spring Boot, JPA, and REST APIs for building a data visualization and filtering system.


## Features

- Fetch data from a MySQL database with optional filtering based on different criteria.
- Demonstrates the use of Spring Boot, JPA, and REST APIs.
- Converts fetched data into Data Transfer Objects (DTOs) using ModelMapper.
- Provides a simple MVC architecture for data retrieval.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) 8 or higher
- Apache Maven
- MySQL Server
- Spring Boot
- IntelliJ IDEA

## Getting Started

 1. Clone the Repository


git clone https://github.com/your-username/visual-dashboard.git
cd visual-dashboard



2.Configure Database
Edit the application.properties file located in the src/main/resources directory to configure the MySQL database connection:

properties

spring.datasource.url=jdbc:mysql://localhost:3306/visualdashboard
spring.datasource.username=root
spring.datasource.password=newpass
spring.jpa.hibernate.ddl-auto=update



3. Build and Run
Build and run the application using the following commands:


mvn clean install
mvn spring-boot:run
The application will start and listen on a specified port.

Usage
API Endpoints
The application provides the following API endpoint to fetch data with optional filtering:

GET /api/data

Fetch data with optional filters.

Query Parameters:

endYear
topics
sector
region
pest
source
swot
country
city
For detailed usage instructions and examples, refer to the Usage section.

Database Configuration
The application uses MySQL as its database. Configure the database connection in the application.properties file as described in the Getting Started section.

Contributing
Contributions to this project are welcome! To contribute:

Fork the repository.
Create a new branch.
Make your changes and commit them.
Push the changes to your fork.
Submit a pull request.
