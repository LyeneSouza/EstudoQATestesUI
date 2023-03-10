package pages.localidade;

import core.BasePage;
import org.openqa.selenium.By;

import static core.DriverFactory.getDriver;

public class BuscaPage extends BasePage {

    public void acessarPagina() {
        getDriver().get("https://buscacepinter.correios.com.br/app/localidade_logradouro/index.php");
    }

    public void selecionarUF(String uf) {
        selecionarCombo("uf", uf);
    }

    public void escreverLocalidade(String localidade) {
        escrever("localidade", localidade);
    }

    public String verificarLocalidade() {
        return obterValorCampo("localidade");
    }

    public void clicarEmAjuda() {
        clicarBotao("ajuda_pesq_localidade");
    }

    public void selecionarLetra(String letra) {
        esperarSerClicavel("div_modal_letra_localidade");
        clicarLink(letra);
    }

    public void selecionarCidade(String cidade) {
        esperarNaoVazio("resultado-DNEC-localidade");
        clicarLink(cidade);
    }

    public void selecionarTipo(String tipo) {
        selecionarCombo("tipologradouro", tipo);
    }

    public void escreverLogradouro(String logradouro) {
        escrever("logradouro", logradouro);
    }

    public void escreverNumero(String numero) {
        escrever("numeroLogradouro", numero);
    }

    public void buscar() {
        clicarBotao("btn_pesquisar");
    }
    public String mensagemFalha() {
        return obterTexto(By.xpath("//*[@class='msg']"));
    }
}
