package patternQuestion;
import java.util.Scanner;

public class Question2 {
	public static void main(String arg[]) {
		Scanner ob = new Scanner(System.in);
		int x = ob.nextInt();
		int p=x-1;
		for(int i=0;i<x;i++) {
			for(int j=0;j<((x*2)-1);j++) {
				
				if(i==0) {
					System.out.print("*");
				}
				
			else {
					if(j>(p-i)&&j<(p+i)) {
						
						System.out.print(" ");
					}
					else {
						
						System.out.print("*");
					}
				}
					
			}
			
			System.out.println("");
		}
			
	}
	
	}

