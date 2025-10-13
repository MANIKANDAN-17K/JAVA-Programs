import java.util.Scanner;
import java.net.*;

public class DNSClient{
    public static void main(String arg[])throws Exception{
        DatagramSocket s = new DatagramSocket();
        InetAddress ipAddress = InetAddress.getByName("localhost");
        Scanner sc = new Scanner(System.in);
        byte[] rcv = new byte[1024];
        byte[] snd;
     
        while(true){
            System.out.println(" Enter the DomainName :");
            String Dname = sc.nextLine();
            snd = Dname.getBytes();
            DatagramPacket sndpkt = new DatagramPacket(snd,snd.length,ipAddress,4321);
            s.send(sndpkt);

            DatagramPacket rcvpkt = new DatagramPacket(rcv,rcv.length);
            s.receive(rcvpkt);

            String Dip = new String(rcvpkt.getData(),0,rcvpkt.getLength());
            System.out.println("domain ip "+Dip);
        }
    }
}
