public class Practice 
{

	public static void main(String[] args)
	{
		  int[] secret = new int[4];
		  //commenting this out to see if it works
		  secret[0] = 0;
		  secret[1] = 0;
		  secret[2] = 0;
		  secret[3] = 0;
		  
		  secret[0] = 1 + (int)(Math.random()*7);
		  
		  do{
		  secret[1] = 1 + (int)(Math.random()*7);
		  } while (secret[0]==secret[1]);
		  
		  do{
		  secret[2] = 1 + (int)(Math.random()*7);
		  } while (secret[0]==secret[2]||secret[1]==secret[2]);
		  
		  do{
		  secret[3] = 1 + (int)(Math.random()*7);
		  } while (secret[0]==secret[3]||secret[1]==secret[3]||secret[2]==secret[3]);
		  
		  String mySecret = ""+ secret[0] + "" + ""+ secret[1] + "" + ""+ secret[2] + "" +""+ secret[3] + "";
		  
		  System.out.println(mySecret);
		  //comment
	
	}
	
}

	