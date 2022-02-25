package boj.io.boj1924;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 요일구하기
 * (해당월-1 월까지의 일수 + 해당일) 를 7로 나눈 나머지
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int sum = 0;
        int result = 0;

        for(int i=0; i<m-1; i++) {
            sum += months[i];
        }
        sum += d;
        result = sum % 7;

        System.out.println(days[result]);
    }
}
