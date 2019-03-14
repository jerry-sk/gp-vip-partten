package factory;

public class TbFactory implements FactoryMethod {
    public Shoes createShoes() {
        System.out.println("生产一双特步");
        return new TbShoes();
    }
}
