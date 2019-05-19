package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Aleksei");

        Point p1 = new Point(3, 4);
        Point p2 = new Point(5, 7);

        System.out.println("Расстояние между точками " + "p1(" + p1.x + ";" + p1.y + ") и " + "p2(" + p2.x + ";" + p2.y + ") = " + p1.distance(p2));

        Square s = new Square(5);
        System.out.println("Площдь квадрата со стороной " + s.l + " = " + s.area());

        Ractangle r = new Ractangle(4, 6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
    }

        public static void hello (String somebody){
            System.out.println("Hello, " + somebody + "!");
        }



    }
