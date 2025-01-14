import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] input = bufr.readLine().toCharArray();

        int cnt = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 'c' && i < input.length - 1) {
                if (input[i + 1] == '=' || input[i + 1] == '-') {
                    i++;
                }
            } else if (input[i] == 'd'  && i < input.length - 1) {
                if (input[i + 1] == '-') {
                    i++;
                } else if (input[i + 1] == 'z' && i < input.length - 2 && input[i + 2] == '=') {
                    i += 2;
                }
            } else if (i < input.length - 1
                    && (input[i] == 'l' && input[i + 1] == 'j'
                    || input[i] == 'n' && input[i + 1] == 'j'
                    || input[i] == 's' && input[i + 1] == '='
                    || input[i] == 'z' && input[i + 1] == '=')) {
                i++;
            }
            cnt++;
        }

        bufw.write(Integer.toString(cnt));
        bufw.flush();
        bufw.close();
        bufr.close();
    }
}