package excercise1;

public class Test { //class that will test the algorithm adn print out the result.

	public static void main (String[] args) { //main body of the class

		Vehicle[] Vehicles= { //Insert information to be used from the other classes and be arranged before being delivered back
		                  new Vehicle("Land Vehicle"),
		                  new Motorcycle("Sport"),
		                  new Automobile("Sedan"),
		                  new Taxi("Ford", "Common", Taxi.Insurance),
		                  new Limousine("Mercedes", "Luxury", Limousine.Insurance)
		};
		
		for(Vehicle  p : Vehicles){ //for condition
			System.out.println("The vehicle information: "+ p);// Information to the user to be printed
			if(p instanceof Motorcycle){ //if condition that will print the below information if fulfilled
				System.out.println("The motorcycle information: "+ p);// Information to the user to be printed
			}
			if(p instanceof Automobile){ //if condition that will print the below information if fulfilled
				System.out.println("The automobile information: "+ p);// Information to the user to be printed
			}
			if(p instanceof Taxi){//if condition that will print the below information if fulfilled
				System.out.println("The taxi information: "+ p);// Information to the user to be printed
			}
			if(p instanceof Limousine){ //if condition that will print the below information if fulfilled
				System.out.println("The limousine information: "+ p);// Information to the user to be printed
			}
		}
	}
}