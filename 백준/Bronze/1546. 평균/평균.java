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

        int N = Integer.parseInt(bufr.readLine());
        StringTokenizer st = new StringTokenizer(bufr.readLine());
        int[] score = new int[N];
        int max = Integer.MIN_VALUE;
        double sum = 0;
        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(st.nextToken());
            if (score[i] > max) {
                max = score[i];
            }
            sum += score[i];
        }

        bufw.write(Double.toString(sum * 100/ max / N));

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}