package Fourth.SecondPart.UDPServer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        UDPClient client = new UDPClient();
        try {
            client.Connect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
