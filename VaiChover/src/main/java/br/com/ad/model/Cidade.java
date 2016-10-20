package br.com.ad.model;

public class Cidade {

	
	public String nome;
	public String latitude;
	public String longitude;
	public String cep;
	public String pais;
	
	public Cidade(String nome, String latitude, String longitude, String cep, String pais) {
		this.nome = nome;
		this.latitude = latitude;
		this.longitude = longitude;
		this.cep = cep;
		this.pais = pais;
	}
}
