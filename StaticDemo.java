class StaticDemo{
	
	static int a = 10;
	static int b = 20;
	
	public static void main(String... args){
		int c = 30;
		int d = 40;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		m1();
		System.out.println(a);
		System.out.println(b);
		a = 50;
		b = 60;
		m1();
		System.out.println(a);
		System.out.println(b);
	}
	
	static void m1(){
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);
		//System.out.println(d);
		a = 70;
		b = 80;
	}
	
}