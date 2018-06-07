import java.util.regex.Pattern;

public class testing {
	static String[] inputs = {"5","10","ggg","78989.908"};
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile(".*[^0-9 + .].*");
		for(String input: inputs){
		           System.out.println( "Is " + input + " a number : "
		                                + !pattern.matcher(input).matches());
		}
	}
}
