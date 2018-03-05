package es.unileon.designpatterns;
public class MultiplicarPorDos extends DecoradorNumero{ //clase concreta: puede tener otras clases decorativas concretas: todas son un Numero.
	Numero numero;
	public MultiplicarPorDos(Numero viejo) {
		this.numero = viejo;
	}
	public Double operacion(Double otro) {
		return numero.operacion(otro) + otro;
	}
	

}