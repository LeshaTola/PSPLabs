package Fourth;

import java.io.*;
import java.net.*;

public class Server {
    private void startup() {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        ObjectInputStream inputStream = null;
        ObjectOutputStream outputStream = null;

        try {

            serverSocket = new ServerSocket(8888);
            clientSocket = serverSocket.accept();
            System.out.println("connection established....");
            inputStream = new ObjectInputStream(clientSocket.getInputStream());
            outputStream = new ObjectOutputStream(clientSocket.getOutputStream());

            String message = (String) inputStream.readObject();
            while (message.equals("q")) {
                System.out.println("Received message: " + message);
                getTax(Float.parseFloat(message));
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

    private float getTax(float salary) {
        if (salary < 100000) {
            return salary * 0.5f;
        } else if (salary < 100000 && salary > 500000) {
            return salary * 0.1f;
        } else {
            return salary * 0.15f;
        }
    }

}
