This is a movie reservation E2E system.

## List of dependencies :
    implementation 'org.springframework.boot:spring-boot-starter-actuator'
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    implementation 'org.springframework.boot:spring-boot-starter-security'
    Implementation 'org.springframework.boot:spring-boot-starter-validation'
    implementation 'org.springframework.boot:spring-boot-starter-webmvc'
    compileOnly 'org.projectlombok:lombok'
    developmentOnly 'org.springframework.boot:spring-boot-devtools'
    runtimeOnly 'com.mysql:mysql-connector-j'
    annotationProcessor 'org.projectlombok:lombok'

## file structure:
src/main/java
│
└── com.example.moviereservation
    │
    ├── controller
    │     ├── MovieController
    │     ├── ShowtimeController
    │     └── BookingController
    │
    ├── service
    │     ├── MovieService
    │     ├── ShowtimeService
    │     └── BookingService
    │
    ├── repository
    │     ├── MovieRepository
    │     ├── ShowtimeRepository
    │     ├── UserRepository
    │     └── BookingRepository
    │
    └── entity
          ├── Movie
          ├── Showtime
          ├── User
          └── Booking

## Data Flow:
HTTP request
     ↓
Controller
     ↓
Service
     ↓
Repository
     ↓
JPA / Hibernate
     ↓
Database

## Java models for the entities are:
    booking
    movie
    showTime

