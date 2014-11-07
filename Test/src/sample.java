import java.util.Random;

public class sample 

{

  public static String mySecret = "";
  public static boolean DEBUG = true;
  public static Random r = new Random();

  public static void main(String[] args) 
  
  {
    makeMySecret();
    //isGameOver("1234");
    //isGameOver("4321");
    //isGameOver("2567");
    //isGameOver("1432");
  }

  public static void makeMySecret() 
  
  {

	  int [] mySecret = new int [4]; 
	  
	  for (int i = 0; i <= 4; i++)
	  {
		  mySecret[i]=(int)(Math.random()*7+1);
	  }
	  
	  
	  
    if (DEBUG)
    {
       System.out.println(mySecret);
    }
  
  }
  //commenting this out to see if it works
  }
