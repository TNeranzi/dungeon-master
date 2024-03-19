import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput{

    public String readInput() throws IOException {
        System.out.println("Please input your desired numbers: ");

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader bufferRead = new BufferedReader(read);

        return bufferRead.readLine();
    }
}
