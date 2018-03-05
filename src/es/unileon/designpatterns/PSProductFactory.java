package es.unileon.designpatterns;

public class PSProductFactory implements Factory{

    @Override
    public Product makeProduct() {
        return new PSProduct();
    }
}
