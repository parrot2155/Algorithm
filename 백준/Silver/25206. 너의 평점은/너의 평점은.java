

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double total = 0;
		double sum = 0;
		for(int i=0;i<20;i++) {
			String st = sc.next();
			double score = sc.nextDouble();
			String grd = sc.next();
			
			switch(grd) {
			case "A+":
				total += (score*4.5);
				sum += score;
				break;
			case "A0":
				total += (score*4.0);
				sum += score;
				break;
			case "B+":
				total += (score*3.5);
				sum += score;
				break;
			case "B0":
				total += (score*3.0);
				sum += score;
				break;
			case "C+":
				total += (score*2.5);
				sum += score;
				break;
			case "C0":
				total += (score*2.0);
				sum += score;
				break;
			case "D+":
				total += (score*1.5);
				sum += score;
				break;
			case "D0":
				total += (score*1.0);
				sum += score;
				break;
			case "F":
				sum += score;
				break;
			case "P":
				break;
			}
		}
		System.out.println(total/sum);
		
	}
}