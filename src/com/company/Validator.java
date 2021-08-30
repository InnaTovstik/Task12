package com.company;
//методы
// 1.проверка что зарплата является положительным числом,
// иначе бросается TooSmallSalaryException
// 2.Проверка имени и фамилии - допустимы только символы английского алфавита,
// иначе бросается ImpossibleNameException
//
// Исключения должны иметь поле, в котором хранится значение,
// которое привело к исключению (некорректная зп или имя).
// Обрабатывать эти исключения нужно там, где создаются объекты Employee.
// Можно даже сделать метод createEmployee, который принимает отдельные значения и возвращает объект Employee

    abstract class Validator extends TooSmallSalaryException {
        private String var;

    public String getVar() {
        return var;
    }

    public Validator(String var) {
        super(var);
    }

    public void checkSalary(double salary) throws TooSmallSalaryException {
        System.out.println("check salary");
        if (salary < 0) {
            throw new TooSmallSalaryException(String.valueOf(salary));
        }
        System.out.println("end check salary");
        return;

    }

    public void checkName(String name) throws ImpossibleNameException {
        System.out.println("check name");
        if (name.matches("^[a-zA-Z][a-zA-Z\\s]+$")) {
            throw new ImpossibleNameException(name);
        }
        System.out.println("end check salary");
        return;
    }
}
