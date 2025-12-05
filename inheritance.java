/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class outerClass{
    public void outerMethod(){
        System.out.println("outer class method");
    }
    class innerClass{
        public void innerMethod(){
            System.out.println("inner class");
        }
}
}
public class inheritance
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		outerClass myouter=new outerClass();
		myouter.outerMethod();
		outerClass.innerClass myinner = myouter.new innerClass();
		myinner.innerMethod();
	}
}