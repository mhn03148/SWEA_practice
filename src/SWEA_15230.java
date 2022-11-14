import java.util.Scanner;

public class SWEA_15230 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        int ans[] = new int[T+1];
        for(int test_case = 1; test_case <=T; test_case++){
            String text = sc.next();
            int count =0 ;
            for (int i = 0; i<text.length(); i++) {
                if (i+97 == (int)text.charAt(i)) {
                    count++;
                }
                else {
                    break;
                }
            }
            ans[test_case] = count;
        }
        for (int test_case = 1; test_case <=T; test_case++){
            System.out.println("#"+(test_case)+" "+ ans[test_case]);
        }
    }
}
