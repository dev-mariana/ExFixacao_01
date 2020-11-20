package model;

public class Reptil extends Animal implements IAnimal {
	private boolean capacidadeRegenerativa;

	public Reptil() {
		super();
	}

	public Reptil(String nomenclatura, int numeroDePatas, String cobertoPor, String reproducao, 
		String alimentacao, boolean capacidadeRegenerativa) {
		super(nomenclatura, numeroDePatas, cobertoPor, reproducao, alimentacao);
		this.capacidadeRegenerativa = capacidadeRegenerativa;
	}

	public boolean isCapacidadeRegenerativa() {
		return capacidadeRegenerativa;
	}

	public void setCapacidadeRegenerativa(boolean capacidadeRegenerativa) {
		this.capacidadeRegenerativa = capacidadeRegenerativa;
	}
	
	public void tipoDeRespiracao() {
		System.out.println("Respiração do tipo: Traquial");
	}
	
	@Override
	public void temperaturaCorporal() {
		System.out.println("Temperatura Corporal: Pecilotérmico.");
	}

	@Override
	public void exibir() {
		System.out.println("------------------------------------ Características: ---------------------------------------");
		System.out.println("nomenclatura: " + this.getNomenclatura() + ", de " + this.getNumeroDePatas() + " patas,"
		+ " coberto por " + this.getCobertoPor() + ", reprodução tipo " + this.getReproducao() 
		+ ", possui capacidade regenerativa: " + this.capacidadeRegenerativa);
		this.tipoDeRespiracao();
		this.temperaturaCorporal();
	}
}