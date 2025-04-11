package ConceptOfAbstraction;
public class Main {
    public static void main(String[] args)
    {
        rectangle s1 = new rectangle();
        s1.l = 5;
        s1.b = 6;
        System.out.println("Area of rectangle: " + s1.area());
        System.out.println("Perimeter of Rectangle: " + s1.perimeter());

        circle s2 = new circle();
        s2.r = 7;
        System.out.println("Area of Circle: " + s2.area());  
        System.out.println("Perimeter of Circle" +s2.perimeter());


    }

}
