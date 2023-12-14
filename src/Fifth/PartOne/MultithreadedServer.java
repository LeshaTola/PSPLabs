package Fifth.PartOne;

import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultithreadedServer {

    static ExecutorService executeIt = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        int port = 8080;
        try (ServerSocket serverSocket = new ServerSocket(port);) {

            System.out.println("Waiting for clients...");
            while (!serverSocket.isClosed()) {
                var clienSocket = serverSocket.accept();
                System.out.println("Client connected!");

                executeIt.execute(new ClientHandler(clienSocket));
            }
            executeIt.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
