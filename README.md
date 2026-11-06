# 🔐 Password Generator

A simple and customizable Random Password Generator implemented in Java and Python. This project generates random passwords based on the user's preferred character types, including uppercase letters, lowercase letters, numbers, and special symbols.

It uses Java's "SecureRandom" class and Python's "secrets" module for cryptographically secure random character selection, with a simple console-based interface.

## ✨ Features

- Generate random passwords of a user-defined length (8–64 characters).
- Include uppercase letters ("A-Z").
- Include lowercase letters ("a-z").
- Include numbers ("0-9").
- Include special symbols.
- Customize passwords by selecting the character types to include.
- Uses cryptographically secure random number generation.
- Supports both Java and Python implementations.
- Simple and beginner-friendly console interface.

## 🛠️ Technologies Used

- Java — Core programming language.
- Python — Additional implementation.
- SecureRandom — Java's secure random number generator.
- secrets — Python's secure random generation module.

## 📋 Prerequisites

Make sure you have the following installed:

- Java Development Kit (JDK), for the Java version.
- Python 3, for the Python version.
- A code editor or IDE, such as VS Code, IntelliJ IDEA, or Eclipse.
- A terminal or command prompt.

## 🚀 How to Run

### Java Version

1. Clone the repository

    `` git clone 
    https://github.com/notayushsingh/Password-Generator ``

2. Navigate to the project directory

      `` cd Password-Generator ``

3. Compile the Java program

    `` javac PasswordGenerator.java ``

4. Run the program

    `` java PasswordGenerator ``

### Python Version

1. Navigate to the project directory.

2. Run the Python program

     `` python password_generator.py ``

Follow the on-screen instructions to generate your password.

## ⚙️ How It Works

1. The program asks the user for the desired password length.
2. The user selects which character types to include.
3. The program builds a character pool based on the selected options.
4. A secure random generator selects characters from the available pool.
5. The generated password is displayed in the console.

## 📚 What I Learned

Through this project, I practiced:

- Java and Python fundamentals.
- Taking user input and handling invalid inputs.
- Using conditional statements and Boolean values.
- Generating secure random values.
- Working with strings and character sets.
- Organizing code into reusable functions and methods.
- Implementing the same program logic in two different programming languages.
- Building practical console-based applications.

## 🔮 Future Improvements

- Guarantee at least one character from every selected character category.
- Add a graphical user interface (GUI).
- Allow users to copy generated passwords to the clipboard.
- Add password strength estimation.

## 🔒 Security Note

This project uses Java's "SecureRandom" and Python's "secrets" module for secure random generation. However, password security also depends on password length, character selection, implementation details, and how the password is stored or shared.

## 📄 License

This project is licensed under the MIT License. See the LICENSE file for details.
