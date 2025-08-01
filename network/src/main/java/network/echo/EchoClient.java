package network.echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

	public static final String SERVER_IP = "127.0.0.1";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Socket Socket = null;

		try {

			Socket = new Socket();
			Socket.connect(new InetSocketAddress(SERVER_IP, EchoServer.PORT));

			PrintWriter pw = new PrintWriter(new OutputStreamWriter(Socket.getOutputStream(), "UTF-8"), true);
			BufferedReader br = new BufferedReader(new InputStreamReader(Socket.getInputStream(), "UTF-8"));

			while (true) {

				System.out.print(">> ");
				String line = scanner.nextLine();

				if ("quit".equals(line)) {
					break;
				}

				pw.println(line);
				String data = br.readLine();
				
				if(data == null) {
					log("closed by server");
					break;
			}
				
				System.out.println("<< " + data);
			}
			
			} catch (IOException e) {
			log("error: " + e);
		} finally {
			try {
				if (Socket != null && !Socket.isClosed()) {
					Socket.close();
				}
			    if(scanner != null) {
			    	scanner.close();
			    }
			} catch (IOException e) {
				e.printStackTrace();	
		}
	}
	}

	private static void log(String message) {
		System.out.println("[Echo Client] " + message);
	}
}
