import java.util.Scanner;
import java.util.Arrays;

public class ShipRunner {
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		int winner = 0;
		int turn = ((int)Math.random()+1 *2);
		int[][] p1ships = new int[][]{ {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,3,3,3} };
			  
			  int[][] p2ships = new int[][]{ {3,3,3,1,1,1,1,1,1,1},
					 {1,1,1,1,1,1,1,1,1,1},
					 {1,1,1,1,1,1,1,1,1,1},
					 {1,1,1,1,1,1,1,1,1,1},
					 {1,1,1,1,1,1,1,1,1,1},
					 {1,1,1,1,1,1,1,1,1,1},
					 {1,1,1,1,1,1,1,1,1,1},
					 {1,1,1,1,1,1,1,1,1,1},
					 {1,1,1,1,1,1,1,1,1,1},
					 {1,1,1,1,1,1,1,1,1,1} };
		
		Player p1 = new Player(1, p1ships);
		Player p2 = new Player(2, p2ships);
      
      String[] q = {"1+2=","2+2=","3+2=","4+2="};
      String[] a = {"3","4","5","6"};
      Quiz addition = new Quiz(q,a);
		
		while (winner <1)
		{
			String xa = "";
			int ya = 0;
			
			if(turn == 1)
			{
            System.out.print("\n\nPlayer "+ turn + "!");
            if(addition.showTime())
            {
               System.out.print("\nCORRECT!");
				   System.out.print("\n"+p1.printEnemies());
				   System.out.print("\n\n"+p1.printMe());
            
				   System.out.print("\n"+"Choose Your Attacking Collumn!");
				   xa = scan.next();
				   System.out.print("Choose Your Attacking Row!");
				   ya = scan.nextInt();
				   if(p1.attack(p2, p2.convert(xa), ya))
				   {
				   	System.out.print("Hit!\n");
				   }else{
				   	System.out.print("Miss!\n");
				   }
            }
            else
            {
               System.out.print("\nINCORRECT!");
            }
            turn = 2;
				
			}else{
            System.out.print("\n\nPlayer "+ turn + "!");
				if(addition.showTime())
            {
               System.out.print("\nCORRECT!");
				   System.out.print("\n"+p2.printEnemies());
				   System.out.print("\n\n"+p2.printMe());
            
				   System.out.print("\n"+"Choose Your Attacking Collumn!");
				   xa = scan.next();
				   System.out.print("Choose Your Attacking Row!");
				   ya = scan.nextInt();
				   if(p2.attack(p1, p1.convert(xa), ya))
				   {
				   	System.out.print("Hit!\n");
				   }else{
				   	System.out.print("Miss!\n");
				   }
            }
            else
            {
               System.out.print("\nINCORRECT!");
            }
            turn = 1;
         }
      }
      
   }//ends main
}//ends class
