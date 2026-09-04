# Customised Virtual File System (CVFS)

## 📌 Project Overview

Customised Virtual File System (CVFS) is a C-based system programming project that simulates the core concepts of a UNIX-like file system.

The project implements virtual file management using data structures such as Inode Table, File Table, User File Descriptor Table, Super Block, and Data Blocks.

It provides various file operations for creating, opening, reading, writing, and managing files within the virtual file system.

---

## 🚀 Features

* Simulates a UNIX-like virtual file system
* Implements file and memory management concepts
* Maintains an Inode Table for file information
* Maintains a File Table for opened files
* Implements User File Descriptor Table
* Manages Super Block and Data Blocks
* Supports multiple file operations
* Provides command-based interaction

---

## 🛠️ Technologies Used

* **Language:** C
* **Domain:** System Programming
* **Concepts:**

  * Operating System Concepts
  * File System Management
  * Data Structures
  * Memory Management
  * File Descriptors
  * Inode Management
  * UNIX File System Concepts

---

## 📂 File System Components

The CVFS consists of the following major components:

### Inode Table

Stores metadata and information related to files.

### File Table

Maintains information about currently opened files.

### User File Descriptor Table

Maintains file descriptors associated with user-level file operations.

### Super Block

Stores information about the overall virtual file system, including available resources.

### Data Blocks

Used to store the actual contents of files.

---

## 📋 Supported File Operations

| Operation | Description                                  |
| --------- | -------------------------------------------- |
| `Create`  | Creates a new file                           |
| `Open`    | Opens an existing file                       |
| `Close`   | Closes an opened file                        |
| `Read`    | Reads data from a file                       |
| `Write`   | Writes data into a file                      |
| `Lseek`   | Changes the file offset                      |
| `RM`      | Removes a file                               |
| `LS`      | Lists available files                        |
| `Stat`    | Displays file information                    |
| `Fstat`   | Displays information using a file descriptor |

---

## 🔄 Architecture

```text
                Customised Virtual File System
                           │
              ┌────────────┴────────────┐
              │                         │
          Super Block              Data Blocks
              │                         │
              └────────────┬────────────┘
                           │
                      Inode Table
                           │
                      File Table
                           │
               User File Descriptor Table
                           │
                    File Operations
                           │
        ┌──────┬──────┬──────┬──────┬──────┐
      Create  Open  Read  Write  Lseek   RM
                           │
                         LS
                       Stat/Fstat
```

---

## ▶️ How to Run

### Compile

```bash
gcc cvfs.c -o cvfs
```

### Run

```bash
./cvfs
```

> Replace `cvfs.c` with the actual C source file name in your repository.

---

## 🎯 Learning Outcomes

Through this project, I gained practical understanding of:

* UNIX file system architecture
* Operating System file management
* Inode and file descriptor concepts
* File allocation and data block management
* System-level programming in C
* Data structures used in file systems
* File operations and file offsets
* Memory and resource management

---

## 🔮 Future Enhancements

* Add directory support
* Implement file permissions
* Add user authentication
* Support hierarchical directory structures
* Improve error handling
* Add persistent storage
* Provide a graphical interface

---

## 👩‍💻 Author

**Vaishnavi Kadam**

B.Tech Computer Engineering
Vishwakarma Institute of Information Technology, Pune

---

## ⭐ Project Highlights

**Project:** Customised Virtual File System (CVFS)
**Language:** C
**Domain:** System Programming
**Concepts:** Operating Systems, UNIX File System, Inode, File Table, File Descriptors, Data Blocks

