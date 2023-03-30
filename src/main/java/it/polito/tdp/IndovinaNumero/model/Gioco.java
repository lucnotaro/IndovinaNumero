package it.polito.tdp.IndovinaNumero.model;

public class Gioco {

	public enum OutcomeGioco{
		Vinto,
		Perso,
		ToppoAlto,
		TroppoBasso
	}
	
	//Dati di funzionamento dell'applicazione
	private int TMax=8;
	private int NMax=100;
	private int NTentativiFatti;
	private int numeroSegreto;
	
	public int getNTentativiFatti() {
		return NTentativiFatti;
	}

	public void setNTentativiFatti(int nTentativiFatti) {
		NTentativiFatti = nTentativiFatti;
	}

	public int getNumeroSegreto() {
		return numeroSegreto;
	}

	public void setNumeroSegreto(int numeroSegreto) {
		this.numeroSegreto = numeroSegreto;
	}

	public int getTMax() {
		return TMax;
	}

	public int getNMax() {
		return NMax;
	}

	//inizializzare variabili del gioco
	public void iniziagioco(Difficolta livello) {
		this.NMax=livello.getNMax();
		this.TMax=livello.getTMax();
		this.NTentativiFatti = 0;
    	this.numeroSegreto = (int)(Math.random()*this.NMax) + 1;
    }
	 
	public OutcomeGioco faiTentativo(int tentativo) {
    	this.NTentativiFatti++;
    	if (tentativo == this.numeroSegreto) {  
    		return OutcomeGioco.Vinto;
    	}
    	if (this.NTentativiFatti == this.TMax) {
    		return OutcomeGioco.Perso;
    	}
    	if(tentativo>this.numeroSegreto) {
    		return OutcomeGioco.ToppoAlto;
    	}else  {
    		return OutcomeGioco.TroppoBasso;
    	}
	}
	
	
	
	
}
