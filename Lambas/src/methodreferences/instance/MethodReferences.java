package methodreferences.instance;

public class MethodReferences {
	
	
	public static void makeCheck(String sound) {		
				
		/*StringStart ss = new StringStart() {			
			public boolean beginingCheck(String s) {

				if(s.startsWith("c"))
				return true;
				else
				return false;
			}						
		};*/
		
		String str = "classic";
		StringStart ss = str::startsWith;
		
		System.out.println(ss.beginingCheck(sound));
		
		
	}
	
	public static void main(String[] args) {
		
		MethodReferences.makeCheck("c");		

	}
		
}
