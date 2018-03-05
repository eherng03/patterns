package es.unileon.designpatterns;

public class DSProduct extends Product{

    //Attributes

    //Methods

    public DSProduct(){
        setPrice();
        this.productHandler = new ProductHandler();
        this.productHandler.setType("DS");
    }

    @Override
    public void setPrice() {
        //TODO patron strategy
    }

}
