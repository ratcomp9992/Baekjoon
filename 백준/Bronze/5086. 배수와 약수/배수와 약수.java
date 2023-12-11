import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(bufr.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            if (num1 == 0 && num2 == 0) {
                break;
            }
            if (num1 % num2 == 0) {
                bufw.write("multiple" + '\n');
            }
            else if (num2 % num1 == 0) {
                bufw.write("factor" + '\n');
            }
            else {
                bufw.write("neither" + '\n');
            }
        }

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}