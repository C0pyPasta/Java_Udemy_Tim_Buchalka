import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        //Sockets range from 0 to 65535
        try(ServerSocket serverSocket = new ServerSocket(5000)) {

            while(true) {
//                Socket socket = serverSocket.accept();
//                Echoer echoer = new Echoer(socket);
//                echoer.start();

                //Equivalent of the above on one row
                new Echoer(serverSocket.accept()).start();
            }

        } catch (IOException e) {
            System.out.println("Server exception " + e.getMessage());
        }
    }
}