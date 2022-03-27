package com.augustine.challenges;

public class CountCharacter {
    public static int countChar(String s, String c) {
        int totalCount = s.length();
        int afterRemove = s.replace(c, "").length();
        return totalCount - afterRemove;
    }

    public static void main(String[] args) {
        String s = "How many times the given character";
        System.out.print(countChar(s, "c"));
    }
}
