class MethodDemo{
	
	static void add(int a, int b){
		System.out.println(a+ "+ "+ b+" = "+ (a+b));
	}
	
	static void sub(int a, int b){
		System.out.println(a+ "- "+ b+" = "+ (a-b));
	}
	
	static int mul(int a, int b){
		int result = a*b;
		return result;
	}
	
	public static void main(String... args){
		int veryLongVariableName = 10;
		add(10,20);
		sub(10,20);
		int res = mul(10,20);
		System.out.println("Mul Result = "+res);
	}
}
