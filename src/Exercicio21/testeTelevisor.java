package Exercicio21;

public class testeTelevisor {

	public static void main(String[] args) {
		Televisor televisor = new Televisor(null, null, null);
		
		televisor.setLigado(false);
		televisor.setCanal(02);
		televisor.setVolume(10);
		
		televisor.imprimir();

	}

}
