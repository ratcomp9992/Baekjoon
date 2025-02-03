import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System. in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bufr.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                arr.add(i);
            }
        }

        if (K <= arr.size()) {
            bufw.write(Integer.toString(arr.get(K - 1)));
        } else {
            bufw.write("0");
        }

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}
