package assignment1;

public class StringHandler {

    /**
     * 
     * @param str
     * @return a string where all characters 'c' is replaced by the character 's'
     * Case insensitive.
     */
    public String stringManipulation(String str) {
        String newStr = str.replace('c','s');
        return newStr;
    }

    /**
     * 
     * @param str
     * @return the length of str
     * If the input str is null or "" you must return 0
     * 
     */
    public int stringLength(String str) {
        if (str != null && !str.isEmpty()) {
            return str.length();
        } else {
            return 0;
        }
    }

    /**
     * 
     * @param arr
     * @return the cumulative length of all strings in arr
     * e.g. if arr is ["hi","hello","hej"] the method should return 10
     */
    public int stringArrayLength(String[] arr) {
        int totalLengthOfString = 0;

        for (String str : arr){
            totalLengthOfString += str.length();
        }
        return totalLengthOfString;
    }

    /**
     * 
     * @param str
     * @return reverse the characters in the String str
     * e.g. "Hello" -> "olleH"
     */
    public String stringReverse(String str) {
        StringBuilder StringBuild = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            StringBuild.append(str.charAt(i));
        }
        return StringBuild.toString();
    }

    /**
     * 
     * @param str any string
     * @param c the character to count
     * @return how many occurences of the character c in the String str
     * The method should not be case sensitive.
     * e.g. parameters: "Change comes through passion", 'g' should return 2
     */
    public int charCount(String str, char c) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(c)){
                count++;
            }
        }
        return count;
    }

    /**
     * Returns a string that contains exactly the amount of chars c, as stated by the given amount. So if amount => 4 and
     * char => c then the return value must be "cccc". If amount => 3 and c => X then the return value must be "XXX".
     *
     * @param amount The amount of chars in the return string
     * @param c      The chars the return string must consist of
     * @return The string created using the given parameters.
     */
    public String stringOfChars(int amount, char c) {
        StringBuilder newStringBuilder = new StringBuilder();
        for (int i = 0; i < amount; i++) {
            newStringBuilder.append(c);
        }
        return newStringBuilder.toString();
    }


}
