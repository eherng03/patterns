package es.unileon.designpatterns;

public abstract class Product implements Component{

    private String description;
    private double price;
    private Builder handlerBuilder;

    public Product(String description){
        this.description = description;
    }

    public void setHandlerBuilder(Builder builder){
        this.handlerBuilder = builder;
    }

    public Handler getHandler(){
        return this.handlerBuilder.getHandler();
    }

    public void constructHandler(){
        this.handlerBuilder.createHandler();
        this.handlerBuilder.setTypeHandler();
    }

    @Override
    public void addComponent(Component component){
    }

    //TODO patron strategy
    public abstract void setPrice();


}
