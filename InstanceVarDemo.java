
class InstanceVarDemo{
	int a = 10;
	int b = 20;
	static int c = 30;
	
	public static void main(String[] args){
		
		InstanceVarDemo ivd1 = new InstanceVarDemo();
		ivd1.a = 100;
		ivd1.b = 200;
		InstanceVarDemo ivd2 = new InstanceVarDemo();
		ivd2.a = 300;
		ivd2.b = 400;
		InstanceVarDemo ivd3 = new InstanceVarDemo();
		ivd3.a = 500;
		ivd3.b = 600;
		System.out.println(ivd1.a);
		System.out.println(ivd1.b);
		System.out.println(ivd2.a);
		System.out.println(ivd2.b);
		System.out.println(ivd3.a);
		System.out.println(ivd3.b);
		System.out.println("***************");
		ivd1 = ivd2;
		System.out.println(ivd1.a);
		System.out.println(ivd1.b);
		System.out.println(ivd2.a);
		System.out.println(ivd2.b);
		System.out.println(ivd3.a);
		System.out.println(ivd3.b);
		
		ivd1.a = 700;
		ivd2.b = 800;
		System.out.println(ivd2.a);
		System.out.println(ivd1.b);
		System.out.println(ivd1 == ivd3);
		ivd3 = ivd1;
		System.out.println(ivd2 == ivd3);
		System.out.println(ivd1 == ivd3);
		System.out.println(ivd1 == ivd2);
		
		
		
	}
}