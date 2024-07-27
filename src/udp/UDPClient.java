package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket sendSocket = new DatagramSocket();
        String msg= "";
        byte[] buf = msg.getBytes(StandardCharsets.UTF_8);
        DatagramPacket sendPacket = new DatagramPacket(buf,buf.length,new InetSocketAddress("59.27.84.200",8888));
        System.out.println("데이터를 송신합니다.");
        sendSocket.send(sendPacket);


    }
}
