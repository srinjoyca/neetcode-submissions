class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int one[] = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            one[s1.charAt(i)-'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            System.out.println("i is " + i );
            if (i+s1.length() > s2.length()) {
                return false;
            }
            int count = 0;

            if (one[s2.charAt(i)-'a'] > 0) {
                int two[] = new int[26];
                for (int k = 0; k < one.length; k++) {
                    two[k] = one[k];
                }
                for (int j = i; j < i+s1.length(); j++) {

                    if (two[s2.charAt(j)-'a'] > 0) {
                        count++;
                        two[s2.charAt(j)-'a']--;
                        System.out.println("At j = " + i + " count is " + count);
                    } else {
                        break;
                    }
                }
                if (count == s1.length()) {
                    return true;
                }
            }
        }
        return false;
    }
}
