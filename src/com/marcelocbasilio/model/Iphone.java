package com.marcelocbasilio.model;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {

    private String numero;
    private String mensagem;
    private String destinatario;
    private String url;
    private String musica;

    public Iphone() {
    }

    public Iphone(String numero, String mensagem, String destinatario, String url, String musica) {
        this.numero = numero;
        this.mensagem = mensagem;
        this.destinatario = destinatario;
        this.url = url;
        this.musica = musica;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    @Override
    public void ligar(String numero) {
        this.numero = numero;
        System.out.printf("Ligando para o número %s%n", this.numero);
    }

    @Override
    public void atender(String numero) {
        this.setNumero(numero);
        System.out.printf("Atendendo o número %s%n", this.getNumero());
    }

    @Override
    public void iniciarCorreioVoz(String mensagem, String destinatario) {
        this.mensagem = mensagem;
        this.destinatario = destinatario;
        System.out.printf("Preparando envio de mensagem %s para destinatário %s%n", this.mensagem, this.destinatario);
    }

    @Override
    public void exibirPagina(String url) {
        this.setUrl(url);
        System.out.printf("Carregando a página %s%n", this.getUrl());
    }

    @Override
    public void adicionarNovaAba(String url) {
        this.setUrl(url);
        System.out.printf("Abrindo nova aba com o site %s%n", this.getUrl());
    }

    @Override
    public void atualizarPagina(String url) {
        this.setUrl(url);
        System.out.printf("Atualizando a página %s%n", this.getUrl());
    }

    @Override
    public void tocar() {
        System.out.println("Tocando uma música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando uma música");
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musica = musica;
        System.out.printf("Escolher a música %s%n", this.musica);
    }
}
