import java.io.*;
import java.net.*;

public class ServerSocketTCP
{
 public static void main(String args[]) throws Exception
 {
  System.out.println("Server Started......\n");
  ServerSocket ss = new ServerSocket(8888);
  System.out.println("Waiting for Client request\n");
  Socket s = ss.accept();
  System.out.println("Connected to Client\n");
  BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
  String str = br.readLine();
  System.out.println("Client Data : " + str);
 }
}