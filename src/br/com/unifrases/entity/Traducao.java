package br.com.unifrases.entity;

public class Traducao {

	private Idioma idiomaDeEntreada;
	private Idioma idiomaDeSaida;
	private Frase fraseDeEntrada;
	private Frase fraseDeSaida;
	
	public Idioma getIdiomaDeEntreada() {
		return idiomaDeEntreada;
	}
	
	public void setIdiomaDeEntreada(Idioma idiomaDeEntreada) {
		this.idiomaDeEntreada = idiomaDeEntreada;
	}

	public Idioma getIdiomaDeSaida() {
		return idiomaDeSaida;
	}

	public void setIdiomaDeSaida(Idioma idiomaDeSaida) {
		this.idiomaDeSaida = idiomaDeSaida;
	}

	public Frase getFraseDeEntrada() {
		return fraseDeEntrada;
	}

	public void setFraseDeEntrada(Frase fraseDeEntrada) {
		this.fraseDeEntrada = fraseDeEntrada;
	}

	public Frase getFraseDeSaida() {
		return fraseDeSaida;
	}

	public void setFraseDeSaida(Frase fraseDeSaida) {
		this.fraseDeSaida = fraseDeSaida;
	}

}