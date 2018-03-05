package es.unileon.designpatterns;

public class ElevarCuadrado extends DecoradorNumero{//clase concreta: puede tener otras clases decorativas concretas: todas son un Numero.
	Numero numero;
	public ElevarCuadrado(Numero viejo) {
		this.numero = viejo;
	}
	public Double operacion(Double otro) {
		Double aux = numero.operacion(otro);
		return aux*aux;
	}

}