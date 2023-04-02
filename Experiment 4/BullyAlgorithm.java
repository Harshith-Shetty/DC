import java.util.*;

public class BullyAlgorithm {
    private static int numProcesses; // number of processes in the system
    private static int coordinator; // coordinator process ID
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of processes in the system: ");
        numProcesses = scanner.nextInt();
        int[] processIDs = new int[numProcesses];
        for (int i = 0; i < numProcesses; i++) {
            processIDs[i] = i + 1; // process IDs start from 1
        }
        System.out.println("The processes in the system are: " + Arrays.toString(processIDs));
        System.out.print("Enter the ID of the process that initiates the election: ");
        int initiator = scanner.nextInt();
        bullyAlgorithm(initiator, processIDs);
        scanner.close();
    }
    
    private static void bullyAlgorithm(int initiator, int[] processIDs) {
        System.out.println("Election initiated by process " + initiator);
        coordinator = initiator;
        for (int i = initiator + 1; i <= numProcesses; i++) {
            System.out.println("Sending election message from process " + initiator + " to process " + i);
        }
        for (int i = initiator + 1; i <= numProcesses; i++) {
            if (processIDs[i - 1] > initiator) {
                System.out.println("Waiting for OK message from process " + i);
                // wait for OK message from higher priority processes
                // simulate delay using Thread.sleep
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (new Random().nextBoolean()) { // simulate message loss
                    System.out.println("OK message from process " + i + " not received");
                    continue;
                } else {
                    System.out.println("OK message received from process " + i);
                    coordinator = processIDs[i - 1];
                    break;
                }
            }
        }
        System.out.println("Coordinator process is process " + coordinator);
        // send message to all lower priority processes to update their coordinator
        for (int i = 1; i < initiator; i++) {
            System.out.println("Sending coordinator message from process " + coordinator + " to process " + i);
        }
    }
}
