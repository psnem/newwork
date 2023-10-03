package hashmap;

import java.util.HashMap;

public class Hashmap1 {
	public static void main(String[] args) {
		HashMap<String, Integer> phoneNumbers = new HashMap<>();
        
        phoneNumbers.put("Alice", 123456789);
        phoneNumbers.put("Bob", 987654321);
        
        int aliceNumber = phoneNumbers.get("Alice");
        System.out.println(aliceNumber);
		
		
	}

}
