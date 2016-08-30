
public class NameThatCelebrity {

	public static void main(String[] args) {
		String s1 = "Allan Alda";
		String s2 = "John Wayne";
		String s3 = "Gregory Peck";
		
		int alg1 = s1.length();
		int jog1 = s2.length();
		int grg1 = s3.length();
		
		String alg2 = s1.substring(2,alg1-3);
		String jog2 = s2.substring(2,jog1-3);
		String grg2 = s3.substring(2,grg1-3);
		
		System.out.println(alg2);
		System.out.println(jog2);
		System.out.println(grg2);


	}

}
