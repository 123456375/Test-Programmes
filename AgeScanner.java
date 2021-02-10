package Test;

import java.util.Scanner;

		public class AgeScanner {
			
			public static void main(String Args[]) {
				
			System.out.print("Enter the Age: ");
			
			Scanner in = new Scanner(System.in);
			
				int i = in.nextInt();
				
				in.close();
				
			
				 if ( i <= 18) {
					System.out.println("Child");
					
				} else if (i >= 18 && i<=54) {
					System.out.println("Adult");
					
				} else (i>=55) {
					
				}
					System.out.println("senior citizen");
				}
			}
		
		
