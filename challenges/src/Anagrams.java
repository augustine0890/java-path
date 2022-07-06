import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    public static void main(String[] args) {
        System.out.println(solve("heart", "earth")); // true
        System.out.println(solve("triangle", "integral")); // true
        System.out.println(solve("toss", "shot")); // false
        System.out.println(solve("table", "bleat")); // true

        System.out.println(solve2("heart", "earth")); // true
        System.out.println(solve2("triangle", "integral")); // true
        System.out.println(solve2("toss", "shot")); // false
        System.out.println(solve2("table", "bleat")); // true

        System.out.println(solve3("heart", "earth")); // true
        System.out.println(solve3("triangle", "integral")); // true
        System.out.println(solve3("toss", "shot")); // false
        System.out.println(solve3("table", "bleat")); // true
    }

    public static boolean solve(String sOne, String sTwo) {
        if (sOne.length() != sTwo.length()) {
            return false;
        }

        Map<Character, Integer> lookup = new HashMap<Character, Integer>();
        for (int i=0; i<sOne.length(); i++) {
            if (lookup.containsKey(sOne.charAt(i))) {
                int count = lookup.getOrDefault(sOne.charAt(i), 1);
                lookup.put(sOne.charAt(i), count+1);
            } else {
                lookup.put(sOne.charAt(i), 1);
            }
        }

        Map<Character, Integer> seqTwo = new HashMap<Character, Integer>();
        for (int i=0; i<sTwo.length(); i++) {
            if (seqTwo.containsKey(sTwo.charAt(i))) {
                int count = seqTwo.getOrDefault(sTwo.charAt(i), 1);
                seqTwo.put(sTwo.charAt(i), count+1);
            } else {
                seqTwo.put(sTwo.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> e: lookup.entrySet()) {
            Character c = e.getKey();
            if (seqTwo.get(c) != e.getValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean solve2(String strOne, String strTwo) {
        if (strOne.length() != strTwo.length()) {
            return false;
        }

        char[] charOne = strOne.toLowerCase().toCharArray();
        char[] charTwo = strTwo.toLowerCase().toCharArray();

        Arrays.sort(charOne);
        Arrays.sort(charTwo);
        return Arrays.equals(charOne, charTwo);
    }

    // Counting array size of 256 to count the occurrence of each character for ASCII
    private static int CHARACTER_RANGE = 256;
    public static boolean solve3(String strOne, String strTwo) {
        if (strOne.length() != strTwo.length()) {
            return false;
        }
        int[] count = new int[CHARACTER_RANGE];
        for (int i=0; i < strOne.length(); i++) {
            // System.out.println(strOne.charAt(i));
            count[strOne.charAt(i)]++;
            count[strTwo.charAt(i)]--;
        }

        for (int i=0; i < CHARACTER_RANGE; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
