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

        StringTokenizer st = new StringTokenizer(bufr.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bufr.readLine());
        Integer[] arr = new Integer[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                int temp = arr[i] + arr[j];
                if (temp < M) {
                    for (int k = j + 1; k < N; k++) {
                        if (temp + arr[k] <= M) {
                            max = Math.max(temp + arr[k], max);
                        }
                    }
                }
            }
        }

        bufw.write(Integer.toString(max));

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}