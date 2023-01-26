package pages;

import core.BasePage;

public class ResultadoPage extends BasePage {

    public String obterResultado() {
        esperar("resultado-DNEC");
        return obterTexto("resultado-DNEC");
    }

    public String mensagemFalha() {
        return obterTexto("mensagem-resultado-alerta");
    }
}
