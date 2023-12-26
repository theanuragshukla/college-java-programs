public class HashCode {
	public static void main(String [] args){
		String s1 = "Hello";
		String s2 = "Hello";
		s1 = s1 + "12" + "3";
		s2 = s2 + "1" + "23";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
