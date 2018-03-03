package es.unileon.designpatterns;

public class ProductHandler implements Handler{

    private static int SERIAL_NUMBER = 0;

    private String type;
    private String number;


    public ProductHandler(){
        this.number = String.format("%06d", ++SERIAL_NUMBER);
    }

    public void setType(String type){
        this.type = type;
    }

    //Metodo utilizado para testear
    public static int getSerialNumber(){
        return SERIAL_NUMBER;
    }

    @Override
    public boolean compareTo(Handler handler) {
        return this.toString().equals(handler.toString());
    }

    @Override
    public String toString(){
        return this.type + "-" + String.valueOf(this.number);
    }
}
