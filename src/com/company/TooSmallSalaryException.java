package com.company;
// Исключения должны иметь поле, в котором хранится значение,
// которое привело к исключению (некорректная зп или имя).

 class TooSmallSalaryException extends Exception{

    double salary;

    TooSmallSalaryException(double salary) {
        this.salary = salary;

    }

     public TooSmallSalaryException() {

     }

     @Override
     public String getMessage() {
         return "Размер зарплаты меньше 0 : " + salary;
     }


 }
