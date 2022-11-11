package goTooFar;
import java.lang.AutoCloseable;

public class GoTooFar {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int count = 1;
		
		try {
			while (arr[count]>=0) {
			System.out.println(arr[count]);
			count +=1;}
		}
		catch(ArrayIndexOutOfBoundsException mistake) {
			System.out.println("Stop it.");
			System.out.println("6");
			System.out.println("NO. I SAID STOP");
			System.out.println("7");
			System.out.println("S T O P");
		}
		
		

	}

}
