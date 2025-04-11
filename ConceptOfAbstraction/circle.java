package ConceptOfAbstraction;
public class circle extends shape {
    double r;

    @Override
    public double perimeter(){
        return 2*Math.PI*r;
    }

    @Override
    public double area(){
        return Math.PI * r * r;
    }
}
