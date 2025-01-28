import java.io.BufferedWriter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(bufr.readLine());
        int B = Integer.parseInt(bufr.readLine());
        int C = Integer.parseInt(bufr.readLine());

        int[] answer = new int[10];
        char[] result = Integer.toString(A * B * C).toCharArray();
        for (int i = 0; i < result.length; i++) {
            answer[result[i] - 48]++;
        }

        for (int i = 0; i < 10; i++) {
            bufw.write(answer[i] + "\n");
        }

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}