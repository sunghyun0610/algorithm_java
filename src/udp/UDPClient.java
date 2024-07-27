package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

public class UDPClient {
    public static void main(String[] args) throws SocketException {
        DatagramSocket sendSocket = new DatagramSocket();
        String msg= "안녕하세요 문성현입니다.";
        byte[] buf = msg.getBytes(StandardCharsets.UTF_8);
        DatagramPacket sendPacket = new DatagramPacket(buf,buf.length,new InetSocketAddress("127.0.0.1",9999));
        System.out.println("데이터를 송신합니다.");


    }
}
