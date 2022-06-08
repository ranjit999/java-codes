class SomeRandomClass3{
	
	static void m2(){
		System.out.println("SomeRandomClass3 m2()");
	}
	
	static void m1(){
		System.out.println("SomeRandomClass3 m1()");
	}
	
	
	static{
		System.out.println("SomeRandomClass3 static block1");
	}
	static{
		System.out.println("SomeRandomClass3 static block2");
	}
	
}
class SomeRandomClass2{
	static int x;
	static int y;
	static{
		System.out.println("SomeRandomClass2 static block1");
	}
	static{
		System.out.println("SomeRandomClass2 static block2");
	}
}
class StaticDemo3{
	
	static int a ;
	static int b;
	static boolean bool;
	static float f;
	static double d;
	static char ch;
	static{
		System.out.println("StaticDemo3 static block");
		a = 10;
		b = 20;
		bool = true;
		f = 10.1F;
		d = 10.20D;
		ch = 'a';
	}
	public static void main(String[] args){
		int c;
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);
		System.out.println(bool);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		
		SomeRandomClass3.m1();
		SomeRandomClass3.m2();
		
		System.out.println(SomeRandomClass2.x);
		System.out.println(SomeRandomClass2.y);
		
		
	}
}