package boj.io.boj2442;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2×N-1
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for(int i=1; i<=num; i++) {
            for(int j=0; j<num-i; j++) {
                sb.append(" ");
            }
            for(int t=0; t<2*i-1; t++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
