package sprint4.uppgift_0;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

    static void main() throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);
        System.out.println(address.getHostAddress());
        System.out.println(address.getHostName());
        System.out.println(address.isMulticastAddress());

    }
}
