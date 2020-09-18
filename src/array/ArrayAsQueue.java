/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author Shubham
 *
 */
public class ArrayAsQueue {

	/**
	 * @param args
	 */
	static int[] array = new int[50];
	static int start=-1;
	static int end=-1;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int response = 0;
		while (true) {
			System.out.println("\n\t\tMenu \n\t1.Enqueue \n\t2.Dequeue \n\t3.Print Queue \n\t4.Exit");
			
			response = sc.nextInt();

			switch (response) {
			case 1:
				int number = sc.nextInt();
				enqueue(number);
				break;

			case 2:
				dequeue();
				break;
				
			case 3:
				printQueue();
				break;
				
			case 4:
				sc.close();
				System.exit(0);

			}
		}
	}

	private static void printQueue() {
		System.out.println("Printing queue: \n");
		for(int i=end;i<=start;i++) {
			System.out.print(array[i] + " ");
		}
	}

	private static int dequeue() {
		int returnElement=-1;
		if(start==0) {
			System.out.println("Underflow!");
			return returnElement;
		}else {
			returnElement=array[end];
			array[end]='\0';
			end++;
		}
		return returnElement;
	}

	private static void enqueue(int number) {
		if(start==49) {
			System.out.println("Overflow!");
			return;
		}
		if((start==-1)&&(end==-1)) {
			start=0;
			end=0;
			array[start]=number;
		}else {
			start++;
			array[start]=number;
		}
	}

}
