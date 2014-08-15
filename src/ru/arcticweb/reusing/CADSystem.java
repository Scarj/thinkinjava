package ru.arcticweb.reusing;

import static net.mindview.util.Print.print;

class Shape {
    Shape(int i) {
        print("Конструктор Shape()");
    }
    void dispose() {
        print("Завершение Shape()");
    }
}

class Circle extends Shape {
    Circle(int i) {
        super(i);
        print("Рисуем окружность Circle");
    }

    @Override
    void dispose() {
        print("Стираем окружность Circle");
        super.dispose();
    }
}

class Triangle extends Shape {

    Triangle(int i) {
        super(i);
        print("Рисуем треугольник Triangle");
    }

    @Override
    void dispose() {
        print("Стираем треугольник Triangle");
        super.dispose();
    }
}

class Line extends Shape {
    private int start, end;

    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        print("Рисуем линию Line: " + start + ", " + end);
    }

    @Override
    void dispose() {
        print("Стираем линию Line: " + start + ", " +end);
        super.dispose();
    }
}
public class CADSystem extends Shape{
    private Circle circle;
    private Triangle triangle;
    private Line[] lines = new Line[3];

    public CADSystem(int i) {
        super(i);
        for (int j = 0; j < lines.length; j++) {
            lines[j] = new Line(j,j*j);
            circle = new Circle(1);
            triangle = new Triangle(1);
            print("Комбинированный конструктор");
        }
    }

    @Override
    void dispose() {
        print("Завершение в обратном порядке");
        triangle.dispose();
        circle.dispose();
        for (int i = 0; i < lines.length; i++) {
            lines[i].dispose();
        }
        super.dispose();
    }

    public static void main(String[] args) {
        CADSystem x = new CADSystem(47);
        try {
            //Код и обработка исключений
        } finally {
            x.dispose();
        }
    }
}
