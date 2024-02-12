package lambda.introduction.methodreferences;

public class DuckHelper implements LearnToSpeak {

	@Override
	public void speak(String sound) {
	
		System.out.println(sound);
		
	}

	public static void teacher(String sound, LearnToSpeak trainer) {
		
		trainer.speak(sound);
				
	}

	
}
