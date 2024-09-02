package TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("localhost",1234);
        System.out.println("Connection Request Sent...");

        //Read/Receving massage
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String msg=bufferedReader.readLine();
        System.out.println("Received message from server :"+msg);
        socket.close();

    }
}
