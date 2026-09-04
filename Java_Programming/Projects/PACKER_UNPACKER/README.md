# File Packer & Unpacker

## 📌 Project Overview

File Packer & Unpacker is a Java-based file handling project that combines multiple files into a single packed file and extracts them back when required.

The Packer stores each file with a fixed-size header containing the file name and file size, followed by the original file data.

The Unpacker reads the packed file, extracts the header information, and recreates the original files.

This project demonstrates practical concepts of Java File Handling, Byte Streams, and File I/O.

---

## 🚀 Features

* Pack multiple files into a single file
* Unpack files from the packed file
* Store file name and file size in a 100-byte header
* Use `FileInputStream` and `FileOutputStream`
* Use byte buffers for file processing
* Handle files using Java File I/O
* Preserve original file data during packing and unpacking

---

## 🛠️ Technologies Used

* **Programming Language:** Java
* **Concepts:**

  * File Handling
  * FileInputStream
  * FileOutputStream
  * Byte Streams
  * Buffer
  * Exception Handling
  * Scanner
  * Directory and File Management

---

## 📂 Project Structure

```text
File-Packer-Unpacker
│
├── program732.java
├── program733.java
└── README.md
```

---

## 📦 File Packer

The File Packer reads files from a specified folder and stores them into a single packed file.

### Packer File

```text
program732.java
```

### How Packer Works

1. Accepts the folder name from the user.
2. Accepts the packed file name.
3. Checks whether the folder exists.
4. Reads all files from the folder.
5. Creates a 100-byte header for each file.
6. Stores the file name and file size in the header.
7. Writes the header into the packed file.
8. Reads the original file data.
9. Writes the file data into the packed file.
10. Repeats the process for all files.

---

## 🔓 File Unpacker

The File Unpacker reads the packed file and recreates the original files.

### Unpacker File

```text
program733.java
```

### How Unpacker Works

1. Accepts the packed file name.
2. Reads the packed file sequentially.
3. Reads the 100-byte header.
4. Extracts the original file name.
5. Extracts the original file size.
6. Reads the required number of bytes.
7. Creates the original file.
8. Writes the extracted data into the file.
9. Repeats the process until all files are extracted.

---

## 📋 Header Format

Each packed file contains a fixed **100-byte header**.

Example:

```text
A.txt 120
```

The header contains:

```text
[File Name] [File Size] [Padding Spaces]
```

The remaining bytes are filled with spaces so that every header has exactly 100 bytes.

---

## 🔄 Packing Process

```text
Input Folder
     │
     ▼
Read Files
     │
     ▼
Create 100-Byte Header
     │
     ▼
Write Header
     │
     ▼
Read File Data
     │
     ▼
Write File Data
     │
     ▼
Packed File
```

---

## 🔄 Unpacking Process

```text
Packed File
     │
     ▼
Read 100-Byte Header
     │
     ▼
Extract File Name
     │
     ▼
Extract File Size
     │
     ▼
Read File Data
     │
     ▼
Create Original File
     │
     ▼
Extracted Files
```

---

## ▶️ How to Run

### Compile Packer

```bash
javac program732.java
```

### Run Packer

```bash
java program732
```

### Compile Unpacker

```bash
javac program733.java
```

### Run Unpacker

```bash
java program733
```

---

## 💻 Example

Suppose the input folder contains:

```text
Test
│
├── A.txt
├── B.txt
└── C.txt
```

After running the Packer:

```text
MyData.pak
```

is created.

The packed file contains:

```text
[Header][A.txt Data]
[Header][B.txt Data]
[Header][C.txt Data]
```

Running the Unpacker recreates:

```text
A.txt
B.txt
C.txt
```

---

## 🧠 Concepts Demonstrated

### File Handling

Java's `File` class is used to:

* Check folder existence
* Check whether an item is a file
* Get file names
* Get file sizes
* List files inside a directory

### FileInputStream

Used to read data from files.

### FileOutputStream

Used to create and write data into the packed and extracted files.

### Byte Buffer

A byte array is used for efficient file reading and writing.

```java
byte Buffer[] = new byte[1024];
```

### Header Management

A fixed 100-byte header stores the file name and file size.

---

## 🎯 Learning Outcomes

Through this project, I learned:

* Java File Handling
* FileInputStream and FileOutputStream
* Byte Stream programming
* Reading and writing binary data
* Directory and file management
* Buffer-based file processing
* Header-based file storage
* Exception handling
* File packing and unpacking

---

## 🔮 Future Enhancements

* Add file compression
* Add encryption
* Add password protection
* Add GUI interface
* Add progress indication
* Support nested directories
* Add file integrity verification

---

## 👩‍💻 Author

**Vaishnavi Kadam**

B.Tech Computer Engineering
Vishwakarma Institute of Information Technology, Pune

---

## ⭐ Project Highlights

**Project:** File Packer & Unpacker

**Language:** Java

**Packer:** `program732.java`

**Unpacker:** `program733.java`

**Type:** File Handling / System Programming

**Main Concepts:** File I/O, Byte Streams, FileInputStream, FileOutputStream, Buffer Management, Header Management
