import java.io.*;
import java.io.InputStreamReader;

public class SWEA_2058 {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int num = Integer.parseInt(br.readLine());
        while (num >10){
            sum += num % 10;
            num = num / 10;
        }
        sum += num;
        System.out.println(sum);
    }
}
