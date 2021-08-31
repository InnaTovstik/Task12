package com.company;
//написать класс Validator, который будет использоваться внутри конструктора Empoyee.
//В классе Validator должны быть методы:
// 1.проверка что зарплата является положительным числом,
// иначе бросается TooSmallSalaryException
// 2.Проверка имени и фамилии - допустимы только символы английского алфавита,
// иначе бросается ImpossibleNameException
//
// Исключения должны иметь поле, в котором хранится значение,
// которое привело к исключению (некорректная зп или имя).
// Обрабатывать эти исключения нужно там, где создаются объекты Employee.
// Можно даже сделать метод createEmployee, который принимает отдельные значения и возвращает объект Employee

public class Validator extends Exception  {
    public String toString(String var) {
        return "Validator{" +
                "var='" + this.var + '\'' +
                '}';
    }

    private String var;

    public void Validator() {
        Validator valid = new Validator();
        try {
            valid.checkName(this.getVar());
            valid.checkSalary(Double.parseDouble(this.getVar()));
        }
        catch (ImpossibleNameException | TooSmallSalaryException e) {
            e.printStackTrace();
        }
    }


    public String getVar() {
        return var;
    }
    public void checkSalary(double salary) throws TooSmallSalaryException {
        if (salary < 0) throw new TooSmallSalaryException(String.valueOf(salary));
    }

    public void checkName(String name) throws ImpossibleNameException {
        System.out.println("check name");
        if (name.matches("^[a-zA-Z][a-zA-Z\\s]+$")) {
            throw new ImpossibleNameException(name);
        }
        System.out.println("end check name");
        return;
    }
}
