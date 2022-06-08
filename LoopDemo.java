class LoopDemo{
	
	public static void main(String[] args){
		
		int var = 2;
		/*
		for(int i=1;i<=10;i++){
				System.out.println(var +"*"+i+" = "+(var*i));
		}
		*/
		int x = 1;
		while(x <= 10){
			System.out.println(var +"*"+x+" = "+(var*x));
			x++;
		}
		/*
		for(int i=1;i<=20;i++){
			System.out.println("Printing table of "+i);
			for(int j = 1;j<=10;j++){
				System.out.println(i +"*"+j+" = "+(i*j));
			}
			System.out.println("********************");			
		}
		*/
		int p = 1;
		
		while(p <= 20){
			System.out.println("Printing table of "+p);
			int q = 1;
			while(q <= 10){
				System.out.println(p +"*"+q+" = "+(p*q));
				q++;
			}
			p++;
			System.out.println("********************");	
		}
		
		for(int i=1;i<=10;i++){//rows
			for(int j=1;j<= i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=10;i>=1;i--){//rows
			for(int j=1;j<= i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		/*for(int i=1;i<= 10;i++){
			if(i==6){
				break;
			}
			System.out.print(i+" ");
		}*/
		int t = 1;
		while(t <= 10){
			if(t == 6){
				break;
			}
			System.out.print(t+" ");
			t++;
		}
		System.out.println("**********");
		
		for(int i=1;i<= 10;i++){
			//System.out.print(i+" * ");
			if(i %2 != 0){
				continue;
			}
			System.out.print(i+" ");
			
			labelledLoopDemo();
		}
		
		static void labelledLoopDemo(){
			
			outerLoop : for(int  i=0; i<10;i++){
				innerLoop : for(int j=0;j<10;j++){
					if(j == 5){
						continue outerLoop;
					}
					System.out.println(i+" "+j);
					
					if(i == 6){
						break outerLoop;
					}
					
				}
			}
		}
		
		
	}
}