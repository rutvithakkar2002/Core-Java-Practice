public class StringCompareTo
 {
	public static void main(String[] args)
	 {
		// length
		// ==
		// equals
		// equalsIgnoreCase
		String s1 = "royal";
		String s2 = "roYal";

		System.out.println(s1.compareTo(s2));// int --> 0 | diff   if same-->return 0, otherwise unicode diff of both string.
		System.out.println(s1.compareToIgnoreCase(s2));
	}
}
