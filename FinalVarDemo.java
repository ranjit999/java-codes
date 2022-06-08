

class FinalVarDemo{
	final static int x = 100;// compile time static const
	final static int y;
	static int z;
	
	static{
		y =200;
	}
	
	
	public static void main(String[] args){
		final int a = 20;// compile time constants
		
		final int b;
		b = 30;
		//b = 40;
		int c = 40;
		
		int i = 10;
		switch(i){
			case 10 :System.out.println("10");
			case a :System.out.println("10");
			//case b :System.out.println("10");
			//case c :System.out.println("10");
			
		}
		
		System.out.println(FinalDemo2.x);
		
		
		
		
	}
}