import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExamTopics {
    public static void main(String[] args) {
        
    //ამოცანა 1:
        greeting("Ani");
        
        //ამოცანა 2:
        int total=sum(100,20);
        System.out.println(total);

       //ამოცანა 3:
        boolean isEven=checkEvenNumb(5);
        System.out.println("Is the number even? " + isEven);
        
        //ამოცანა 4:მეთოდი,რომელიც იღებს double რიცხვს და აბრუნებს მას მთელ რიცხვად (Casting გამოყენებით)
        double typeDouble=8.59;
        int typeInt= (int) typeDouble;
        System.out.println(typeInt);

        //ამოცანა 5:
        int compareNum=maxNum(200,508);
        System.out.println("bigger number is "+ compareNum);


        //ამოცანა 6:
        int strLength=checkLength("This is my first Java Exam");
        System.out.println("String length is " + strLength);
        
        //ამოცანა 7:
        int overloadingMult=multiply(2,5);
        System.out.println(overloadingMult);
        int overloadingMult2=multiply(2,3,4);
        System.out.println(overloadingMult2);
        
        

    }
    //ამოცანა 1:
    public static void greeting(String name){
        System.out.println("Hello, " + name);
    }
    
    //ამოცანა 2: 
    public static int sum(int a,int b){
        return a+b;
    }
    
    
    //ამოცანა 3: მეთოდი, რომელიც ამოწმებს არის თუ არა რიცხვი ლუწი (მეთოდი აბრუნებს `boolean` ტიპს)
public static boolean checkEvenNumb (int x){
        if (x%2==0){
            return true;
        }else{
            return false;
        }
}
   

//ამოცანა 5:მეთოდი, რომელიც აბრუნებს ორ რიცხვს შორის უფრო დიდს(იღებს ორ `int` რიცხვს და აბრუნებს მათ შორის დიდ რიცხვს `if/else`)
    public static int maxNum(int x,int y){
        if (x>y){
            return x;
        }else{
            return y;
        }
    }


    //ამოცანა 6:მეთოდი,რომელიც აბრუნებს String-ის სიგრძეს(მეთოდი იღებს `String` ტიპს და აბრუნებს მასში სიმბოლოების რაოდენობას)
    public static int checkLength(String sentence){
        return sentence.length();
    }
    
    
    
    
    //ამოცანა 7:
    public static int multiply(int a,int b){
        return a*b;
    }
    public static int multiply(int a,int b,int c){
        return a*b*c;
    }

    
}
