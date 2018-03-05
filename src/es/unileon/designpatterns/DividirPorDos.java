package es.unileon.designpatterns;

public class DividirPorDos extends DecoradorNumero{//clase concreta: puede tener otras clases decorativas concretas: todas son un Numero.
	Numero numero;
	public DividirPorDos(Numero viejo) {
		this.numero = viejo;
	}
	public Double operacion(Double otro) {
		Double aux = numero.operacion(otro);
		return aux/2;
	}
	

}