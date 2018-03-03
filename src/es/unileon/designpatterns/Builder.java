package es.unileon.designpatterns;

public abstract class Builder {
    protected ProductHandler handler;

    public ProductHandler getHandler() {
        return handler;
    }

    public void createHandler() {
        handler = new ProductHandler();
    }

    public abstract void setTypeHandler();

}
