package Fourth;

import java.io.*;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        connect();
    }

    public static void connect() {
        int port = 8888;
        String ip = "127.0.0.1";
        Socket clientSocket = null;

        try {
            clientSocket = new Socket(ip, port);
            System.out.println("connection established....");

            BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
            var outputStream = new ObjectOutputStream(clientSocket.getOutputStream());
            var inputStream = new ObjectInputStream(clientSocket.getInputStream());

            System.out.println("Enter your salary:");
            String clientMessage = bufferReader.readLine();

            outputStream.writeObject(clientMessage);
            while (!clientMessage.equals("q")) {

                System.out.println("Your tax: " + (String) inputStream.readObject());
                System.out.println("---------------------------");

                System.out.println("Enter your salary:");
                clientMessage = bufferReader.readLine();
                System.out.println("you've entered: " + clientMessage);
                outputStream.writeObject(clientMessage);
            }
        } catch (Exception e) {
            e.fillInStackTrace();
        } finally {
            try {
                clientSocket.close();
                System.out.println("Closed");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
