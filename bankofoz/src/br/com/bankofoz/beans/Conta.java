package br.com.bankofoz.beans;

import br.com.bakofoz.util.PadraoConta;

public class Conta implements PadraoConta{

	private short numero;
	private byte digito;
	private short agencia;
	private float saldo;
	private Cliente cliente;


	public float verificarSaldo(float limte) {
		if (this instanceof Poupanca)
			return saldo;
	}else if (this instanceof Corrente) {
		return saldo+limte;
	}else {
		return 0;
	}

	}


public String getAll() {
	return
			"Numero......:  " + numero + "\n" +
			"Digito......: " + digito + "\n" +
			"Agencia....: " + agencia + "\n" +
			"Saldo.......: " + saldo + "\n" +
			cliente.getAll();			
}





public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente) {
	this.numero = numero;
	this.digito = digito;
	this.agencia = agencia;
	this.saldo = saldo;
	this.cliente = cliente;
}



public Conta() {
	super();
}



public Conta(short numero, byte digito, short agencia, float saldo, Cliente cliente) {
	super();
	this.numero = numero;
	this.digito = digito;
	this.agencia = agencia;
	this.saldo = saldo;
	this.cliente = cliente;
}



public short getNumero() {
	return numero;
}
public void setNumero(short numero) {
	this.numero = numero;
}
public byte getDigito() {
	return digito;
}
public void setDigito(byte digito) {
	this.digito = digito;
}
public short getAgencia() {
	return agencia;
}
public void setAgencia(short agencia) {
	this.agencia = agencia;
}
public float getSaldo() {
	return saldo;
}
public void setSaldo(float saldo) {
	this.saldo = saldo;
}
public Cliente getCliente() {
	return cliente;
}
public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}



@Override
public boolean sacar(float valor) {
	// TODO Auto-generated method stub
	return false;
}





@Override
public boolean depositar(float valor) {
	// TODO Auto-generated method stub
	return false;
}








}
