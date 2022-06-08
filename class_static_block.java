class class_static_block{
	static int a=30;
	public static void main( String[] args){
		int c=10;
		System.out.println(c);
		System.out.println(a);
		System.out.println(hello.b);
		
	}
}
class hello{
	static int b=20;
	static{
		b=50;
	    System.out.println(b);
	}
	
}