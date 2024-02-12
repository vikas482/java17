package lambda.methodreferences.constructor;

public class MethodReferences {
	
	public static void main(String[] args) {
		
		//Converter methodRef = Math::round;
		
		StringCreator methodRef = () -> new String();
		StringCreator methodRef1 = String::new;
		var myString = methodRef1.create();
		System.out.println(myString.equals(""));
		
	}
		
}
