package boj.io.boj10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int max = 0;
        int min = 0;

        for(int i=0; i<cnt; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(i==0) {
                max = num;
                min = num;
            } else {
                if(min > num) min = num;
                if(max < num) max = num;
            }
        }
        System.out.println(min+" "+max);
    }
}
