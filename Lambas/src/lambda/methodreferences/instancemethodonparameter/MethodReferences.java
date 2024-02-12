package lambda.methodreferences.instancemethodonparameter;

public class MethodReferences {
	

	
	public static void main(String[] args) {
		

		StringStart st1 = String::startsWith;
		
		System.out.println(st1.beginingCheck("Hello","H"));
		
	}
		
}
