import java.util.Scanner;
import java.util.Arrays;

public class Quiz
{
   private String[] questions;
   private String[] answers;
   
   public Quiz(String[] q, String[] a)
   {
      questions = q;
      answers = a;
   }
   
   public boolean showTime(){//randomly chooses a pos and returns true if input = answer[pos]
      Scanner keyboard = new Scanner(System.in);
      int rand = (int)(Math.random()*questions.length);
      
      System.out.print("\n"+questions[rand]);
      String quess = keyboard.nextLine();
      
      if(answers[rand].equals(quess))
         return true;
      else
         return false;
   }
   
}