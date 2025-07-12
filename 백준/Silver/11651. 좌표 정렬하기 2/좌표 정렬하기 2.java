

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        Coor[] arr = new Coor[n];

        for (int i=0;i<n;i++) {
            int y = sc.nextInt();
            int x = sc.nextInt();
            arr[i] = new Coor(x, y);
        }
        Arrays.sort(arr, new Comparator<Coor>() {
            @Override
            public int compare(Coor a, Coor b) {
                if (a.getX() != b.getX()) {
                    return a.getX() - b.getX();
                } else {
                    return a.getY() - b.getY();
                }
            }
        });

        for (Coor c : arr) {
            System.out.println(c.getY()+" "+c.getX());
        }
    }

    static class Coor {
        private int x;
        private int y;

        public Coor(int x, int y) {
            this.x = x;
            this.y = y;
        }

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
        
    }
}