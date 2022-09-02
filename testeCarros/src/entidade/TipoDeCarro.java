package entidade;

public abstract class TipoDeCarro {

	private double taxaDiaria;
	private double taxaSemanal;
	private double multaPorDia;
	
	
	//Construtor

	public TipoDeCarro(){
		super();
	}


	public double getTaxaDiaria() {
		return taxaDiaria;
	}


	public void setTaxaDiaria(double taxaDiaria) {
		this.taxaDiaria = taxaDiaria;
	}


	public double getTaxaSemanal() {
		return taxaSemanal;
	}


	public void setTaxaSemanal(double taxaSemanal) {
		this.taxaSemanal = taxaSemanal;
	}


	public double getMultaPorDia() {
		return multaPorDia;
	}


	public void setMultaPorDia(double multaPorDia) {
		this.multaPorDia = multaPorDia;
	}
	
}

