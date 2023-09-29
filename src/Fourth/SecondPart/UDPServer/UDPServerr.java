package Fourth.SecondPart.UDPServer;

import java.net.*;
import java.io.*;

public class UDPServerr {

    public static void main(String[] args) {
        try {
            startup();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void startup() throws IOException {
        int port = 8888;

        double x = 0;
        double y = 0;
        double z = 0;
        double res = 0;

        DatagramSocket socket = new DatagramSocket(port);
        String message = "";

        while (!socket.isClosed()) {
            DatagramPacket packet = receivedMessage(socket);
            String receivedMessage = new String(packet.getData()).trim();
            System.out.println("Client send: " + receivedMessage);

            var params = receivedMessage.split(" ");
            var index = params[0];
            switch (index) {
                case "Calc":
                    x = Double.parseDouble(params[1]);
                    y = Double.parseDouble(params[2]);
                    z = Double.parseDouble(params[3]);
                    res = calulate(x, y, z);

                    message = Double.toString(res);
                    break;
                case "Save":
                    File file = new File("Last result.txt");
                    PrintWriter writer = new PrintWriter(file);
                    String lastExpression = ("x: " + x + " y: " + y + " z: " + z + " res: " + res);
                    writer.println(lastExpression);
                    writer.close();
                    message = "Saved";
                    System.out.println("Saved");
                    break;
                case "Exit":
                    System.out.println("Server is Closed");
                    socket.close();
                    return;
                default:
                    System.out.println("Unknown function");
                    message = "Unknown function";
                    break;
            }

            sendMessage(socket, message, packet.getAddress(), packet.getPort());
        }

    }

    private static void sendMessage(DatagramSocket socket, String message, InetAddress address, int port)
            throws IOException {

        DatagramPacket packetToSend = new DatagramPacket(message.getBytes(), message.length(), address, port);
        socket.send(packetToSend);
    }

    private static DatagramPacket receivedMessage(DatagramSocket socket)
            throws IOException {
        var buf = new byte[256];
        var packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);
        return packet;
    }

    public static double calulate(double x, double y, double z) {
        double result;
        result = (2 * Math.cos(x - Math.PI / 6)) / (Math.exp(0.5f) + Math.sin(y) * Math.sin(y))
                * (1 + (z * z) / (3 - Math.pow(z, 5) / 5));
        return result;
    }
}
