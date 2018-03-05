package es.unileon.designpatterns;

public abstract class Product implements Component{

    protected String description;
    protected double price;
    protected ProductHandler productHandler;

    @Override
    public void addComponent(Component component){
        //Nothing
    }

    @Override
    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public Handler getHandler(){
        return this.productHandler;
    }

    public double getPrice(){
        return this.price;
    }

    public abstract void setPrice();


}
