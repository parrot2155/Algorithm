import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int res = 0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='c') {
				if(i<str.length()-1) {
					if(str.charAt(i+1)=='=') {
					res++;
					i++;
					}else if(str.charAt(i+1)=='-') {
						res++;
						i++;
					}else {
						res++;
					}
				}else {
					res++;
				}
				
			}else if(str.charAt(i)=='d') {
				if(i<str.length()-1) {
					if(str.charAt(i+1)=='z') {
						if(i<str.length()-2) {
							if(str.charAt(i+2)=='=') {
								res++;
								i++;
								i++;
							}else {
								res++;
								res++;
								i++;
							}
						}else {
							res++;
						}
					}else if(str.charAt(i+1)=='-') {
						res++;
						i++;
					}else {
						res++;
					}
				}else {
					res++;
				}
			}else if(str.charAt(i)=='l') {
				if(i<str.length()-1) {
					if(str.charAt(i+1)=='j') {
						res++;
						i++;
					}else {
						res++;
					}
				}else {
					res++;
				}
			}else if(str.charAt(i)=='n') {
				if(i<str.length()-1) {
					if(str.charAt(i+1)=='j') {
						res++;
						i++;
					}else {
						res++;
					}
				}else {
					res++;
				}
			}else if(str.charAt(i)=='s') {
				if(i<str.length()-1) {
					if(str.charAt(i+1)=='=') {
						res++;
						i++;
					}else {
						res++;
					}
				}else {
					res++;
				}
			}else if(str.charAt(i)=='z') {
				if(i<str.length()-1) {
					if(str.charAt(i+1)=='=') {
						res++;
						i++;
					}else {
						res++;
					}
				}else {
					res++;
				}
			}else {
				res++;
			}
		}
		System.out.println(res);
	}
}