package network.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.Socket;
import java.nio.BufferOverflowException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;

public class ChatServerThread extends Thread {
	private String nickname;
	private Socket socket;
	private List<Writer> listWriters;
	private static final String UTF_8 = "UTF_8";
	private static final char[] data = null;

	public ChatServerThread(Socket socket, List<Writer> listWriters) {
		this.socket = socket;
		this.listWriters = listWriters;
	}

	@Override
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
			Writer writer = new OutputStreamWriter(socket.getOutputStream());
		
		while(true) {
			String request = reader.readLine();
			if (request == null) {
				break;
			}
			
			String[] tokens = request.split(":");
			String command = tokens[0];
			
			if ("join".equalsIgnoreCase(tokens[0])) {
				nickname = tokens[1];
				broadcast(nickname, "님이 입장했습니다");

			} else if ("message".equalsIgnoreCase(command)) {
				String message = tokens[1];
				broadcast(nickname + ":" + message);

			} else if ("quit".equalsIgnoreCase(command)) {
				broadcast(nickname, "님이 퇴장했습니다");
				break;
			} else {
				System.out.println("[server] 알 수 없는 요청: " + request);
			}
		}

		} catch (IOException e) {
			System.out.println("[server] received: " + e.getMessage());
		}
	}
	
	private void broadcast(String nickname2, String string) {
	}

	private void broadcast(String string) {
		synchronized (listWriters) {
			for (Writer writer : listWriters) {
				try {
				PrintWriter pw = new PrintWriter(writer, true);
				pw.println(data);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
}