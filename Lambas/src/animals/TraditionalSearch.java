package animals;

import java.util.ArrayList;

public class TraditionalSearch {

	public static void main(String[] args) {
		
		var animals = new ArrayList<Animal>();
		
		animals.add(new Animal("Fish",false,true));
		animals.add(new Animal("Kangaroo",true,false));
		animals.add(new Animal("Crocodile",false,true));
		animals.add(new Animal("Tiger",true,false));
		
	
		print(animals, new CheckIfHopper());		
		print(animals, a -> a.canHop() );
		print(animals, (Animal a) -> {return a.canHop();} );
		
		
	}

	private static void print(ArrayList<Animal> animals, CheckTrait checkIfHopper) {
		// TODO Auto-generated method stub
		
		for(Animal animal: animals) {
			
			System.out.println(animal + "");			
		}
		
	} 
	
}
