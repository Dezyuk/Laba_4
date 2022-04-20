package com.company;

public class Student {
    private String surname;
    private Speciality speciality;
    private int admission;
    private int gradePhysics;
    private int gradeMath;
    private int gradeInformatics;

    public Student(final String surname,final Speciality speciality, final int admission, final int gradePhysics,final int gradeMath,final  int gradeInformatics){
        this.setSurname(surname);
        this.speciality=speciality;
        this.setAdmission(admission);
        this.setGradePhysics(gradePhysics);
        this.setGradeMath(gradeMath);
        this.setGradeInformatics(gradeInformatics);
    }
    public void  setSurname(final String surname){
        this.surname=Utilities.correctingSurname(surname);
    }
    public  String getSurname(){
        return surname;
    }
    public  void  setSpeciality(final Speciality speciality){this.speciality=speciality;}

    public Speciality getSpeciality(){return  speciality;}

    public void setAdmission(final int admission){
        this.admission=Utilities.correctingAdmission(admission);
    }

    public int getAdmission(){return admission;}

    public void setGradePhysics(final int gradePhysics){
        this.gradePhysics=Utilities.correctingGrade(gradePhysics);
    }

    public int getGradePhysics(){return  gradePhysics;}

    public void setGradeMath(final int gradeMath){
        this.gradeMath=Utilities.correctingGrade(gradeMath);
    }

    public int getGradeMath(){return  gradeMath;}

    public void setGradeInformatics(final int gradeInformatics){
        this.gradeInformatics=Utilities.correctingGrade(gradeInformatics);
    }

    public int getGradeInformatics(){return  gradeInformatics;}

    public String toString(){
        return "Student["+
                "Surname=" + surname +
                ", speciality=" + speciality +
                ", admission=" + admission +
                ", grade Physics=" + gradePhysics +
                ", grade Math=" + gradeMath +
                ", grade Informatics=" + gradeInformatics +
                "]";
    }
}

