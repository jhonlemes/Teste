package Exercicio21;

public class Televisor {
	
	private Boolean ligado;
	private Integer canal;
	private Integer volume;
	
	public Televisor(Boolean ligado, Integer canal, Integer volume){
		this.ligado = ligado;
		this.canal = canal;
		this.volume = volume;
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
	
	public void imprimir(){
		System.out.println(ligado ? "Televisor ligado." : "Televisor desligado.");
		System.out.println ("Canal: "+canal);
		System.out.println ("Volume: "+volume);
	}

}
