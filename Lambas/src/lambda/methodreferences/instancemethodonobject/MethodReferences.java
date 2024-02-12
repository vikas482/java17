package lambda.methodreferences.instancemethodonobject;

public class MethodReferences {
	

	
	public static void main(String[] args) {
		
		var str = "";
		StringStart	ss1 = str::isEmpty;	
		StringStart	ss2 = () -> str.isEmpty();	

		System.out.println(ss1.beginingCheck());
		System.out.println(ss2.beginingCheck());

	}
		
}
