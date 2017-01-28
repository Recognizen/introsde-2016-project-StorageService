package lifecoach.storageservice.soap.endpoint;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URISyntaxException;

import javax.xml.ws.Endpoint;

import lifecoach.storageservice.soap.ws.StorageImpl;

public class StoragePublisher {
    public static void main(String[] args) throws IllegalArgumentException, IOException, URISyntaxException{
        String PROTOCOL = "http://";
        String HOSTNAME = InetAddress.getLocalHost().getHostAddress();
        if (HOSTNAME.equals("127.0.0.1"))
        {
            HOSTNAME = "localhost";
        }
        String PORT = "6903";
        String BASE_URL = "/ws/storage";

        if (String.valueOf(System.getenv("PORT")) != "null"){
            PORT=String.valueOf(System.getenv("PORT"));
        }
        
        String endpointUrl = PROTOCOL+HOSTNAME+":"+PORT+BASE_URL;
        System.out.println("Starting Storage Service...");
        System.out.println("--> Published. Check out "+endpointUrl+"?wsdl");
        Endpoint.publish(endpointUrl, new StorageImpl());
    }
}
