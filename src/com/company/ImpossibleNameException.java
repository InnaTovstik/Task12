package com.company;

// Исключения должны иметь поле, в котором хранится значение,
// которое привело к исключению (некорректная зп или имя).

class ImpossibleNameException extends Throwable {

    String name;

    ImpossibleNameException(String name) {
       this.name = name;
    }

    public ImpossibleNameException() {

    }

    @Override
    public String getMessage() {
        return "Имя введено не латинским алфавитом : " + name;
    }

}
