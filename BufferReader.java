import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferReader {
    public static void main(String[] args) throws IOException {

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        System.out.print("Enter you name : ");
        String name = reader.readLine();
        System.out.println("you entered :");
        System.out.print(name);
        System.out.println("\n");
        input.close();
    }
    
}
