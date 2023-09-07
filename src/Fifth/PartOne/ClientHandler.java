package Fifth.PartOne;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientHandler implements Runnable {

    private static Socket clienSocket;

    ClientHandler(Socket clientSocket) {
        ClientHandler.clienSocket = clientSocket;
    }

    @Override
    public void run() {

        ObjectInputStream inputStream = null;
        ObjectOutputStream outputStream = null;

        try {
            inputStream = new ObjectInputStream(clienSocket.getInputStream());
            outputStream = new ObjectOutputStream(clienSocket.getOutputStream());

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
                inputStream.close();
                outputStream.close();

                clienSocket.close();
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
