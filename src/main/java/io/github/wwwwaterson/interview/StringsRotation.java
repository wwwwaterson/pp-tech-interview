package br.com.alura.codetickets;

/***
 *
 * Strings Rotations of Each Other
 *
 * "You are given two strings s1 and s2, of equal lengths.
 * The task is to check if s2 is a rotated version of the string s1.
 *
 * Note: A string is a rotation of another if it can be formed
 * by moving characters from the start to the end (or vice versa) without
 * rearranging them.
 * "
 *
 *
 * Examples :
 *
 * Input: s1 = "abcd", s2 = "cdab"
 * Output: true
 * Explanation: After 2 right rotations, s1 will become equal to s2.
 *
 * Input: s1 = "aab", s2 = "aba"
 * Output: true
 * Explanation: After 1 left rotation, s1 will become equal to s2.
 *
 * Input: s1 = "abcd", s2 = "acbd"
 * Output: false
 * Explanation: Strings are not rotations of each other.
 *
 *
 *
 */

public class StringsRotation {

    private static boolean isStringRotation(String s1, String s2) {

        String s2Aux = "";
        String lastChar = "";

        int s1Length = s1.length();

        for (int i = 0; i < s1Length; i++) {

            lastChar = String.valueOf(s2.charAt(s2.length() - 1));
            s2Aux = (s2 + lastChar).substring(1);

            if (s2Aux.equalsIgnoreCase(s1)) {
                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {

        String s1 = "abcd";
        String s2 = "cdab";

        StringsRotation.isStringRotation(s1, s2);

    }

}
