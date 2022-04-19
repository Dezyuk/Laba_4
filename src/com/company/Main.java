package com.company;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // write your code here
        first();
        //second();
    }

    /**
     * Фамилия
     * Специальность
     * Год поступления
     * Оценка по физике
     * Оценка по математике
     * Оценка по информатике
     * <p>
     * Определить количество студентов, учащихся на 3
     * курсе и старше и напечатать все сведения о них.
     */

    public static void first() {
        Student[] students = new Student[50];
        String[] str = {"Stone", "Evans", "Roberts", "Mills", "Lewis", };
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].setSurname(str[(int) (Math.random() * str.length)]);
            students[i].setSpecialityTitle("Manager" + (i + 1));
            students[i].setAdmissionYear(LocalDate.now().minusYears((int) (Math.random() * 6)).getYear());
            students[i].setGradePhysics((int) (Math.random() * 101));
            students[i].setGradeMathematics((int) (Math.random() * 101));
            students[i].setGradeInformatics((int) (Math.random() * 101));
            if (LocalDate.now().getYear() - students[i].getAdmissionYear() >= 2) {
                System.out.println(students[i].toString());
            }
        }

    }

    /**
     * Вариант 16
     * <p>
     * Фамилия работника
     * Должность
     * Дата подписания контракта
     * Срок действия контракта
     * Оклад
     * <p>
     * Вывести сведения о работниках, подписавших контракт
     * менее года назад.
     */

    public static void second() {
        Human[] human = new Human[50];
        String[] str = {"Stone", "Evans", "Roberts", "Mills", "Lewis"};
        for (int i = 0; i < human.length; i++) {
            human[i] = new Human();
            human[i].setSurname(str[(int) (Math.random() * str.length)]);
            human[i].setPosition("Manager" + (i + 1));
            human[i].setSigning_contract(LocalDate.now().minusYears((int) (Math.random() * 4)).minusMonths((int) (Math.random() * 13)).minusDays((int) (Math.random() * 20)));
            human[i].setContract_end();
            human[i].setIncome((int) (((Math.random() * 100) * 500)) + 10000);
            if ((LocalDate.now().getYear() - human[i].getSigning_contract().getYear()) == 1) {
                if ((LocalDate.now().getMonthValue() - human[i].getSigning_contract().getMonthValue()) == 0) {
                    if ((LocalDate.now().getDayOfMonth() - human[i].getSigning_contract().getDayOfMonth()) < 0) {
                        System.out.println(human[i].toString());
                    }
                } else if ((LocalDate.now().getMonthValue() - human[i].getSigning_contract().getMonthValue()) < 0) {
                    System.out.println(human[i].toString());
                }
            } else if ((LocalDate.now().getYear() - human[i].getSigning_contract().getYear()) < 1) {
                System.out.println(human[i].toString());
            }
        }
    }
}