package UDP;

import java.io.IOException;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket=new DatagramSocket();
        System.out.println("Client Startded...");

        //sent massage
        String msg="hello I am Ashik";
        byte b[]=msg.getBytes();
        InetAddress inetAddress=InetAddress.getByName("localhost");
        DatagramPacket dpac=new DatagramPacket(b,b.length,inetAddress,1122);
        datagramSocket.send(dpac);
        System.out.println("Packet is Sent...");

        //receiving part
        byte b1[]=new byte[1000];
        DatagramPacket datagramPacket=new DatagramPacket(b1,b1.length);
        datagramSocket.receive(datagramPacket);
        String receiveServerMsg=new String(datagramPacket.getData(),0, datagramPacket.getLength());
        System.out.println("Received message: "+receiveServerMsg);
        datagramSocket.close();


    }
}
