package simple_networking;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(2222);
        System.out.println("Server Started...");

        while(true) {
            Socket socket = serverSocket.accept();
            System.out.println("Client Connected...");
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

            try {
                Object Msg = ois.readObject();
                System.out.println("From Client: " + (String) Msg);

                String serverMsg = ((String) Msg).toUpperCase();

                //Write to client
                oos.writeObject(serverMsg);


            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
