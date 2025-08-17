package com.main;

import java.util.Scanner;

//1. 숫자를 하나 뽑는다.
//
//2. 뽑은 숫자는 used 배열에 표시해서 다시 못 쓰게 한다.
//
//3. 다음 자리로 넘어가서 또 숫자를 뽑는다.
//
//4. M개를 다 뽑으면 출력한다.
//
//5. 끝났으면 돌아와서(백트래킹) 방금 뽑았던 숫자를 다시 “안 쓴 상태”로 돌려놓는다.

public class Main {
    static int n;
    static int m;
    static boolean[] used;
    static int[] pick;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		used = new boolean[n + 1];
		pick = new int[m];

		dfs(0);
		sc.close();
	}
	
    static void dfs(int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(pick[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!used[i]) {
                used[i] = true;
                pick[depth] = i;
                dfs(depth + 1);
                used[i] = false;
            }
        }
    }

    
}


