public class StringPalindrome
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Print string in reverse order");
		String input="radar";
		String output="";
		String reverse="";
		for (int i=input.length()-1;i>=0;i--){
		    System.out.println(input.charAt(i));
		    output=output+input.charAt(i);
		}
//		System.out.println(output);
		
		if(input.equals(output)){
		    System.out.println("The string is palindrome");
		}
		else
		System.out.println("The string is not a palindrome");
	}
}