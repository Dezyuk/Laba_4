package com.company;


import java.time.LocalDate;

class Human {
    private String surname = "";

    void setSurname(String str) {
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

    String getSurname() {
        if ((int) surname.charAt(0) != 32) {
            return surname;
        } else {
            System.out.println("Фамилия введена неверно.");
            System.exit(0);
            return "";
        }
    }

    private String position = "";

    void setPosition(String str) {
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

    String getPosition() {
        if ((int) position.charAt(0) != 32) {
            return position;
        } else {
            System.out.println("Такого работника нет");
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
            System.out.println("zp<0");
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

public class Main {
    public static void main(String[] args) {
        // write your code here
        second();
        //test();
    }

    public static void test() {
        char c = '9';
        System.out.println((int) c);

    }

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
                System.out.println("aaaaaaaaaaaaaa");
                System.exit(0);
            }
        }
    }
}