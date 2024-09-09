package java_strings;

public class Special_Char {

	public static void main(String[] args) 
	{
		/*-
		 * \\->Gives single blankspace
		 * \'-> Single quote
		 * \" -> Double quotes
		 -*/

		String txt = "We are the so-called \"Vikings\" from the north.";
		System.out.println(txt);
		
		String txt1 = "We are the so-called \'Vikings\' from the north.";
		System.out.println(txt1);
		
		String txt2 = "We are the so-called \\Vikings\\ from the north.";
		System.out.println(txt2);

	}

}
