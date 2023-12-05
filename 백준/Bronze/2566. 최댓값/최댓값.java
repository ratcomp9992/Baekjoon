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

        int max = Integer.MIN_VALUE;
        int x = 0, y = 0;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(bufr.readLine());
            for (int j = 0; j < 9; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (max < num) {
                    max = num;
                    x = i;
                    y = j;
                }
            }
        }

        bufw.write(max + "\n" + (x+1) + " " + (y+1));

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}