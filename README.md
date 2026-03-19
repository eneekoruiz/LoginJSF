# Rides24JSF

![Java](https://img.shields.io/badge/Java-11-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![JSF](https://img.shields.io/badge/JSF-Jakarta_Faces-007396?style=for-the-badge&logo=java&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Build_Tool-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

Ride-sharing web application developed as a project for the Software Engineering II course (Grade: 9/10). The main goal was to implement a robust multi-tier architecture using the Java enterprise technology stack.

## Core features

* **User management:** Registration and authentication system.
* **Ride search:** Real-time filtering (via Ajax) by origin, destination, and date.
* **Route publishing:** Validated forms allowing users to offer rides, specifying available seats and price.
* **Dynamic UI:** Interface built on Facelets templates integrating PrimeFaces and OmniFaces, featuring a glassmorphism design.

## Architecture and Technologies

The project follows a classic MVC pattern separated into three tiers:

1. **Frontend:** JSF (Jakarta Faces) handling the views (`.xhtml`).
2. **Backend:** Business logic managed by CDI-controlled Managed Beans (Weld). Service communication is handled via RMI.
3. **Persistence:** Object-oriented database (ObjectDB).

The entire build cycle and dependency management are automated with Maven (`pom.xml`), configured to package the application as a `.war` file and deploy it via Eclipse WTP.

## What I learned

Beyond the academic grade, this project helped me deeply understand the HTTP request lifecycle in JSF and classic Java routing. It also pushed me to tackle and solve real-world integration issues with object-oriented databases, as well as using Ajax to asynchronously refresh UI components without reloading the entire page.
