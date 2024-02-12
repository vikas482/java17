package lambda.methodreferences.staticlambda;

public class MethodReferences {
	
	public static void main(String[] args) {
		
		//Converter methodRef = Math::round;
		
		Converter methodRef = a->Math.round(a);
		
		System.out.println(methodRef.round(10.0));
		
	}
		
}
