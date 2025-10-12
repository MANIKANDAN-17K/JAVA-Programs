import java.io.*;
import java.net.*;
//import java.util.Scanner;

public class Server1{
    public static void main(String[] a) throws IOException
    {
        ServerSocket ss = new ServerSocket(4321);
        System.out.println("Server waiting for client ");
        Socket s = ss.accept();
        System.out.println("client connected !");
      //  Scanner sc = new Scanner(System.in);
        BufferedReader in = new BufferedReader( new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);

        String req;
        

        while((req = in.readLine()) != null){
            String[] str = req.split(" ");
            if(str.length != 3) {
                out.println("Enter number opr number");
                continue;
            }
            try{
            double num1 = Double.parseDouble(str[0]);
            double num2 = Double.parseDouble(str[2]);
            char opr = str[1].charAt(0);
            double res = 0;
            switch(opr){
                case '+': res = num1 + num2; break;
                case '-': res = num1 - num2; break;
                case '*': res = num1 * num2; break;
                case '/': res = num1 / num2; break;
                default: out.println(" Unsupport operator"); continue;
            }
            out.println("Result: "+res);
            }catch(NumberFormatException e){
                out.println("invalid number");
            }
        }
        s.close();
        ss.close();
    }
}
