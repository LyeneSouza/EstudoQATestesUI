package pages.endereco;

import core.BasePage;

public class ResultadoPage extends BasePage {

    public String obterResultado() {
        esperarNaoVazio("resultado-DNEC");
        return obterTexto("resultado-DNEC");
    }

    public String mensagemFalha() {
        esperarNaoVazio("mensagem-resultado");
        return obterTexto("mensagem-resultado");
    }

    public void novaBusca() {
        esperarSerClicavel("btn_nbusca");
        clicarBotao("btn_nbusca");
    }
}
