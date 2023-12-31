package Fourth;

import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) {
        startup();
    }

    public static void startup() {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        ObjectInputStream inputStream = null;
        ObjectOutputStream outputStream = null;

        try {
            serverSocket = new ServerSocket(8888);
            System.out.println("Waiting for clients...");
            clientSocket = serverSocket.accept();
            System.out.println("Client connected!");
            inputStream = new ObjectInputStream(clientSocket.getInputStream());
            outputStream = new ObjectOutputStream(clientSocket.getOutputStream());

            String message = (String) inputStream.readObject();
            while (!message.equals("q")) {
                System.out.println("Received message: " + message);
                var tax = getTax(Float.parseFloat(message));
                outputStream.writeObject(String.valueOf(tax));
                message = (String) inputStream.readObject();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                serverSocket.close();
                clientSocket.close();
                inputStream.close();
                outputStream.close();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static float getTax(float salary) {
        if (salary < 100000) {
            return salary * 0.05f;
        } else if (salary < 100000 && salary > 500000) {
            return salary * 0.1f;
        } else {
            return salary * 0.15f;
        }
    }
}
