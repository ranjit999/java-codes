class RaceTrack{
	public static void main (String... args){
		Car c1=new Car(2010,"Porsche",25.0);
		System.out.println("year : "+c1.getYear());
		System.out.println("make : "+c1.getMake());
		System.out.println("Beginning_Speed :"+c1.getSpeed());
		c1.Accelerate();
		System.out.println("Accelerated Speed : "+c1.getSpeed());
		
	}
}