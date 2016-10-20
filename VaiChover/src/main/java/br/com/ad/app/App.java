package br.com.ad.app;

import br.com.ad.bd.Cidades;
import br.com.ad.service.TempoWebService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TempoWebService service = new TempoWebService();

		Cidades cidades = new Cidades();
		cidades.listaCidades.forEach(x -> {
			
			System.out.println("#############################################");
			System.out.println(x.nome);
			System.out.println("Busca por cidade");
			System.out.println(service.busqueTempoPorCidade(x.nome));
			System.out.println(service.busqueTempoPorCep(x.cep, x.pais));
			System.out.println(service.busqueTempoPorCordenada(x.latitude, x.longitude));
			
			System.out.println("#############################################");
			
		});

	}

}
