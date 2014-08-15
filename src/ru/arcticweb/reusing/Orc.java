package ru.arcticweb.reusing;

import static net.mindview.util.Print.print;

class Villain {
    private String name;

    protected void setName(String name) {
        this.name = name;
    }

    Villain(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Я объект Villain и мое имя " + name;
    }
}

public class Orc extends Villain{
    private int orcNumber;

    public Orc(String name,int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }
    public void change(String name, int orcNumber) {
        setName(name);
        this.orcNumber = orcNumber;
    }

    @Override
    public String toString() {
        return "Orc " + orcNumber + ": " + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Лимбургер", 12);
        print(orc);
        orc.change("Боб",19);
        print(orc);
    }


}
