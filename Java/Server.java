import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println("Server is listening on port 1234...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

            String messageFromClient, messageToClient;

            while (true) {
                messageFromClient = in.readLine();
                if (messageFromClient == null || messageFromClient.equalsIgnoreCase("bye")) {
                    System.out.println("Client disconnected.");
                    break;
                }
                System.out.println("Client: " + messageFromClient);

                System.out.print("You (Server): ");
                messageToClient = keyboard.readLine();
                out.println(messageToClient);
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
