import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 1234)) {
            System.out.println("Connected to server!");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

            String messageToServer, messageFromServer;

            while (true) {
                System.out.print("You (Client): ");
                messageToServer = keyboard.readLine();
                out.println(messageToServer);
                if (messageToServer.equalsIgnoreCase("bye")) {
                    System.out.println("Disconnected from server.");
                    break;
                }

                messageFromServer = in.readLine();
                System.out.println("Server: " + messageFromServer);
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
