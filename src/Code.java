import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code {
    public static void main(String[] args) {
        String input = "int add(int x, int y) { int sum = \r 0; ";
        //String input = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            input = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        StringTokenizer inputTokenizer = new StringTokenizer(input, " ;,\r{}()+=");

        String[] tokens = new String[inputTokenizer.countTokens()];
        int i = 0;
        while (inputTokenizer.hasMoreTokens()) {
            tokens[i] = inputTokenizer.nextToken();
            i++;
        }

        if (tokens[0].compareTo("int") != 0 || tokens[2].compareTo("int") != 0 ||
                tokens[4].compareTo("int") != 0 || tokens[6].compareTo("int") != 0 ||
                tokens[12].compareTo("return") != 0) {
            System.out.println(0);
            return;
        }

        System.out.println(1);
    }
}
