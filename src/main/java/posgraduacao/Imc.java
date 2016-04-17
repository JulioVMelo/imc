package posgraduacao;

public class Imc {

	float peso;
	float altura;
	int resultado;
	
	public int calculoImc(float peso, float altura){
		resultado = (int) (peso * (altura*2));
		return resultado;
	}
	
}
