/*  
    Time Complexity: O(N)
    Space Complexity: O(N)

    Where 'N' is the length of the message string.
*/

public class Solution {
    public static String encode(String message) {
        int n = message.length();

        StringBuilder encodedMessage = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char curChar = message.charAt(i);
            int charFreq = 1;
            while (i + 1 < n && message.charAt(i + 1) == curChar) {
                i++;
                charFreq++;
            }

            encodedMessage.append(curChar);
            encodedMessage.append("" + charFreq);
        }

        return encodedMessage.toString();
    }
}
