package es.unileon.designpatterns;

public class PSBuilder extends Builder{

    @Override
    public void setTypeHandler() {
        this.handler.setType("PS");
    }

}
