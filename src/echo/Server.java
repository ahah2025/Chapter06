package echo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

//천호동
public class Server {

	public static void main(String[] args)throws IOException{
		
		//서버소켓생성
		ServerSocket serverSocket = new ServerSocket();
		
		//bind 	ip : 192.168.0.66 	 port : 10101
		serverSocket.bind(new InetSocketAddress("192.168.0.66", 10101));
		
		//서버시작
		System.out.println("<서버시작>");
		System.out.println("==============================");
		System.out.println("[연결을 기다리고 있습니다.]");
	
		//클라이언트가 연결되면 메소드accept() 실행 된다
		//socket 종이컵전화기
		Socket socket = serverSocket.accept();
		System.out.println("[클라이언트가 연결 되었습니다.]");
		
		
		
		
		
		
		
		
		
		System.out.println("===================================");
		System.out.println("<서버 종료>");
		
		//자원정리
		socket.close();
		serverSocket.close();
	}

}
