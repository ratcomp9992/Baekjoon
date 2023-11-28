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

        int T = Integer.parseInt(bufr.readLine());

        StringTokenizer st;
        for (int testcase = 0; testcase < T; testcase++) {
           st = new StringTokenizer(bufr.readLine());

           int R = Integer.parseInt(st.nextToken());
           char[] arr = st.nextToken().toCharArray();

           for (int i = 0; i < arr.length; i++) {
               for (int j = 0; j < R; j++) {
                   bufw.write(arr[i]);
               }
           }

           bufw.write('\n');
        }

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}