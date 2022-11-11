package assignment;

public class assignment {
	public static void main(String[] args) {
		String[] nums = {"0", "1", "2", "3", "what","5"};
	try {
		int count=0; 
		while(count <= 11) {
			int num = Integer.parseInt(nums[count]);
			double result = 10/num;
			System.out.println(result);
		}
		
	}
	catch(ArithmeticException mistake){
		System.out.println("The math ain't mathing");
	}
	catch(ArrayIndexOutOfBoundsException mistake) {
		System.out.println("not enough numbers!!");
	}
	catch(NumberFormatException mistake) {
		System.out.println("not even a number???");
	}
	finally {
		System.out.println("thank goodness that's done");
	}
}}
