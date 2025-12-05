enum animal{
    dog,pig,cat
}
public class Enum{
    public static void main(String[]args){
        System.out.println("Lets learn about enum");
       animal myAnimal=animal.dog;
       System.out.println(myAnimal);
       switch(myAnimal){
           
               case pig:
                   System.out.println("pig wee wee");
                   break;
                   case cat:
                       System.out.println("cat mew mew");
                       break;
                       case dog:
               System.out.println("dog barks");
               break;
           }
       }
    }

