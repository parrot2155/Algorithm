import java.util.Scanner;

public class Main {

    static int kidx;          // 찾을 저장 순서
    static long cnt = 0;      // 저장 횟수
    static int ans = -1;      // K번째 , 못 찾으면 -1

    static int[] tmp;         // 병합 임시 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        kidx = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        tmp = new int[n]; // tmp 배열 초기화
        mergeSort(a, 0, n - 1);

        System.out.println(ans);
    }

    public static void mergeSort(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            
            mergeSort(A, p, q); 
            
            mergeSort(A, q + 1, r);  
            
            merge(A, p, q, r);       
        }
    }

    public static void merge(int[] A, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 0;

        
        while (i <= q && j <= r) {
            if (A[i] <= A[j]) {
            	tmp[t++] = A[i++];
            }
            else {
            	tmp[t++] = A[j++];
            }
        }
        while (i <= q) {
        	tmp[t++] = A[i++];
        }
        while (j <= r) {
        	tmp[t++] = A[j++];
        }

        
        i = p;
        t = 0;
        while (i <= r) {
            A[i] = tmp[t++];
            cnt++;
            if (cnt == kidx) ans = A[i];
            i++;
        }
    }
}




//시간초과에러

//import java.util.Scanner;
//
//public class Main {
//    
//    static int kidx;          // 찾을 저장 순서
//    static long cnt = 0; // 저장 횟수
//    static int ans= -1;// K번째 , 못 찾으면 -1
//
//    public static void main(String[] args) {
//        
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        kidx = sc.nextInt();
//        int[] A = new int[n];
//        for (int i = 0; i < n; i++) A[i] = sc.nextInt();
//
//        
//        mergeSort(A, n);
//
//        
//        System.out.println(ans);
//    }
//
//	static int[] buff;
//
//	public static void mergeSort(int[] a, int n) {
//		buff = new int[n];
//
//		mSort(a, 0, n - 1);
//
//	}
//
//	public static void mSort(int[] a, int left, int right) {
//		if (left < right) {
//			int center = (left + right) / 2;
//			int p = 0;
//			int j = 0;
//			int k = left;
//
//			// center를 기준으로 왼쪽 배열 영역으로 mSort()실행
//			mSort(a, left, center);
//			mSort(a, center + 1, right);
//
//			// 이 부분이 실행 == 배열을 다 나눴다.
//			for (int i = left; i <= center; i++) {
//				buff[p++] = a[i];
//			}
//
//			// 병합
//			int i = center + 1;
//			while (i <= right && j < p) {
//				a[k++] = (buff[j] <= a[i]) ? buff[j++] : a[i++];
//				if (++cnt == kidx) {
//					ans = a[k - 1]; // 저장 시 카운트
//				}
//			}
//			
//			// 버퍼에 남은 데이터를 a에 복사
//			while (j < p) {
//				if (++cnt == kidx) {
//					ans = a[k - 1];
//				}
//			}
//
//		}
//		
//	}
//}

