package Exercicio20;

public class testeTelevisor {

	public static void main(String[] args) {
		Televisor televisor = new Televisor();
		
		televisor.setLigado(true);
		televisor.setCanal(02);
		televisor.setVolume(09);
		
		televisor.imprimir();

	}

}
