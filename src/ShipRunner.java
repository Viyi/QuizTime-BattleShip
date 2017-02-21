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
			 {1,1,1,3,1,2,2,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,4,4,4,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1} };
			  
			  int[][] p2ships = new int[][]{ {1,1,1,1,1,1,1,1,1,1},
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
		Player p2 = new Player(2);
		
		/*
		System.out.println(p1.getShips());
		System.out.println(p2.attack(p1, 3, 3));
		System.out.println(p1.myShips());
		System.out.println(p2.myEnemy());
		
		*/
		while (winner <1)
		{
			String xa = "";
			int ya = 0;
			
			
			if(turn == 1)
			{
				System.out.println("Player "+ turn + "!");
				System.out.println(p1.myEnemy());
				System.out.println("\n\n");
				
				System.out.println(p1.myShips());
				System.out.println();
				scan.next();
				System.out.println("Choose Your Attacking Collumn!");
				xa = scan.next();
				System.out.println("Choose Your Attacking Row!");
				ya = scan.nextInt();
				if(p1.attack(p2, p2.convert(xa), ya))
				{
					System.out.println("Hit!");
				}else{
					System.out.println("Miss!");
				}
				turn = 2;
				
			}else{
				System.out.println("Player "+ turn + "!");
				System.out.println(p2.myEnemy());
				System.out.println("\n\n");
				System.out.println(p2.myShips());
				
				scan.next();
				System.out.println("Choose Your Attacking Collumn!");
				xa = scan.next();
				System.out.println("Choose Your Attacking Row!");
				ya = scan.nextInt();
				if(p2.attack(p1, p1.convert(xa), ya))
				{
						System.out.println("Hit!");
					}else{
						System.out.println("Miss!");
					}
				
					turn = 1;
				}
			}
				
			
		}
	}

