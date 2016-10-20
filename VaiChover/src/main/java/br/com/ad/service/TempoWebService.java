package br.com.ad.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class TempoWebService {

	private String APPID = "3355629b20fcacc6921f1dd4a923fef9";

	public String busqueTempoPorCidade(String cidade) {
		Client c = Client.create();
		WebResource wr = c.resource("http://api.openweathermap.org/data/2.5/weather?q=" + cidade + "&appid=" + APPID);

		return arrumeJson(wr.get(String.class));
	}

	public String busqueTempoPorCep(String cep, String pais) {
		Client c = Client.create();
		WebResource wr = c
				.resource("http://api.openweathermap.org/data/2.5/weather?zip=" + cep + "," + pais + "&appid=" + APPID);
		return arrumeJson(wr.get(String.class));
	}

	public String busqueTempoPorCordenada(String lat, String log) {
		Client c = Client.create();
		WebResource wr = c.resource(
				"http://api.openweathermap.org/data/2.5/weather?lat=" + lat + "&lon=" + log + "&appid=" + APPID);
		return arrumeJson(wr.get(String.class));
	}

	private String arrumeJson(String json) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonParser jp = new JsonParser();
		JsonElement je = jp.parse(json);
		return gson.toJson(je);
	}
}
