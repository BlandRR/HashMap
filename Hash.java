import java.awt.RenderingHints.Key;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Hash {

	ArrayList<String> chars = new ArrayList<>();

	ArrayList<String> words = new ArrayList<String>();

	
	public String stringOrder(String input) {
        char[] chars = input.toLowerCase().toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
     //   System.out.println(sorted);
		return sorted;
	}
	
	
	public void readfromFile() {

		//System.getProperties().
		final String filename = "C:\\Users\\Admin\\" + "WordArray" + ".txt";
	//	final String filename =	"C:\\Users\\Admin\\Desktop\\wordlist.txt";

		FileReader bufout = null;
		BufferedReader bufin = null;
		try {

			bufout = new FileReader(filename);
			bufin = new BufferedReader(bufout);
			String line = "";
			while ((line = bufin.readLine()) != null) {
				words.add(line);
			//	words.add(stringOrder(line));
	
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {
				if (bufout != null) {
					bufout.close();
				}
				if (bufin != null) {
					bufin.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void printoutprint() {
		for (String i : words)
			System.out.println(i);
	}

	
	
	
	HashMap<Integer, String> maplist = new HashMap<>();
	
	public void fillMap() {
		for(int i = 0; i < words.size(); i++) {
			maplist.put(i ,stringOrder(words.get(i)));
			System.out.println(maplist);
		}
	}
	
	
	ArrayList<String> anagrams = new ArrayList<String>();
	
	
	
	public ArrayList<String> getanagrams2(String input) {
		ArrayList<String> anagramsnewlsit = new ArrayList<String>();
		for (int i = 0; i < words.size(); i++) {
			if (input.length() == words.get(i).length()) {
				
				String value = stringOrder(input);
				String anagram = stringOrder(words.get(i));
				
				if (value.equals(anagram)) {
					anagramsnewlsit.add(words.get(i));
				}
		
			}
		}
		return anagramsnewlsit;
	}
	
	
	
	public ArrayList<String> getanagramsList(String input) {
		ArrayList<String> anagramslist = new ArrayList<String>();
		for (int i = 0; i < words.size(); i++) {
			
			if (input.length() == words.get(i).length()) {
				
				String value = (input);
				String anagram = (words.get(i));
				
				if (value.equals(anagram)) {
					anagramslist.add(words.get(i));
				}
		
			}
		}
		return anagramslist;
	}
	
	

	
	HashMap<String, ArrayList<String>> anagrammap = new HashMap<>();
	
	
	public void Anagrams2(String input) {
		anagrammap.put(stringOrder(input), getanagrams2(input));
		System.out.println(anagrams);
		}
	
	

	public void AnagramsList() {
		for (int i = 0; i < words.size(); i++) {
			String current = words.get(i);
		anagrammap.put(stringOrder(current), getanagrams2(current));
		//System.out.println(getanagrams2(current));
		}
		
	}
	
	public void anagrammapmost() {
		for (Entry<String, ArrayList<String>> entry : anagrammap.entrySet()) {
			
		    String key = entry.getKey().toString();
		    int value = entry.getValue().size();
		    ArrayList<String> anagrams = entry.getValue(); 
		    	System.out.println(key + " "+ value + " " + anagrams);
		}
	}
	
	
	

}
