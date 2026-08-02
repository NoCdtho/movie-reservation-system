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
    src
        main
            java\com\nocde\movie_reservation_system
                controller
                model
                MovieReservationSystemApplication.java
                resources
            test

## Java models for the entities are:
    booking
    movie
    showTime

