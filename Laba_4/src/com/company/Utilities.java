package com.company;

public class Utilities {

    public static final int YEAR_NOW = 2022;

    static String correctingSurname(String str) {
        String result = "";
        str = str.strip();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (i != 0) {
                if (Character.isAlphabetic(ch[i]) && Character.isLowerCase(ch[i])) {
                    result += ch[i];
                } else {
                    result = "Unknown";
                    break;
                }
            }

            else {
                if (Character.isAlphabetic(ch[i]) && Character.isUpperCase(ch[i])) {
                    result += ch[i];
                    continue;
                } else {
                    result = "Unknown";
                    break;
                }
            }
        }
        return result;
    }
    static int correctingAdmission(int admission){
        if(YEAR_NOW - admission < 0 || YEAR_NOW - admission > 7){
            return -1;
        }
        else return admission;
    }

    static int correctingGrade(int grade){
        if(grade<0||grade>100){
            return -1;
        }
        else return grade;
    }

    static int correctingIncome(int income){
        if(income>20000&&income<500000){
            return income;
        }
        else return -1;
    }
}
