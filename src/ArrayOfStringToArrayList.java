import java.util.Arrays;
import java.util.List;

public class ArrayOfStringToArrayList {

	public static void main(String[] args) {
		String[] words = { "ace", "boom", "crew", "dog", "eon" };

		List<String> wordList = Arrays.asList(words);

		for (String e : wordList) {
			System.out.println(e);
		}
	}
}