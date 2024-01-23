package com.sathya.chat;

	import java.io.*;
	import java.net.*;

	public class ChatServer {
	    public static void main(String[] args) throws Exception {
	        try {
	            // Create a server socket and bind it to a port
	            ServerSocket serverSocket = new ServerSocket(1234);
	            System.out.println("Server started");

	            // Wait for a client to connect
	            Socket clientSocket = serverSocket.accept();
	            System.out.println("Client connected: " + clientSocket.getInetAddress().getHostName());

	            // Create input and output streams for the client socket
	            InputStream inputStream = clientSocket.getInputStream();
	            OutputStream outputStream = clientSocket.getOutputStream();
	            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
	            PrintWriter writer = new PrintWriter(outputStream, true);

	            // Read and print messages from the client
	            String message;
	            while ((message = reader.readLine()) != null) {
	                System.out.println("Client: " + message);
	                writer.println("Server received: " + message);
	            }

	            // Close the streams and sockets
	            reader.close();
	            writer.close();
	            inputStream.close();
	            outputStream.close();
	            clientSocket.close();
	            serverSocket.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


