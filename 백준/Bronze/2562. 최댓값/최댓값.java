import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = Integer.MIN_VALUE;
        int maxindex = 0;
        for (int i = 1; i <= 9; i++) {
            int num = Integer.parseInt(bufr.readLine());

            if (max < num) {
                max = num;
                maxindex = i;
            }
        }

        bufw.write(Integer.toString(max) + '\n' + Integer.toString(maxindex));

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}