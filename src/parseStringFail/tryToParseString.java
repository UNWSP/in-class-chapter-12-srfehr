package parseStringFail;

public class tryToParseString {
	public static void main(String[] args) {
		String notAnInt = "I am not an integer";
		try {
			int fail = Integer.parseInt(notAnInt);
		}
		catch(NumberFormatException mistake){
			System.out.println("literally not a number ?? what ????");
		}
	}
}
