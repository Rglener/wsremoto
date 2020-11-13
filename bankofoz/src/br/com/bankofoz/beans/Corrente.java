package br.com.bankofoz.beans;

import br.com.bakofoz.util.PadraoConta;

public class Corrente extends Conta implements PadraoConta {
	
	
	private float limte;
	private float taxa;
	
	
	public void debitarTaxa() {
		super.setSaldo(super.getSaldo() - taxa); 
	}
	
	public void aumentarLimite(float porc) {
		limte = limte + limte * (porc/100);
	}
	
	
	public String getAll() {
		return
				super.getAll() + "\n" +
				"Limte .........:  " + limte + "\n" +
				"Taxa...........:  " + taxa ;
				
			}
	
	
		
	
	public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limte, float taxa) {
		super.setAll(numero, digito, agencia, saldo, cliente);
		this.limte = limte;
		this.taxa = taxa;
	}

	public Corrente() {
		super();
	}
	
	public Corrente(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limte, float taxa) {
		super(numero, digito, agencia, saldo, cliente);
		this.limte = limte;
		this.taxa = taxa;
	}
	
	
	public float getLimte() {
		return limte;
	}
	public void setLimte(float limte) {
		this.limte = limte;
	}
	public float getTaxa() {
		return taxa;
	}
	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}



	@Override
	public boolean sacar(float valor) {
		if ((super.getSaldo()+ limte) < valor){
			return false;
			}
		super.setSaldo(super.getSaldo() - valor);
		return true;
	}




	@Override
	public boolean depositar(float valor) {
		if (valor<=0) {
			return false;
		}
		super.setSaldo(super.getSaldo()+valor);
		return false;
	}
	
	
	

}
