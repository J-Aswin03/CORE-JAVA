/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class animal{
    public void domestic(){
    System.out.println("Animal sounds");
    }
}
class dog extends animal{
    
    public void domestic(){
        super.domestic();
    System.out.println("Dog sounds bow bow");
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		animal mydog=new dog();
		mydog.domestic();
	}
}