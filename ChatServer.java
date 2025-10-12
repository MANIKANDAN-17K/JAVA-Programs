import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server1{
    public static void main(String[] a) throws IOException
    {
        ServerSocket ss = new ServerSocket(4321);
        System.out.println("Server waiting for client ");
        Socket s = ss.accept();
        System.out.println("client connected !");
        Scanner sc = new Scanner(System.in);
        BufferedReader in = new BufferedReader( new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);

        String C,S;

        while(true){
            System.out.println(" Client : ");
            C = in.readLine();
            if(C.equalsIgnoreCase("exit") || C == null){
             System.out.println ("client disconnectded" );
             break;
            }
            System.out.println(C);
            System.out.println(" Server : ");
            S = sc.nextLine();
            out.println(S);    
            if(S.equalsIgnoreCase("exit") || S == null){
             System.out.println ("client disconnectded" );
             break;
            }
        }
        s.close();
        ss.close();
    }
}
