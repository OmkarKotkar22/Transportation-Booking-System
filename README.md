# 🚍✈️🚆 Transportation Booking System – Java OOP Project  

![Java](https://img.shields.io/badge/🖥_Language-Java_17-orange?logo=openjdk)
![IDE](https://img.shields.io/badge/💻_IDE-Eclipse-blue?logo=eclipse)
![Application](https://img.shields.io/badge/📦_Application-Console-purple)
![Concepts](https://img.shields.io/badge/📚_Concepts-OOP%2C_Inheritance%2C_Polymorphism-red)
![Status](https://img.shields.io/badge/✅_Status-Completed-brightgreen)
![Version](https://img.shields.io/badge/📌_Version-1.0-yellow)

---

## 🌟 Project Highlights  

* ✅ Implements **core Java Object-Oriented Programming concepts**
* ✅ Demonstrates **real-world transportation booking logic**
* ✅ Uses **inheritance and polymorphism** effectively
* ✅ Clean and **well-structured Eclipse project**
* ✅ Ideal for **college projects, viva, and Java interviews**
* ✅ Follows **industry-style package organization**

---

## 📌 Project Overview  

The **Transportation Booking System** is a **Core Java console-based application** that simulates how different transportation services such as **Bus, Train, and Flight** can be managed under a single booking platform.

The project is designed using **Object-Oriented Programming (OOP)** principles where a **common parent class** represents shared transportation behavior, and **child classes** represent specific transport types. This structure mirrors **real-world travel booking platforms** where different transport services share common features but also have unique properties.

The application is intentionally kept **simple, readable, and modular**, making it perfect for beginners while still reflecting **real-world software design practices** used in enterprise systems.

---

## 🌍 Real-Life Use Case  

In real-world applications like **IRCTC**, **RedBus**, or **MakeMyTrip**:

* A **transport system** handles multiple travel options
* Each option (Bus, Train, Flight) has its own booking logic
* Common operations are shared, while specific details vary

This project follows the **same conceptual model**, implemented at an academic and learning level using Core Java.

---

## 📂 Project Structure  

```text
Transportation-Booking-System
│
├── src
│   └── Transportation
│       ├── BookingSystem.java
│       ├── Transport.java
│       ├── Bus.java
│       ├── Train.java
│       └── Flight.java
│
├── bin
│   └── Transportation
│       ├── BookingSystem.class
│       ├── Transport.class
│       ├── Bus.class
│       ├── Train.class
│       └── Flight.class
│
├── .settings
├── .classpath
└── .project
```

🧠 OOP Concepts Demonstrated
---
Concept	Usage in Project	Real-Life Mapping  
🧬 Class & Object	Transport, Bus, Train, Flight	Transport entities  
🧱 Inheritance	Bus, Train, Flight extend Transport	Shared transport behavior  
🔁 Polymorphism	Same method, different behavior	Different booking logic  
🛡️ Encapsulation	Data hidden inside classes	Secure data handling  
🧠 Abstraction	Common transport blueprint	Industry design practice  

---

Class Responsibilities
---
🔹 Transport.java (Parent / Base Class)  
Defines common transport properties.  
Acts as a blueprint for all transport types.  
Contains methods shared by Bus, Train, and Flight.  

Industry Example:  
Similar to a base service class used in travel platforms to define shared booking behavior.  


🔹 Bus.java (Child Class)  
Represents bus transportation.  
Inherits common features from Transport.  
Can define bus-specific booking behavior.  

Industry Example:  
Used by applications like RedBus to manage bus travel bookings.  

🔹 Train.java (Child Class)  
Represents railway transportation.  
Extends the Transport class.  
Simulates train booking operations.  

Industry Example:  
Comparable to IRCTC booking modules.  

🔹 Flight.java (Child Class)  
Represents air travel.  
Extends the base Transport class.  
Can include flight-specific rules.  

Industry Example:  
Similar to airline booking systems like Indigo or Air India.  

🔹 BookingSystem.java (Main Application Class)  
Entry point of the application.  
Creates objects of Bus, Train, and Flight.  
Demonstrates runtime polymorphism.  
Controls program execution flow.  

Industry Example:  
Equivalent to a controller or service launcher in backend systems.  

---

🖥️ Sample Output (Console)
---
```
------ Transportation Booking System ------
Transport Type : Bus
Booking Successful

Transport Type : Train
Booking Successful

Transport Type : Flight
Booking Successful
------------------------------------------
```
(Output may vary depending on implementation)

---

▶️ How to Run the Project
---
Clone or download the repository
Open Eclipse IDE
Import as Existing Java Project
Navigate to:
```
src → Transportation → BookingSystem.java
```
Right-click → Run As → Java Application

---

🚀 Future Enhancements
---

📌 Add user input using Scanner  
📌 Implement seat availability logic  
📌 Add ticket price calculation  
📌 Store booking data using files or database  
📌 Add cancellation functionality  
📌 Create GUI using JavaFX or Swing  
📌 Convert to web application using Spring Boot 

---


🎓 Learning Outcomes
---

Strong understanding of Java OOP fundamentals  
Clear idea of inheritance and polymorphism  
Experience designing real-world systems  
Improved confidence in Java project structure  
Interview-ready explanation of OOP concepts  
