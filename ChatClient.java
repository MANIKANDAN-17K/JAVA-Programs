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

        String C,S;

        while(true){
            System.out.print(" YOU : ");
            C = sc.nextLine();
            out.println(C);
            if(C.equalsIgnoreCase("exit") || C == null){
             System.out.println ("client disconnectded" );
             break;
            }

            S = in.readLine();
            if(S.equalsIgnoreCase("exit") || S == null){
             System.out.println ("client disconnectded" );
             break;
            }
            System.out.println("Server : "+S);    
        }
        s.close();
      
    }
}
