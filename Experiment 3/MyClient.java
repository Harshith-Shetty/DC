import java.rmi.*;
import java.util.*;
public class MyClient {
  public static void main(String args[]) {
    try {
      int n1=0,n2=0;
      Adder stub = (Adder) Naming.lookup("rmi://localhost:5000/sonoo");
      System.out.println("Enter the Number 1");
      n1=sc.nextInt();
      System.out.println("Enter the Number 2");
      n2=sc.nextInt();
      System.out.println("Addition = "+(stub.add(n1, n2)));

    } catch (Exception e) {}
  }
}