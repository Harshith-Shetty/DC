Inter-process communication using TCP & UDP
Introduction
This experiment focuses on the comparison and demonstration of Inter-Process Communication (IPC) using both Transmission Control Protocol (TCP) and User Datagram Protocol (UDP) in Java programming language. This experiment covers the implementation of both one-way and two-way communication using TCP and UDP.

TCP & UDP
Sockets and its basic primitives
Sockets are a low-level programming construct that allows processes to communicate with each other across a network. They act as a communication endpoint for sending and receiving data between processes. Sockets are a combination of IP addresses and port numbers that provide a unique identity to each process communicating over a network. The basic primitives of sockets include functions for creating, connecting, listening, reading, writing, and closing sockets.

Comparison between TCP & UDP
TCP and UDP are two widely used protocols for data transmission over a network. The main difference between them lies in the way they handle data transmission:

TCP (Transmission Control Protocol):

Provides reliable, ordered, and error-checked data transmission.
Uses a flow control mechanism to prevent the sender from overwhelming the receiver.
A three-way handshake is used to establish a connection and ensure that the data is transmitted reliably.
Suitable for applications that require guaranteed delivery of data, such as email and file transfer.
UDP (User Datagram Protocol):

Does not guarantee reliable delivery of data.
Does not use flow control and does not have a mechanism for retransmission of lost packets.
Suitable for applications that do not require guaranteed delivery of data, such as real-time video and audio streaming.
Offers lower overhead and higher performance compared to TCP.
Experiment Details
This experiment includes the implementation of both one-way and two-way communication using TCP and UDP in Java programming language. The one-way communication involves a single process sending data to another process, while the two-way communication involves bidirectional data transmission between two processes.

Conclusion
This experiment helps to understand the differences between TCP and UDP and their suitability for different types of applications. It also highlights the importance of choosing the right protocol for a particular application based on its data transmission requirements.