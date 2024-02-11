package methodreferences;

public class MethodReferences {
	
	
	public static void makeSound(String sound) {		
				
		/*LearnToSpeak learner = new LearnToSpeak() {			
			public String speak(String s) {
				System.out.println("Hello");
				return s;				
			}						
		};*/				
		LearnToSpeak learner =  (s)-> System.out.println(s);		
		
		learner.speak(sound);		
		
	    DuckHelper.teacher(sound, learner);
		
	}
	
	public static void main(String[] args) {
		
		MethodReferences.makeSound("classic");		

		Converter methodRef = Math::round;
		System.out.println(methodRef.round(10.0));
		
	}
		
}
