package Data_structures;

import java.util.HashMap;

public class HashSearch {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put("Raj", 23);
        hashMap.put("Sahil", 18);
        hashMap.put("Nikki", 21);
        hashMap.put("Arpita", 24);

        // Searching for a key
        String key = "Raj";
        if (hashMap.containsKey(key)) {
            int value = hashMap.get(key);
            System.out.println("Value for key '" + key + "' found: " + value);
        } else {
            System.out.println("Key '" + key + "' not found.");
        }
    }
}
