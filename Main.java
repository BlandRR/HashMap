import java.util.HashMap;

public class Main {

	
	public static void main (String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		Hash hash = new Hash();
		
	//	hash.stringOrder("hello");
		
		hash.readfromFile();
	//	hash.printoutprint();
		
	//	hash.fillMap();
		
	//	hash.Anagrams2("name");
		hash.AnagramsList();
		
		
		hash.anagrammapmost();
	//hash.printhashanagram();
	}
}
