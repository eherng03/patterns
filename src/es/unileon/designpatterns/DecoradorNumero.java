package es.unileon.designpatterns;

public abstract class DecoradorNumero extends Numero{ //Decorator: de ella heredan su funcionalidad las clases concretas 
	public abstract Double operacion(Double s);

}