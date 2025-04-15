# AirBnbApp

AirBnbApp is a Spring Boot-based application that replicates core functionalities of an AirBnb-like platform. It provides features for hotel management, room booking, dynamic pricing, user authentication, and payment integration using Stripe.

## Features

### User Features
- **Authentication**: Sign up, log in, and refresh JWT tokens.
- **Profile Management**: Update user profile and view personal details.
- **Guest Management**: Add, update, and delete guest profiles.
- **Booking Management**: Search hotels, book rooms, add guests to bookings, and manage payments.

### Admin Features
- **Hotel Management**: Create, update, delete, and activate hotels.
- **Room Management**: Add, update, delete, and view rooms in hotels.
- **Inventory Management**: Manage room availability and pricing dynamically.
- **Reports**: Generate booking and revenue reports for hotels.

### Core Functionalities
- **Dynamic Pricing**: Implements strategies like surge pricing, holiday pricing, urgency pricing, and occupancy-based pricing.
- **Payment Integration**: Uses Stripe for secure payment processing.
- **Security**: JWT-based authentication and role-based access control.
- **Scheduling**: Periodic updates for inventory and hotel pricing.

## Project Structure
airBnbApp/ ├── src/ │ ├── main/ │ │ ├── java/ │ │ │ └── com/ │ │ │ └── codingshuttle/ │ │ │ └── projects/ │ │ │ └── airBnbApp/ │ │ │ ├── advice/ # Global exception handling and response wrapping │ │ │ ├── config/ # Configuration files (CORS, Stripe, Mapper) │ │ │ ├── controller/ # REST controllers for user, admin, and booking flows │ │ │ ├── dto/ # Data Transfer Objects │ │ │ ├── entity/ # JPA entities │ │ │ ├── exception/ # Custom exceptions │ │ │ ├── repository/ # Spring Data JPA repositories │ │ │ ├── security/ # Security configuration and JWT handling │ │ │ ├── service/ # Business logic and service layer │ │ │ ├── strategy/ # Pricing strategies │ │ │ └── util/ # Utility classes │ │ └── resources/ │ │ ├── application.properties # Application configuration │ │ └── static/ # Static resources │ │ └── templates/ # Templates (if applicable) │ └── test/ │ └── java/ │ └── com/ │ └── codingshuttle/ │ └── projects/ │ └── airBnbApp/ # Unit and integration tests ├── .gitignore # Git ignore rules ├── .gitattributes # Git attributes ├── HELP.md # Spring Boot help file ├── mvnw # Maven wrapper script ├── mvnw.cmd # Maven wrapper script for Windows ├── pom.xml # Maven project descriptor └── README.md # Project documentation


## Technologies Used

- **Backend**: Spring Boot, Spring Data JPA, Spring Security
- **Database**: PostgreSQL
- **Payment Gateway**: Stripe
- **Authentication**: JWT
- **Build Tool**: Maven
- **Other Libraries**: ModelMapper, Lombok, SpringDoc OpenAPI

## Configuration

### `application.properties`
- **Database**: Configure `spring.datasource.url` for your PostgreSQL database.
- **JWT**: Set `jwt.secretKey` for token signing.
- **Stripe**: Provide `stripe.secret.key` and `stripe.webhook.secret`.
- **Frontend URL**: Update `frontend.url` to match your frontend application.

### Maven
Run the following command to build the project:
```bash
./mvnw clean install
