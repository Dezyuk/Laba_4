package com.company;


import java.time.LocalDate;

class Human {
    private String surname = "";

    public void setSurname(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int code = (int) ch[i];
            if (i == 0) {
                if (code >= 65 && code <= 90) {
                    surname += ch[i];
                    continue;
                } else {
                    surname = " ";
                    break;
                }
            }
            if (i != 0) {
                if (code >= 97 && code <= 122) {
                    surname += ch[i];
                } else {
                    surname = " ";
                    break;
                }
            }
        }
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

    private String position = "";

    public void setPosition(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int code = (int) ch[i];
            if (i != 0) {
                if ((code >= 97 && code <= 122) || code == 32  || (code >= 48 && code <= 57)) {
                    position += ch[i];
                    continue;
                } else {
                    position = " ";
                    break;
                }
            }
            if (i == 0) {
                if (code >= 65 && code <= 90) {
                    position += ch[i];
                } else {
                    position = " ";
                    break;
                }
            }
        }
    }

    public String getPosition() {
        if ((int) position.charAt(0) != 32) {
            return position;
        } else {
            System.out.println("Такой должности не существует.");
            System.exit(0);
            return "";
        }
    }

    private LocalDate signing_contract;

    public void setSigning_contract(LocalDate data) {
        signing_contract = data;
    }

    public LocalDate getSigning_contract() {
        return signing_contract;
    }

    private LocalDate contract_end;

    public void setContract_end() {
        try {
            contract_end = this.getSigning_contract().plusYears(5);
        } catch (Exception e) {
            System.out.println("Сначала укажите дату подписания контракта.");
            System.exit(0);
        }
    }

    public LocalDate getContract_end() {
        return contract_end;
    }

    private int income;

    public void setIncome(int zp) {
        if (zp <= 0) {
            System.out.println("Оклад не может быть меньше 0.");
            System.exit(0);
        } else {
            income = zp;
        }
    }

    public int getIncome() {
        return income;
    }

    public void getInfo() {
        System.out.println("[Surname: " + getSurname() + ", Position: " + getPosition() + ", Sign. contr. : " + getSigning_contract() + ", Contr. end : " + getContract_end() + ", Income : " + getIncome() + "]");
    }
}

/**
 * ----------------------------------------------------------------------------------------------------------------
 */

class Student{
    private String surname = "";

    public void setSurname(String str){
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int code = (int) ch[i];
            if (i == 0) {
                if (code >= 65 && code <= 90) {
                    surname += ch[i];
                    continue;
                } else {
                    surname = " ";
                    break;
                }
            }
            if (i != 0) {
                if (code >= 97 && code <= 122) {
                    surname += ch[i];
                } else {
                    surname = " ";
                    break;
                }
            }
        }
    }
    public String getSurname(){

        if ((int) surname.charAt(0) != 32) {
            return surname;
        } else {
            System.out.println("Фамилия введена неверно.");
            System.exit(0);
            return "";
        }
    }
    private String specialty = "";

    public void setSpeciality(String str){
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int code = (int) ch[i];
            if (i != 0) {
                if ((code >= 97 && code <= 122) || code == 32  || (code >= 48 && code <= 57)) {
                    specialty += ch[i];
                    continue;
                } else {
                    specialty = " ";
                    break;
                }
            }
            if (i == 0) {
                if (code >= 65 && code <= 90) {
                    specialty += ch[i];
                } else {
                    specialty = " ";
                    break;
                }
            }
        }
    }
    public String getSpeciality(){
        if ((int) specialty.charAt(0) != 32) {
            return specialty;
        } else {
            System.out.println("Такой специальности не существует.");
            System.exit(0);
            return "";
        }
    }
    private int admission;
    public void setAdmission(int year){
        if (year>LocalDate.now().getYear() || year<(LocalDate.now().getYear()-6)){
            System.out.println("Не может быть студента поступившем в данном году.");
            System.exit(0);
        }
        else{
            admission=year;
        }
    }
    public int getAdmission(){
        return admission;
    }
    private int gradeF;
    public void setGradeF(int GradeF){
        if (GradeF>100 || GradeF<0){
            System.out.println("Такая оценка не может быть выставлена.");
            System.exit(0);
        }
        else{
            gradeF=GradeF;
        }
    }
    public int getGradeF(){
        return gradeF;
    }
    private int gradeM;
    public void setGradeM(int GradeM){
        if (GradeM>100 || GradeM<0){
            System.out.println("Такая оценка не может быть выставлена.");
            System.exit(0);
        }
        else{
            gradeM=GradeM;
        }
    }
    public int getGradeM(){
        return gradeM;
    }
    private int gradeI;
    public void setGradeI(int GradeI){
        if (GradeI>100 || GradeI<0){
            System.out.println("Такая оценка не может быть выставлена.");
            System.exit(0);
        }
        else{
            gradeI=GradeI;
        }
    }
    public int getGradeI(){
        return gradeI;
    }
    public void getInfo() {
        System.out.println("[Surname: " + getSurname() + ", Speciality: " + getSpeciality() + ", Admission : " + getAdmission() + ", GradeF : " + getGradeF() + ", GradeM : " + getGradeM() + ", GradeI : " + getGradeI() + "]");
    }
}
public class Main {
    public static void main(String[] args) {
        // write your code here
        //first();
        //second();
    }

