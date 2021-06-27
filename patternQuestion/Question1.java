package patternQuestion;
import java.util.Scanner;


public class Question1 {

	public static void main(String[] args) {
		
		Scanner ob  = new Scanner(System.in);
		System.out.println("Enter the no till series you want.");
		int x = ob.nextInt();
		
		for(int i=0;i<x;i++) {
			for(int j=0;j< x-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
				
			}
			System.out.println("");
		}
		
		
		

	}

}
