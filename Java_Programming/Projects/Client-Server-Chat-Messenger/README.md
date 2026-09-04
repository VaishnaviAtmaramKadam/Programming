# 💬 Client-Server Chat Messenger

A simple console-based chat application developed using Java Socket Programming. This project demonstrates communication between a client and a server using TCP/IP.

## 🛠️ Technologies Used

- Java
- Socket Programming
- TCP/IP
- Java I/O

## 🌟 Features

- Client-server communication using sockets
- Two-way message communication
- TCP/IP based reliable communication
- Server listens for client connections on port `2100`
- Client can send messages to the server
- Server can send responses back to the client
- Chat can be terminated using the `end` command

## 📁 Project Structure

```text
Client-Server-Chat-Messenger/
│
├── ChatClient.java
├── ChatServer.java
├── README.md

⚙️ How It Works
The server starts and listens on port 2100.
The client connects to the server using localhost:2100.
The client sends a message to the server.
The server receives the message.
The server sends a response back to the client.
The communication continues until the client enters end.
▶️ How to Run
1. Compile the Server
javac ChatServer.java
2. Compile the Client
javac ChatClient.java
3. Start the Server

Open Terminal 1 and run:

java ChatServer

The server will start and wait for a client connection on port 2100.

4. Start the Client

Open Terminal 2 and run:

java ChatClient

The client will connect to the server.

5. Start Chatting

Example:

Client: hi
Server: hello
Client: how are you
Server: i am fine

To terminate the chat, enter:

end
🖥️ Output Screenshots
Client Terminal
<img width="1095" height="517" alt="Screenshot 2026-09-04 153957" src="https://github.com/user-attachments/assets/aee6edd6-62c0-45ee-9097-ac4c895d4b0f" />

Server Terminal
<img width="972" height="487" alt="image" src="https://github.com/user-attachments/assets/cb2066b8-ec1b-4b62-b2a2-f54d8b71f03a" />

🎯 Concepts Demonstrated
Client-Server Architecture
Socket Programming
TCP/IP Communication
Network Communication
Java Input/Output Streams
Exception Handling
👩‍💻 Author

Vaishnavi Kadam
