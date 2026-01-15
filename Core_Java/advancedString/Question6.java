package advancedString;
import java.util.*;
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> mp = new HashMap<>();

        for (char ch : str.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        int mx = 0;
        char ans = ' ';
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > mx) {
                mx = entry.getValue();
                ans = entry.getKey();
            }
        }
        System.out.println("Max Occurring Character: " + ans + ", times: " + mx);
    }
}
