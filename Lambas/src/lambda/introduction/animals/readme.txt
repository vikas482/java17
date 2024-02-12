
1. Basics

a -> a.canHop()
1. a is the parameter name
2. a.canHop() is equal to the implementation of test(Animal a) function present in Interface CheckTrai.java
3. a -> a.canHop() one line is equal to entire implementation of CheckIfHopper


2. Lambda vs Traditional classes 

	print(animals, a -> a.canHop() );
	
	== //equal to
	
	print(animals, (Animal a) -> {			
		return a.canHop();
	} );

	== //equal to
	
	package lambda.introduction.animals;

	public class CheckIfHopper implements CheckTrait {
	
		@Override
		public boolean test(Animal a) {
			// TODO Auto-generated method stub
			return a.canHop();
		}
	
	}
		
3. Important fact

	var checker = a -> a.canHop(); // this will not compile as java wont know which object its referring
	CheckTrait checker = a -> a.canHop(); // this will compile	
		
4. Another fact - below any of the methods is not considered as Functional Interface 

  - equals method is present in Object class and all classes inherit Object class by default 


	package lambda.introduction.animals;
	
	@FunctionalInterface
	public interface Test {
	
		public boolean equals(Object o);
		public String toString();
		public int hashCode();
		
	}


		
				