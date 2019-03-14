package factory;

public class NikeFactory implements FactoryMethod {
    public Shoes createShoes() {
        System.out.println("生产一双NIKE");
        return new NikeShoes();
    }
}
