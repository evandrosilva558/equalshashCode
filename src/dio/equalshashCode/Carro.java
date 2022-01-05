package dio.equalshashCode;

import java.util.Objects;

public class Carro {

	String marca;
	
	
	public Carro(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	// hashCode gera um numero inteiro de hash para o atributo marca facilitando a organizacao na estrutura de dados do Java.
	@Override
	public int hashCode() {
		return Objects.hash(marca);
	}

	// equals testa se um objeto e igual ao outro pela classe e pelo atributo (marca).
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(marca, other.marca);
	}

}
