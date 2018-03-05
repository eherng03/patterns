package es.unileon.designpatterns;

public class PSProduct extends Product{

    //Attributes

    //Own methods

    public PSProduct(){
        setPrice();
        this.productHandler = new ProductHandler();
        this.productHandler.setType("PS");
    }

    @Override
    public void setPrice() {
        //TODO patron strategy

    }
}
