public class StringReverse
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Print string in reverse order");
		String input="aswin";
		String output="";
		String reverse="";
		for (int i=input.length()-1;i>=0;i--){
		    System.out.println(input.charAt(i));
		    output=output+input.charAt(i);
		}
		System.out.println(output);
	}
}