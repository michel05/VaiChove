package br.com.ad.bd;

import java.util.ArrayList;
import java.util.List;

import br.com.ad.model.Cidade;

public class Cidades {

	public List<Cidade> listaCidades;
	
	public Cidades() {
		listaCidades = new ArrayList<Cidade>();
		listaCidades.add(new Cidade("Goiania", "21", "139", "74000", "br"));
		listaCidades.add(new Cidade("RioDeJaneiro", "22", "139", "75000", "br"));
		listaCidades.add(new Cidade("Salvador", "22", "139", "76000", "br"));
		listaCidades.add(new Cidade("Brasilia", "21", "139", "77000", "br"));
		listaCidades.add(new Cidade("SaoPaulo", "26", "139", "78000", "br"));
		listaCidades.add(new Cidade("BeloHorizonte", "27", "139", "79000", "br"));
		listaCidades.add(new Cidade("Cuiaba", "51", "139", "71000", "br"));
	}
	
}
