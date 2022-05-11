package day7.leetCode;
/*
You are given two strings s1 and s2 of equal length. A string swap is an operation where you choose two
    indices in a string (not necessarily different) and swap the characters at these indices.
Return true if it is possible to make both strings equal by performing at most one string swap
    on exactly one of the strings. Otherwise, return false.
 */
public class LeetCodeProblemOne {
    public static boolean areAlmostEqual(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i; j < s1.length(); j++) {
                if (s1.equals(stringSwap(s2, i, j)))
                    return true;
            }
        }
        return false;
    }

    private static String stringSwap(String string, int index1, int index2) {
        char[] result = string.toCharArray();
        char buffer = result[index1];
        result[index1] = result[index2];
        result[index2] = buffer;
        return new String(result);
    }
}
