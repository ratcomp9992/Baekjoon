import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] word = bufr.readLine().toCharArray();
        int time = 0;

        for (char i : word) {
            if (i == 'S') {
                time += 8;
            }
            else if (i == 'V') {
                time += 9;
            }
            else if (i >= 'Y') {
                time += 10;
            }
            else {
                time += (i - 65) / 3 + 3;
            }
        }

        bufw.write(Integer.toString(time));

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}