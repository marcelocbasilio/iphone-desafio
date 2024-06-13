import com.marcelocbasilio.model.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iPhone = new Iphone();

        iPhone.ligar("+5585999998888");
        iPhone.atender("+5585988889999");
        iPhone.iniciarCorreioVoz("ONE, TWO, THREE, TESTING", "+5585988887777");

        iPhone.exibirPagina("https://www.dio.me");
        iPhone.adicionarNovaAba("https://www.dio.me");
        iPhone.atualizarPagina("https://www.dio.me");

        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica("Californication");
    }
}