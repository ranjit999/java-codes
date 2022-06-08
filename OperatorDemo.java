class OperatorDemo{

	public static void main(String[] args){
		int i = 10;
		//int j = i++;
		int j = ++i;
		System.out.println(i);//
		System.out.println(j);//
		
		int a = 20;
		int b = 20;
		
		if(a < b){
			System.out.println("A is Small");
			if(a % 3 == 0){
				System.out.println(a+" is divisible by 3");
			}else{
				System.out.println("A is not divisible by 3");
			}
			
		}else if(a == b){
			System.out.println("Equal");
			if(a*b <= 400){
				System.out.println("a*b is lte 400");
			}
		}else{
			System.out.println("B is small");
			if(b % 7 == 0){
				System.out.println("B is divisible by 7");
			}else{
				System.out.println("B is not divisible by 7");
			}
		}
		
		System.out.println(a+"+"+b+" = "+(a+b));
		System.out.println((int)(char)(byte)130);//65534
		
		int c = 30;
		int d = 30;
		if( (c == d) | (c > 10) ){
			
		}
		
		c = 40;
		d = 30;
		if( (c == d) | (c > 10) ){
			
		}
		
		
		c = 30;
		d = 30;
		if( (c == d) & (c > 10) ){
			
		}
		
		c = 40;
		d = 30;
		if( (c == d) & (c > 10) ){
			
		}
		
		//|| && => short circuit 
		
		byte b1 = 10;
		byte b2 = 10;
		long l = 10;
		int i2 = 10;
		float f = 30;
		double d2 = 10;
		double output = b1 + b2 + i2 + l + f + d2;
		System.out.println(output);//20
		
		
		
		
		int p = 10; //decimal
		int q = 0b1010; // binary
		int r = 0Xa; // hex
		int s = 012;//octal
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		System.out.println(s);
		
		
		r = 010;
		System.out.println(r);//8
		
		
		
		
	}
}