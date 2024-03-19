import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main (String [] args) throws IOException {

        UserInput input = new UserInput();
        String metrics = input.readInput();

        metrics = metrics.trim();

            String[] array = metrics.split("\\s+");

            List<String> strings = Arrays.asList(array);

            int sum = 0;

            for(int i =0; i < strings.size() -1; i++ ) {
                if(i ==0) {
                    sum += Convertor.getMM(strings.get(i));
                }
                else {
                    if(strings.get(i).equals("+"))
                        sum += Convertor.getMM(strings.get(i+1));
                    else if(strings.get(i).equals("-"))
                        sum -= Convertor.getMM(strings.get(i+1));
                }
            }

        System.out.println("Result: " + sum + " mm");
    }
}
