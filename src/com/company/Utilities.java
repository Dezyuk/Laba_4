package com.company;

public class Utilities {
    static String correctingSurname(String str) {
        String result = "";
        str = str.strip();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (i == 0) {
                if (Character.isAlphabetic(ch[i]) && Character.isUpperCase(ch[i])) {
                    result += ch[i];
                    continue;
                } else {
                    result = " ";
                    break;
                }
            }
            if (i != 0) {
                if (Character.isAlphabetic(ch[i]) && Character.isLowerCase(ch[i])) {
                    result += ch[i];
                } else {
                    result = " ";
                    break;
                }
            }
        }
        return result;
    }
}
