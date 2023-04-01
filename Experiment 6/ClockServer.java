import java.io.*;
import java.net.*;
import java.util.*;
public class ClockServer {
  public static void main(String[] args) throws IOException {
    String port;
    BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the port no : ");
    port = stdIn.readLine();
    int portNumber = Integer.parseInt(port);
    try (
      ServerSocket serverSocket = new ServerSocket(portNumber); Socket clientSocket = serverSocket.accept(); PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true); BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));) {
      String inputLine;
      System.out.println("Server Started");
      while (true) {
        inputLine = in.readLine();
        if (inputLine.equalsIgnoreCase("Exit")) {
          System.out.println("Exiting");
          out.println("Server Exiting");
          break;
        }
        out.println(System.currentTimeMillis() + 5000);
      }
    } catch (IOException e) {

      System.out.println("Exception caught when trying to listen on port" + portNumber + " or listening for a connection");
      System.out.println(e.getMessage());
    }
  }
}