public class LongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k) {

        int[] freq = new int[26];
        int i = 0, j = 0, ans = 0, maxFreq = 0;

        while (j < s.length()) {
            freq[s.charAt(j) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(j) - 'A']);

            if (j - i + 1 - maxFreq <= k) {
                ans = Math.max(ans, j - i + 1);
                j++;
            } else {
                freq[s.charAt(i) - 'A']--;
                i++;
                j++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;

        System.out.println(characterReplacement(s, k)); // Output: 4
    }
}