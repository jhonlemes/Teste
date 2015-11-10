package Exercicio20;

public class Televisor {
	
	private Boolean ligado;
	private Integer canal;
	private Integer volume;
	
	public void imprimir(){
		System.out.println(ligado ? "Televisor ligado." : "Televisor desligado.");
		System.out.println (canal);
		System.out.println (volume);
	}
	
	public Boolean getLigado() {
		return ligado;
	}
	public void setLigado(Boolean ligado) {
		this.ligado = ligado;
	}
	public Integer getCanal() {
		return canal;
	}
	public void setCanal(Integer canal) {
		this.canal = canal;
	}
	public Integer getVolume() {
		return volume;
	}
	public void setVolume(Integer volume) {
		this.volume = volume;
	}

}
