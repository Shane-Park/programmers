package shane.programmers;

public class ProgrammersArrayConvertor {

	public static void main(String[] args) {
		String input = 
				"[[0,1,1,1],[1,1,1,1],[1,1,1,1],[0,0,1,0]]";
		String output = input.replaceAll("\\[", "{").replaceAll("\\]", "}");
		System.out.println(output);
	}

}
