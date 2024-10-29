// Java program to find X-th triangular
// matchstick number
public class TriangularPyramidNumber {
	public static int numberOfSticks(int x)
	{
		return (3 * x * (x + 1)) / 2;
	}
	public static void main(String[] args)
	{
		System.out.println(numberOfSticks(7));
	}
}
