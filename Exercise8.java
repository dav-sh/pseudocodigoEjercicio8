import java.util.*;
public class Exercise8{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner s = new Scanner(System.in);
        String op;
        do{
            System.out.println("Do you want more numbers? (S -> Exit): ");
            op = s.nextLine();
            if(!op.equals("s")){
                System.out.println("n: "+(rand.nextInt()*5));
            }  
            
            
        }while(!op.equals("s"));
        
    }   
}