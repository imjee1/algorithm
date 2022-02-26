package boj.io.boj2442;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_bak {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int total = 2*num-1; //마지막 별 갯수

        for(int i=1; i<=num; i++) {
            int star = 2*i-1; //해당 행에 찍을 별 갯수
            int a = (total-star)/2; // 공백갯수
            String result = "";

            for(int j=0; j<a; j++) {
                result += " ";
            }
            sb.append(result);
            for(int t=0; t<star; t++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
