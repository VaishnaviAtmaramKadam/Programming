
# 📚 Study Tracker

A console-based Java application designed to help users record, manage, and analyze their daily study activities. The application allows users to maintain study logs, view records, export data to CSV, and generate study summaries based on date and subject.

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Collections Framework
- ArrayList
- TreeMap
- Java I/O
- CSV File Handling
- Java Time API

## ✨ Features

- Add new study logs
- View all recorded study logs
- Export study records to a CSV file
- Generate study duration summary by date
- Generate study duration summary by subject
- Automatic date recording using `LocalDate`
- Simple menu-driven console interface
⚙️ How It Works

The application provides a menu-driven interface with the following options:

Insert New Study Log
Records the subject, study duration, and description of the study session.
View All Study Logs
Displays all previously recorded study sessions.
Export Study Log to CSV
Exports the recorded study data into a CSV file.
Summary by Date
Calculates the total study duration for each date.
Summary by Subject
Calculates the total study duration for each subject.
Exit
Closes the application.
▶️ How to Run
Step 1: Compile the Program

Open the terminal in the project directory and run:

javac program867.java
Step 2: Run the Application
java program867
Step 3: Use the Menu

After running the application, the following menu will be displayed:

1: Insert new study log
2: View all study logs
3: Export study log to CSV
4: Summary of study log by date
5: Summary of study log by subject
6: Exit the application

Select the required option by entering its corresponding number.

📊 Example
Subject: Java
Duration: 2.5
Description: Practiced Java Collections

The application can generate summaries such as:

Date: 2026-09-04
Total study duration: 2.5

and:

Subject: Java
Total study duration: 2.5

💾 CSV Export
The application allows study records to be exported into a CSV file containing:
Date,Subject,Duration of Study,Description of Study
This makes the study data easy to store and analyze using spreadsheet applications.

🧠 Concepts Demonstrated
Object-Oriented Programming
Classes and Objects
Encapsulation
ArrayList
TreeMap
Iteration and Data Processing
File Handling
CSV Data Export
Exception Handling
LocalDate and Java Time API
Menu-Driven Programming

🚀 Future Enhancements
Add persistent database storage
Add update and delete functionality
Add weekly and monthly study reports
Add graphical statistics
Add user authentication
Develop a GUI or web-based version


👩‍💻 Author

Vaishnavi Kadam

