package com.gaamf.snail.algorithm;


public class DiffPostionWord {

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isDiffPositonSameWord(s, t));
    }

    public static boolean isDiffPositonSameWord(String s, String t) {
        int[] cnt = new int[26];
        for (char ch : s.toCharArray()) {
            cnt[ch - 'a']++;
        }

        for (char ch : t.toCharArray()) {
            cnt[ch - 'a']--;
        }

        for (int count : cnt) {
            if (count != 0) return false;
        }
        return true;
    }
}
