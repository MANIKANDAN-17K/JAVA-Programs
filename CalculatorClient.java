import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client1{
    public static void main(String[] a) throws IOException
    {
       
        Socket s = new Socket("localhost",4321);
        System.out.println("server connected !");
        Scanner sc = new Scanner(System.in);
        BufferedReader in = new BufferedReader( new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);

        System.out.println("Enter the value [ 5 + 3] like this ");
        String req;
        while((req = sc.nextLine()) != null){
           if(req.equalsIgnoreCase("exit") || req == null){
             System.out.println ("client disconnectded" );
             break;
            }
            out.println(req);
            System.out.println(in.readLine());
        }
        s.close();
      
    }
}
