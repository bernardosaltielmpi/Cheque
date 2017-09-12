package model;

import java.util.Date;

public class Cheque {
	
	private int id;
	private int numero;
	private Date data;
	private Date recebido;
	private Date repassado;
	private Date bomPara;
	private String banco;
	private double valor;
	private Pessoa titular;
	private Pessoa recebidoDe;
	private Pessoa pagoPara;
	private String status;
	private String descricao;
	private String conta;
	private String agencia;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Date getRecebido() {
		return recebido;
	}
	public void setRecebido(Date recebido) {
		this.recebido = recebido;
	}
	public Date getRepassado() {
		return repassado;
	}
	public void setRepassado(Date repassado) {
		this.repassado = repassado;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Pessoa getTitular() {
		return titular;
	}
	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}
	public Pessoa getRecebidoDe() {
		return recebidoDe;
	}
	public void setRecebidoDe(Pessoa recebidoDe) {
		this.recebidoDe = recebidoDe;
	}
	public Pessoa getPagoPara() {
		return pagoPara;
	}
	public void setPagoPara(Pessoa pagoPara) {
		this.pagoPara = pagoPara;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getBomPara() {
		return bomPara;
	}
	public void setBomPara(Date bomPara) {
		this.bomPara = bomPara;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	

}
