package es.unileon.designpatterns;

public class DSProductFactory implements Factory{

    @Override
    public Product makeProduct() {
        return new DSProduct();
    }
}
