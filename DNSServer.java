import java.net.*;
import java.util.*;

public class DNSServer{
    public static void main(String arg[]) throws Exception{
        DatagramSocket s = new DatagramSocket(4321);
        byte[] rcv = new byte[1024];
        byte[] snd ;

        HashMap<String,String> DnsTable = new HashMap<>();
        DnsTable.put("google","123456789");
        DnsTable.put("microsoft","0987654532");
        while(true){
            DatagramPacket rcvpkt = new DatagramPacket(rcv,rcv.length);
            s.receive(rcvpkt);

            String query = new String(rcvpkt.getData(),0,rcvpkt.getLength()).trim();
            String Dname = DnsTable.getOrDefault(query,"NotFounded");

            snd = Dname.getBytes();
            
            InetAddress ipAddress = rcvpkt.getAddress();
            int port = rcvpkt.getPort();

            DatagramPacket sndpkt = new DatagramPacket(snd,snd.length,ipAddress,port);
            s.send(sndpkt);
        }
       
    }
}
