package entities;

public class Product{
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    //Passamos o argumento pois é um método static
    //Métodos estáticos pertencem à classe e não têm acesso direto a instâncias da classe
    //Eles são associados à classe como um todo, não a instâncias específicas.
    public static boolean staticProductPredicate(Product p) {
        return p.getPrice() >= 100.0;
    }
    //Não passamos o objeto como argumento pois já estamos dentro da instância da classe.
    public boolean nonStaticProductPredicate() {
        return price >= 100.0;
    }
    @Override
    public String toString() {
        return name+", "+ String.format("%.2f", price);
    }
}
