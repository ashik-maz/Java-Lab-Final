package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket dsoc=new DatagramSocket(1122);
        System.out.println("Server Started...");

        //receiving part
        byte b[]=new byte[1000];
        DatagramPacket datagramPacket=new DatagramPacket(b,b.length);
        dsoc.receive(datagramPacket);
        String receivingMsg=new String(datagramPacket.getData(),0,datagramPacket.getLength());

        System.out.println("received Data: "+receivingMsg);

        //sending part
        String serverMsg="Hi, I am Server...";
        byte b1[]=serverMsg.getBytes();
        InetAddress inetAddress=InetAddress.getLocalHost();
        DatagramPacket datagramPacket1=new DatagramPacket(b1,b1.length,inetAddress,datagramPacket.getPort());
        dsoc.send(datagramPacket1);
        System.out.println("message sent...");
        dsoc.close();



    }
}
