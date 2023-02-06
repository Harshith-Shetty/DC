import java.net.*;

class UDPServer {

	public static DatagramSocket mySocket;
	public static byte myBuffer[] = new byte[2000];

	public static void serverMethod() throws Exception
	{
		int position = 0;
		while (true) {
			int charData = System.in.read();
			switch (charData) {
			case -1:
				System.out.println(
					"The execution of "
					+ "the server has been terminated");
				return;
			case '\r':
				break;
			case '\n':
				mySocket.send(
					new DatagramPacket(
						myBuffer,
						position,
						InetAddress.getLocalHost(),
						1777));
				position = 0;
				break;
			default:
				myBuffer[position++]
					= (byte)charData;
			}
		}
	}
	public static void main(String args[]) throws Exception
	{
		System.out.println("Server:");
		mySocket = new DatagramSocket(1888);
		serverMethod();
	}
}
