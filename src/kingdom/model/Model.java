package kingdom.model;

import java.util.HashSet;
import java.util.Set;

public class Model {
	
	public boolean containsAllChars(String container, String containee) {
		boolean status = stringToCharacterSet(container).containsAll(stringToCharacterSet(containee));
		return status;
	}
	public Set<Character> stringToCharacterSet(String s) {
	    Set<Character> set = new HashSet<>();
	    for (char c : s.toCharArray()) {
	        set.add(Character.toUpperCase(c));
	    }
	    return set;
	}
}
