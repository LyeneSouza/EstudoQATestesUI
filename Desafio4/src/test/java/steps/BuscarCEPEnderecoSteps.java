package steps;

import core.Propriedades;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.endereco.BuscaPage;
import pages.endereco.ResultadoPage;

import static core.DriverFactory.killDriver;
import static org.junit.Assert.*;

public class BuscarCEPEnderecoSteps {

    BuscaPage buscaPage = new BuscaPage();
    ResultadoPage resultadoPage = new ResultadoPage();

    @Dado("que estou acessando a página de busca por CEP ou endereço")
    public void queEstouAcessandoAPaginaDeBuscaPorCEPOuEndereco() {
        buscaPage.acessarPagina();
    }

    @Quando("informo o CEP ou o endereço {string}")
    public void informoOCEPOuOEndereco(String string) {
        buscaPage.escreverCepOuEnd(string);
    }

    @Quando("informo o tipo do CEP {string}")
    public void informoOTipoDoCEP(String string) {
        buscaPage.tipoCep(string);
    }

    @Quando("realizo uma busca por CEP ou endereço")
    public void realizoUmaBuscaPorCEPOuEndereco() {
        buscaPage.escreverCepOuEnd("80020-270");
        buscaPage.tipoCep("Todos");
        selecionoBuscar();
    }

    @Quando("seleciono Nova Busca")
    public void selecionoNovaBusca() {
        resultadoPage.novaBusca();
    }

    @Quando("seleciono Buscar")
    public void selecionoBuscar() {
        buscaPage.buscar();
    }

    @Então("recebo o resultado {string}")
    public void receboOResultado(String string) {
        String resultado = resultadoPage.obterResultado();
        assertTrue(resultado.contains(string));
    }

    @Então("recebo a mensagem {string}")
    public void receboAMensagem(String string) {
        String msg = buscaPage.mensagemFalha();
        assertEquals(string, msg);
    }

    @Então("recebo o aviso {string}")
    public void receboOAviso(String string) {
        String msg = resultadoPage.mensagemFalha();
        assertEquals(string, msg);
    }

    @Então("posso realizar uma nova busca por CEP ou endereço")
    public void possoRealizarUmaNovaBuscaPorCEPOuEndereco() {
        realizoUmaBuscaPorCEPOuEndereco();
        receboOResultado("Rua Treze de Maio - até 469/470");
    }

    @After
    public void fecharBrowser() {
        if(Propriedades.FECHAR_BROWSER) {
            killDriver();
        }
    }
}
