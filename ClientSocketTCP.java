import java.util.*;
import java.net.*;
import java.io.*;
import java.net.InetAddress;

public class ClientSocketTCP
{
 public static void main(String args[]) throws Exception
 {
  Scanner input  = new Scanner(System.in);
  String ip = "localhost";
  int port = 8888;
  Socket client_socket = new Socket(ip,port);
  InetAddress localhost = InetAddress.getLocalHost();
  String msg = "Client Here.......\n";
  OutputStreamWriter os = new OutputStreamWriter(client_socket.getOutputStream());
  PrintWriter out = new PrintWriter(os);
  os.write(msg);
  os.flush();
 }
}