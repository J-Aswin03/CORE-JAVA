class animal{
    public void dog(){
        System.out.println("dog bark's in normal class");
    }
}
public class Anonymous{
    public static void main(String[]args){
        System.out.println("Lets learn about anonymous");
        animal dogObject = new animal(){
       @Override
       public void dog(){
           System.out.println("Dog barks from anonymous class");
       }
       };
       dogObject.dog();
        
    }
}
