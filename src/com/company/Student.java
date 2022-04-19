package com.company;

import java.time.LocalDate;

class Student {
    public static final int MAX_EDUCATION_YEARS = 7;
    private String surname;
    private String specialtyTitle;
    private int admissionYear;
    private int gradePhysics;
    private int gradeMathematics;
    private int gradeInformatics;

    public Student() {
        this.surname = "";
        this.specialtyTitle = "";
    }

    public String getSurname() {
        if ((int) surname.charAt(0) != 32) {
            return surname;
        } else {
            System.out.println("Фамилия введена неверно.");
            System.exit(0);
            return "";
        }
    }

    public void setSurname(String str) {
        this.surname = Utilities.correctingSurname(str);
    }

    public String getSpecialityTitle() {
        if ((int) specialtyTitle.charAt(0) != 32) {
            return specialtyTitle;
        } else {
            System.out.println("Такой специальности не существует.");
            System.exit(0);
            return "";
        }
    }

    public void setSpecialityTitle(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int code = ch[i];
            if (i != 0) {
                if (Character.isAlphabetic(ch[i]) || Character.isDigit(ch[i])) {
                    specialtyTitle += ch[i];
                    continue;
                } else {
                    specialtyTitle = " ";
                    break;
                }
            }
            if (i == 0) {
                if (Character.isAlphabetic(ch[i]) && Character.isUpperCase(ch[i])) {
                    specialtyTitle += ch[i];
                } else {
                    specialtyTitle = " ";
                    break;
                }
            }
        }
    }

    public int getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(int year) {
        if (year > LocalDate.now().getYear() || year < (LocalDate.now().getYear() - MAX_EDUCATION_YEARS)) {
            System.out.println("Не может быть студента поступившем в данном году.");
            System.exit(0);
        } else {
            admissionYear = year;
        }
    }

    public boolean isCorrectMark(int mark) {
        return mark <= 100 && mark >= 0;
    }

    public int getGradePhysics() {
        return gradePhysics;
    }

    public void setGradePhysics(int GradeF) {
        gradePhysics = isCorrectMark(GradeF) ? GradeF : -1;
    }

    public int getGradeMathematics() {
        return gradeMathematics;
    }

    public void setGradeMathematics(int GradeM) {
        gradeMathematics = isCorrectMark(GradeM) ? GradeM : -1;
    }

    public int getGradeInformatics() {
        return gradeInformatics;
    }

    public void setGradeInformatics(int GradeI) {
        gradeInformatics = isCorrectMark(GradeI) ? GradeI : -1;
    }

    public String formatMark(int mark) {
        return mark >= 0 ? "" + mark : "Incorrect оценка";
    }

    public String toString() {
        return "[Surname: " + getSurname() + ", Speciality: " + getSpecialityTitle() + ", Admission : " + getAdmissionYear() + ", GradeF : " + formatMark(getGradePhysics()) + ", GradeM : " + formatMark(getGradeMathematics()) + ", GradeI : " + formatMark(getGradeInformatics()) + "]";
    }
}
