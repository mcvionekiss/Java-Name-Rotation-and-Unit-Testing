# Java Name Rotation and Unit Testing

This project demonstrates foundational Java programming concepts combined with **unit testing using JUnit 5**.  
It defines a simple `JaceyDeng` class that manages basic user information and implements a string rotation algorithm, verified through automated tests.

---

## 🧩 Overview

The goal of this project is to show clean class design, string manipulation, and test-driven development principles in Java.  
It includes:
- Encapsulated class fields for user identity.
- Getter methods for each field.
- A string rotation method that supports both left and right rotations with wrap-around behavior.
- Comprehensive JUnit 5 tests validating all methods and edge cases.

---

## 🧠 Features

- **Full Name Handling:**  
  Combines first and last names into a single formatted string.
- **Identity Accessors:**  
  Returns first name, last name, UCInetID, and student number individually.
- **String Rotation:**  
  Rotates the full name by a specified number of characters:
  - Positive values rotate left.
  - Negative values rotate right.
  - Wrap-around behavior preserves all characters.

Example:
```java
JaceyDeng j = new JaceyDeng("Peter", "Anteater", "panteater", 12345678);
System.out.println(j.getRotatedFullName(2));   // ter AnteaterPe
System.out.println(j.getRotatedFullName(-5));  // eaterPeter Ant
```

---

## 🧪 Testing

All tests are implemented with JUnit Jupiter (JUnit 5) in TestJaceyDeng.java.

Test Coverage
Method	Description	Test Case
getFullName()	Returns combined name	✅ testGetFullName()
getFirstName()	Returns first name	✅ testGetFirstName()
getLastName()	Returns last name	✅ testGetLastName()
getUCInetID()	Returns UCInetID	✅ testGetUCInetID()
getStudentNumber()	Returns numeric ID	✅ testGetStudentNumber()
getRotatedFullName(int shift)	Rotation (positive)	✅ testPositiveGetRotatedFullName()
getRotatedFullName(int shift)	Rotation (negative)	✅ testNegativeGetRotatedFullName()

All seven test cases pass successfully in IntelliJ IDEA (JUnit 5 environment).

---

## 🧰 Tech Stack

Language: Java 17

Testing Framework: JUnit 5 (Jupiter)

IDE: IntelliJ IDEA
