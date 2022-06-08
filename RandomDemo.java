class X{
	int p;
	Y y;
	void m1(){
		System.out.println("m1 invoked!!");//1  //3
	}
	
}

class Y{
	Z z;
	void m2(){
		System.out.println("m2 invoked!!");//2  //4
	}
}

class Z{
	void m3(){
		System.out.println("m3 invoked!!");   //5
	}
}
class RandomDemo{
	static int a;
	static X xStatic;
	static Y yStatic;
	int b;
	X xInstance;
	Y yInstance;
	
	public static void main(String[] args){
		RandomDemo.a = 10;
		xStatic = new X();
		yStatic = new Y();
		xStatic.m1();
		yStatic.m2();
		
		RandomDemo d = new RandomDemo();
		d.b = 10;
		d.xInstance = new X();
		d.yInstance = new Y();
		
		d.xInstance.m1(); // d -> xinstance ->X -> m1
		d.yInstance.m2(); // d -> yinstance ->Y -> m2
		
		d.xInstance.y = new Y();
		d.xInstance.y.z = new Z();
		
		d.xInstance.y.m2();
		d.xInstance.y.z.m3();
		
	}
}