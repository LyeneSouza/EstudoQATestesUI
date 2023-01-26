package pages;

import core.BasePage;
import org.openqa.selenium.By;

import static core.DriverFactory.getDriver;

public class BuscaPage extends BasePage {

    public void acessarPagina() {
        getDriver().get("https://buscacepinter.correios.com.br/app/endereco/index.php");
    }

    public void escreverCepOuEnd(String cepOuEnd) {
        escrever("endereco", cepOuEnd);
    }

    public void tipoCep(String tipo) {
        selecionarCombo("tipoCEP", tipo);
    }

    public void buscar() {
        clicarBotao("btn_pesquisar");
    }

    public String mensagemFalha() {
        return obterTexto(By.xpath("//*[@class='msg']"));
    }
}
