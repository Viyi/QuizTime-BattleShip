import java.util.Arrays;

public class Player {
	private int turn;
	
	//0 is hit ship
	//1 is no ship
	//>1 is a ship
	private int[][] ships;
	
	
	//0 is hit ship
	//1 is missed ship
	//2 is unknown
	private int[][] enemies;
	
	public Player(int i)
	{
		 ships = new int[][]{ {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1} };
		 enemies = new int[][] { {2,2,2,2,2,2,2,2,2,2},
			 {2,2,2,2,2,2,2,2,2,2},
			 {2,2,2,2,2,2,2,2,2,2},
			 {2,2,2,2,2,2,2,2,2,2},
			 {2,2,2,2,2,2,2,2,2,2},
			 {2,2,2,2,2,2,2,2,2,2},
			 {2,2,2,2,2,2,2,2,2,2},
			 {2,2,2,2,2,2,2,2,2,2},
			 {2,2,2,2,2,2,2,2,2,2},
			 {2,2,2,2,2,2,2,2,2,2} };
		turn = i;
		
	}
	
	public Player(int i,int[][] v)
	{
		 turn = i; 
		 ships = v;
		 enemies = new int[][] { {2,2,2,2,2,2,2,2,2,2},
			 {2,2,2,2,2,2,2,2,2,2},
			 {2,2,2,2,2,2,2,2,2,2},
			 {2,2,2,2,2,2,2,2,2,2},
			 {2,2,2,2,2,2,2,2,2,2},
			 {2,2,2,2,2,2,2,2,2,2},
			 {2,2,2,2,2,2,2,2,2,2},
			 {2,2,2,2,2,2,2,2,2,2},
			 {2,2,2,2,2,2,2,2,2,2},
			 {2,2,2,2,2,2,2,2,2,2} };
		
		
	}
	
	
	//Self Explanatory
	public int[][] getShips()
	{
		return ships;
	}
	
	public int[][] getEnemies()
	{
		return enemies;
	}
	public int getTurn()
	{
		return turn;
	}
	
	
	//Here we have the attack method, it uses the receive attack method, and changes the two arrays
	//Whether or not there is a ship.
	
	public boolean attack(Player p, int x, int y)
	{
		y-=1;
		if(p.recieveAttack(x, y))
		{
			enemies[x][y] = 0;
			return true;
		}else{
			enemies[x][y] = 1;
			return false;
		}
	}
   
   public boolean recieveAttack(int x, int y)
	{
      //y-=1;
		if(ships[x][y]>1)
		{
			ships[x][y] = 0;
			return true;
		}else{
			return false;
		}
	}
	
	public int convert(String s)
	{
		int row;
			if(s.toLowerCase().equals("a"))
			{
				row = 0;
			}else if(s.toLowerCase().equals("b")){
				row = 1;
			}else if(s.toLowerCase().equals("c")){
				row =2;
			}else if(s.toLowerCase().equals("d")){
				row = 3;
			}else if(s.toLowerCase().equals("e")){
				row = 4;
			}else if(s.toLowerCase().equals("f")){
				row = 5;
			}else if(s.toLowerCase().equals("g")){
				row = 6;
			}else if(s.toLowerCase().equals("h")){
				row = 7;
			}else if(s.toLowerCase().equals("i")){
				row = 8;
			}else{
				row = 9;
			}
				
		return row;
	}
	
	//Builds the text grid, eventually will implement swing.
	public String printMe()
	{
		String full = "   A B C D E F G H I J";
		for(int a = 0;a<ships.length;a++)
		{
			if (a<9)
			{
				full+="\n"+(a+1)+"  ";	
			}else{
				full+="\n"+(a+1)+" ";	
			}
			
			for(int b = 0;b<ships[a].length;b++)
			{
				full+= ships[a][b]+" ";
			}
		}
		return full;
	}
	
	public String printEnemies()
	{
		String full = "   A B C D E F G H I J";
		for(int a = 0;a<enemies.length;a++)
		{
			if (a<9)
			{
				full+="\n"+(a+1)+"  ";	
			}else{
				full+="\n"+(a+1)+" ";	
			}
			
			for(int b = 0;b<enemies[a].length;b++)
			{
				full+= enemies[a][b]+" ";
			}
		}
		return full;
	}
	
	
}
