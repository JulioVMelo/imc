package posgraduacao;

public class ExibiResultado {

	public static void main(String[] args) {
		int resultado;
		Imc imc = new Imc();
		resultado = imc.calculoImc(peso, altura);
		System.out.println("O imc é:"+resultado);
	}

}
