package ConceptOfAbstraction;
public class rectangle extends shape{

    double l,b;

    @Override
    public double area()
    {
        return l*b;
    }

    @Override
    public double perimeter()
    {
        return 2*(l+b);
    }


}
