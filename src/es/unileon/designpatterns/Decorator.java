package es.unileon.designpatterns;

public class Decorator{ //clase a ejecutar para visualizar un ejemplo del uso del patrón Decorator

	public static void main(String args[]){
        Numero inicial = new NumeroConcreto();
        Numero particular = new MultiplicarPorDos(inicial);
        particular = new DividirPorDos(particular);
        System.out.println("Resultado: " + particular.operacion(5.0));
   	}
   
}





