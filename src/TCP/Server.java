package TCP;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(1234);
        while(true){
            Socket socket=serverSocket.accept();
            System.out.println("Connection established...");

            //sending/write msg(outstram)
            PrintStream printStream=new PrintStream(socket.getOutputStream());

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter massege to be sent: ");
            String msg=sc.nextLine();
            printStream.print(msg);
            socket.close();
        }

    }

}
