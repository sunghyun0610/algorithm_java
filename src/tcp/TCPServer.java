package tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999); //데이터 송수진 용도가 아니라 연결 대기 소켓
        System.out.println("서버 연결 오기를 기다리는중..");
        Socket socket = serverSocket.accept(); //여기서 클라이언트 요청을 기다림
        System.out.println("연결 들어옴!! 클라이언트!  클라이언트 소켓 확보");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        Scanner scanner = new Scanner(System.in);


        while(true){
            System.out.println("서버 수신: " + bufferedReader.readLine());
            System.out.print("보낼 메세지 입력: ");
            String MSG = scanner.nextLine();
            bufferedWriter.write(MSG+"\n");
            bufferedWriter.flush();

        }
    }
}


