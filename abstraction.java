abstract class animal{		
    public abstract void animalSound();		
    		
        		
        		
}		
class dog extends animal{		
    public void animalSound(){		
        System.out.println("dog sound bow bow");		
    }		
        public void legs(){		
        System.out.println("dog has four leg");		
}		
}		
public class abstraction		
{		
	public static void main(String[] args) {	
		System.out.println("Hello World");
		dog myDog = new dog();
		myDog.animalSound();
		myDog.legs();
		
	}	
}		
