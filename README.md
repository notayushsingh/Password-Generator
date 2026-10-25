# 🔐 Java Password Generator

A simple and customizable **Random Password Generator** built using Java. This project generates random passwords based on the user's preferred character types, including uppercase letters, lowercase letters, numbers, and special symbols.

It uses Java's `SecureRandom` class to generate random characters and provides a simple console-based interface for creating passwords.

## ✨ Features

-  Generate random passwords of a user-defined length.
-  Include uppercase letters (`A-Z`).
-  Include lowercase letters (`a-z`).
-  Include numbers (`0-9`).
-  Include special symbols.
-  Customize passwords by selecting the character types to include.
-  Uses Java's `SecureRandom` for cryptographically strong random number generation.
-  Simple and beginner-friendly console interface.

## 🛠️ Technologies Used

- **Java** — Core programming language.
- **SecureRandom** — Generates cryptographically strong random values.

## 📋 Prerequisites

Make sure you have the following installed:

- Java Development Kit (JDK)
- A code editor or IDE, such as VS Code, IntelliJ IDEA, or Eclipse
- A terminal or command prompt

## 🚀 How to Run

### 1. Clone the repository

```bash
git clone https://github.com/notayushsingh/Password-Generator
```

Replace `https://github.com/notayushsingh/Password-Generator` with your actual GitHub repository URL.

### 2. Navigate to the project directory

```bash
cd java-password-generator
```

### 3. Compile the Java program

```bash
javac PasswordGenerator.java
```

### 4. Run the program

```bash
java PasswordGenerator
```

Follow the on-screen instructions to generate your password.

## ⚙️ How It Works

1. The program asks the user for the desired password length.
2. The user selects which character types to include.
3. The program builds a character pool based on the selected options.
4. `SecureRandom` selects random characters from the available pool.
5. The generated password is displayed in the console.

## 📸 Eaxmple

```text
===== Random Password Generator =====

Enter password length: 12
Include uppercase letters? true
Include lowercase letters? true
Include numbers? true
Include symbols? true

Generated Password: aB7@kP2#mX9!
```

*Note: The example password is illustrative. Your program's actual prompts and output may differ.*

## 📚 What I Learned

Through this project, I practiced:

- Java fundamentals and methods.
- Taking user input with `Scanner`.
- Using conditional statements and Boolean parameters.
- Generating random values with `SecureRandom`.
- Working with strings and character sets.
- Organizing code into reusable methods.
- Building a practical console-based application.

## 🔮 Future Improvements

- Guarantee at least one character from every selected character category.
- Add a graphical user interface (GUI).
- Allow users to copy generated passwords to the clipboard.
- Add password strength estimation.

## 🔒 Security Note

This project uses `SecureRandom` to generate random characters. However, password security also depends on password length, character selection, implementation details, and how the password is stored or shared.

## License

This project is licensed under the MIT License. See the LICENSE file for details
