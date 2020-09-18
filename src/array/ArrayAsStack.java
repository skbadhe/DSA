package array;
/**
 * @author Shubham
 *
 */

import java.util.Scanner;

public class ArrayAsStack {
	
	static int[] array = new int[50];
	static int top=0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int response = 0;
		while (true) {
			System.out.println("\n\t\tMenu \n\t1.push element \n\t2.pop element\n\t3.display stack \n\t4.exit");
			
			response = sc.nextInt();

			switch (response) {
			case 1:
				int number = sc.nextInt();
				pushToStack(number);
				break;

			case 2:
				popFromStack();
				break;
				
			case 3:
				printStack();
				break;
				
			case 4:
				sc.close();
				System.exit(0);

			}
		}

	}

	private static void printStack() {
		System.out.println("Printing stack:\n");
		for(int i=0;i<=top;i++) {
			System.out.print(array[i]+" ");
		}
	}

	private static void popFromStack() {
		if(top<=0) {
			System.out.println("Stack Underflow!");
			return;
		}else {
			array[top]='\0';
			top=top-1;
		}
	}

	private static void pushToStack(int number) {
		if(top==49) {
			System.out.println("Stack Overflow!");
			return;
		}
		if((top==0)&&(array[0]=='\0')) {
			array[0]=number;
		}else {
			top+=1;
			array[top]=number;
		}
	}

}
