
public class StringsMethods {
	public static void main (String args[]) {
		
		
		System.out.println ();
	}
	public static boolean endsWithRep (String s1, String s2, int n){
		String suffix = s2;
		for(int i=1; i<n; i++){
			suffix += s2;
		}
		return s1.endsWith(suffix);
	}
}
