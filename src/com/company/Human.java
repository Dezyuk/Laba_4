package com.company;

import java.time.LocalDate;

class Human {
    private String surname = "";
    private String position = "";
    private LocalDate signing_contract;
    private LocalDate contract_end;
    private int income;

    public Human() {
        this.surname = "";
        this.position = "";
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

    public String getPosition() {
        if ((int) position.charAt(0) != 32) {
            return position;
        } else {
            System.out.println("Такой должности не существует.");
            System.exit(0);
            return "";
        }
    }

    public void setPosition(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int code = ch[i];
            if (i != 0) {
                if (Character.isAlphabetic(ch[i]) || Character.isDigit(ch[i])) {
                    position += ch[i];
                    continue;
                } else {
                    position = " ";
                    break;
                }
            }
            if (i == 0) {
                if (Character.isAlphabetic(ch[i]) && Character.isUpperCase(ch[i])) {
                    position += ch[i];
                } else {
                    position = " ";
                    break;
                }
            }
        }
    }

    public LocalDate getSigning_contract() {
        return signing_contract;
    }

    public void setSigning_contract(LocalDate data) {
        signing_contract = data;
    }

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

    public int getIncome() {
        return income;
    }

    public void setIncome(int zp) {
        if (zp <= 0) {
            System.out.println("Оклад не может быть меньше 0.");
            System.exit(0);
        } else {
            income = zp;
        }
    }

    public String toString() {
        return "[Surname: " + getSurname() + ", Position: " + getPosition() + ", Sign. contr. : " + getSigning_contract() + ", Contr. end : " + getContract_end() + ", Income : " + getIncome() + "]";
    }
}
