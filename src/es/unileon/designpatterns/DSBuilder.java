package es.unileon.designpatterns;

public class DSBuilder extends Builder {

    @Override
    public void setTypeHandler() {
        this.handler.setType("DS");
    }
}
