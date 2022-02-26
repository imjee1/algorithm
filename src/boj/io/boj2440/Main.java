package boj.io.boj2440;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        String result;

        for(int i=1; i<=num; i++) {
            result = "";
            for(int j=num; j>=i; j--) {
                result += "*";
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
