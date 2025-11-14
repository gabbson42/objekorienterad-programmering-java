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

        //Loopback, pekar alltid på den egna datorn
        InetAddress loopback = InetAddress.getLoopbackAddress();
        System.out.println(loopback);

        address = InetAddress.getByName("192.168.50.47");
        System.out.println(address);
        System.out.println();

    }
}