    /**
     * Фамилия
     * Специальность
     * Год поступления
     * Оценка по физике
     * Оценка по математике
     * Оценка по информатике
     *
     *Определить количество студентов, учащихся на 3
     * курсе и старше и напечатать все сведения о них.
     */

    public static void first() {
        Student[] students =new Student[50];
        String[] str = new String[5];
        str[0] = "Stone";
        str[1] = "Evans";
        str[2] = "Roberts";
        str[3] = "Mills";
        str[4] = "Lewis";
        for (int i = 0; i < students.length; i++) {
            try {
                students[i] = new Student();
                students[i].setSurname(str[(int)(Math.random()*5)]);
                students[i].setSpeciality("Manager" + (i + 1));
                students[i].setAdmission(LocalDate.now().minusYears((int)(Math.random()*6)).getYear());
                students[i].setGradeF((int)(Math.random()*101));
                students[i].setGradeM((int)(Math.random()*101));
                students[i].setGradeI((int)(Math.random()*101));
                if ( LocalDate.now().getYear() - students[i].getAdmission() >= 2){
                    students[i].getInfo();
                }

            } catch (Exception e) {
                System.out.println("Вы ввели некоректные значения, попробуйте еще раз!");
                System.exit(0);
            }
        }

    }

    /**
     * Вариант 16
     *
     * Фамилия работника
     * Должность
     * Дата подписания контракта
     * Срок действия контракта
     * Оклад
     *
     * Вывести сведения о работниках, подписавших контракт
     * менее года назад.
     */
    
    public static void second() {
        Human[] human = new Human[50];
        String[] str = new String[5];
        str[0] = "Stone";
        str[1] = "Evans";
        str[2] = "Roberts";
        str[3] = "Mills";
        str[4] = "Lewis";
        for (int i = 0; i < human.length; i++) {
            try {
                human[i] = new Human();
                human[i].setSurname(str[(int)(Math.random()*5)]);
                human[i].setPosition("Manager" + (i + 1));
                human[i].setSigning_contract(LocalDate.now().minusYears((int) (Math.random() * 4)).minusMonths((int) (Math.random() * 13)).minusDays((int) (Math.random() * 20)));
                human[i].setContract_end();
                human[i].setIncome((int) (((Math.random() * 100) * 500)) + 10000);
                if((LocalDate.now().getYear()-human[i].getSigning_contract().getYear())==1){
                    if((LocalDate.now().getMonthValue() - human[i].getSigning_contract().getMonthValue())==0){
                        if ((LocalDate.now().getDayOfMonth() - human[i].getSigning_contract().getDayOfMonth())<0){
                            human[i].getInfo();
                        }
                    }
                    else if((LocalDate.now().getMonthValue() - human[i].getSigning_contract().getMonthValue())<0){
                        human[i].getInfo();
                    }
                }
                else if ((LocalDate.now().getYear()-human[i].getSigning_contract().getYear()) < 1){
                    human[i].getInfo();
                }

            } catch (Exception e) {
                System.out.println("Вы ввели некоректные значения, попробуйте еще раз!");
                System.exit(0);
            }
        }
    }
}