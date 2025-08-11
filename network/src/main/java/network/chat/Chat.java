package network.chat;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Chat {
	private static List<Writer> listWriter = new ArrayList<>();
	
public static void main(String[] args) {
	try(ServerSocket serverSocket = new ServerSocket(9999)) {
		System.out.println("서버 시작됨");
		
		while(true) {
			Socket socket = serverSocket.accept();
			Writer writer = new OutputStreamWriter(socket.getOutputStream());
			PrintWriter printWriter = new PrintWriter(writer, true);
			
			printWriter.println("join:ok");
			
			// 공유 리스트에 추가 (동기화 처리)
			synchronized(listWriter) {
				listWriter.add(writer);
			}
			new ChatServerThread(socket, listWriter).start();
		}
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
}
