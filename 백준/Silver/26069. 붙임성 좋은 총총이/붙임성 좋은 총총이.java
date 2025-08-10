import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<String> RainbowDance = new ArrayList<>();
        RainbowDance.add("ChongChong"); 

        for (int i = 0; i < n; i++) {
            String a = sc.next();
            String b = sc.next();

            boolean aDance = RainbowDance.contains(a);
            boolean bDance = RainbowDance.contains(b);
            
            //한명이라도 춤출경우
            if (aDance || bDance) {
                if (!aDance) RainbowDance.add(a);
                if (!bDance) RainbowDance.add(b);
            }
        }
        System.out.println(RainbowDance.size());
    }
}


