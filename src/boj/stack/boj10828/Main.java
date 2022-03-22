package boj.stack.boj10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());

        Stack<String> stack = new Stack<>();

        for(int i=0; i<cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), "\n");
            String nt = st.nextToken();
            String result = null;

            if("pus".equals(nt.substring(0, 3))) {
                stack.push(nt.substring(5));
            } else {
                try {
                    switch (nt) {
                        case "pop" :
                            result = stack.pop(); break;
                        case "size" :
                            result = Integer.toString(stack.size()); break;
                        case "empty" :
                            boolean result1 = stack.empty();
                            if(result1) {
                                result = "1";
                            } else {
                                result = "0";
                            }
                            break;
                        case "top" :
                            result = stack.peek(); break;
                    }
                }catch (Exception e) {
                    result = "-1";
                }
                if(result != null) {
                    sb.append(result+"\n");
                }
            }
        }
        System.out.println(sb);
    }
}
