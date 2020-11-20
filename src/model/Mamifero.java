package model;

public class Mamifero extends Animal implements IAnimal {
	private String habitat;

	public Mamifero() {
		super();
	}

	public Mamifero(String nomenclatura, int numeroDePatas, String cobertoPor, String reproducao,
	String alimentacao, String habitat) {
		super(nomenclatura, numeroDePatas, cobertoPor, reproducao, alimentacao);
		this.habitat = habitat;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public void tipoDeRespiracao() {
		System.out.println("Respira��o do tipo: Pulmonar");
	}

	@Override
	public void temperaturaCorporal() {
		System.out.println("Temperatura Corporal: Hemeot�rmico.");
	}

	@Override
	public void exibir() {
		System.out.println("------------------------------------ Caracter�sticas: ---------------------------------------");
		System.out.println("nomenclatura: " + this.getNomenclatura() + " de " + this.getNumeroDePatas() + " patas,"
		+ " coberto por " + this.getCobertoPor() + ", reprodu��o tipo " + this.getReproducao() 
		+ ", habitat natural: " + this.habitat);
		this.tipoDeRespiracao();
		this.temperaturaCorporal();
	}
}