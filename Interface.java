interface animal{		
    public void dogSound();		
    public void dogFood();		
}		
class dog implements animal{		
    public void dogSound(){		
        System.out.println("dog sound bow bow");		
    }		
        public void dogFood(){		
        System.out.println("dog has four leg");		
}		
}		
		
		
interface Calculation{		
    public int add(int a,int b);		
}		
		
class maths implements Calculation{		
    public int add(int a,int b){		
        System.out.println("Lets learn addition");		
        return a+b;		
    }		
}		
public class Interface		
{		
	public static void main(String[] args) {	
		System.out.println("Hello World");
		dog myDog = new dog();
		myDog.dogSound();
		myDog.dogFood();
	maths myMaths = new maths();	
	myMaths.add(16,17);	
	System.out.println(myMaths.add(16,17));	
	}	
