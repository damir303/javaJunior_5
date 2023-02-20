package lesson7;

public class People {
    //1) модификатор доступа
    //  -public - публичный доступен всем
    //  -private - cкрытый
    //  - ""   -внутри пакета
    //  - protected - наследование

    //2) class
    //3) Наименование
    //4) тело {     }

    private String name ;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name.toUpperCase();
    }
}



