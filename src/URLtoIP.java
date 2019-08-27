import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class URLtoIP {

    public void getIP(String host){

        try {
            InetAddress address = InetAddress.getByName(host);
            System.out.println(address.toString());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }    }
}
