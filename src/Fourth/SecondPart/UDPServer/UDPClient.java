package Fourth.SecondPart.UDPServer;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient {
    private final static int PORT = 8888;
    private final static String IP = "127.0.0.1";

    private DatagramSocket socket;
    Scanner scanner = new Scanner(System.in);

    public void Connect() throws IOException {

        socket = new DatagramSocket();

        System.out.println("Conected...");
        while (!socket.isClosed()) {
            System.out.println("1) Calculate result" +
                    "\n2) Save last calculation" +
                    "\n3) Exit");
            int index = Integer.parseInt(scanner.nextLine());

            switch (index) {
                case 1:
                    var message = "Calc ";
                    message += getVars();
                    SendMesage(message, InetAddress.getByName(IP), PORT);
                    break;
                case 2:
                    SendMesage("Save", InetAddress.getByName(IP), PORT);
                    break;
                case 3:
                    SendMesage("Exit", InetAddress.getByName(IP), PORT);
                    System.out.println("Server was closed");
                    scanner.close();
                    socket.close();
                    return;
                default:
                    System.out.println("Unknown function");
                    break;
            }

            String receivedMessage = receiveMessage();
            System.out.println("Server send: " + receivedMessage);
        }

    }

    private void SendMesage(String message, InetAddress address, int port) throws IOException {
        DatagramPacket packetToSend = new DatagramPacket(message.getBytes(), message.length(), address, port);
        socket.send(packetToSend);
    }

    private String receiveMessage() throws IOException {
        var buf = new byte[256];
        DatagramPacket packetToReceive = new DatagramPacket(buf, buf.length);
        socket.receive(packetToReceive);
        return new String(packetToReceive.getData()).trim();
    }

    private String getVars() throws IOException {
        var vars = "";
        System.out.print("x: ");
        vars += scanner.nextLine() + " ";
        System.out.print("y: ");
        vars += scanner.nextLine() + " ";
        System.out.print("z: ");
        vars += scanner.nextLine() + " ";
        return vars;
    }
}
