package lambda.introduction.animals;

@FunctionalInterface
public interface Test {

	public boolean equals(Object o);
	public String toString();
	public int hashCode();
	
	public void test();
}
