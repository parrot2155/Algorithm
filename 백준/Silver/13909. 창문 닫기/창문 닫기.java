import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); 

        int count = (int) Math.sqrt(n);
        
        System.out.println(count);
        
        sc.close();
    }
}
//n 이하의 어느 수를 j라고 했을 때,
//j가 열려있으려면 j의 약수의 개수가 홀수여야함.
//약수의 개수가 홀수인 수는 완전제곱수이다.
//그러므로 n이하의 완전제곱수의 개수를 찾으면 된다.