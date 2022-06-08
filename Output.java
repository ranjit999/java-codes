//What will be the output of 
class Output
{
    static int a=20;
	int c=50;
	int b=40;
	static
	{
		a=30;
	}
	
    public static void main(String [] args)
    {
      Output a1= new Output();
      System.out.println(a1.c);
      System.out.println(a1.b);
      System.out.println(a);	  
}    
}
	