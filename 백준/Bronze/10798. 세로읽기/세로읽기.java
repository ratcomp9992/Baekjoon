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

        String[] arr = new String[5];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            arr[i] = bufr.readLine();
            max = Math.max(max, arr[i].length());
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < arr[j].length()) {
                    bufw.write(arr[j].charAt(i));
                }
            }
        }

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}