package dio.equalshashCode;

import java.util.ArrayList;
import java.util.List;

public class Exec {
	
	public static void main(String[] args) {
		
		// lista de carros utilizando ArrayList
		List<Carro> listCarros = new ArrayList<>();
		
		listCarros.add(new Carro("Ford"));
		listCarros.add(new Carro("Fiat"));
		listCarros.add(new Carro("Volkswagen"));
		
		// imprimindo se tem um carro da marca Ford utilizando o metodo contains = true.
		System.out.println(listCarros.contains(new Carro("Ford")));
		
		// imprimindo o hashCode do atributo marca da classe Carro = 2195706.
		System.out.println(new Carro("Ford").hashCode());
		
		// criado dois objatos carros para comparar com equals.
		Carro carroA = new Carro("Ford");
		Carro carroB = new Carro("Fiat");
		
		// imprime a comparacao de um objato com outro utilizando metodo equals = false.
		System.out.println(carroA.equals(carroB));
		
	}

}
