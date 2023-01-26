package steps;

import core.Propriedades;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.BuscaPage;
import pages.ResultadoPage;

import static core.DriverFactory.killDriver;
import static org.junit.Assert.*;

public class BuscarCEPSteps {

    BuscaPage buscaPage = new BuscaPage();
    ResultadoPage resultadoPage = new ResultadoPage();

    @Dado("que estou acessando a aplicação")
    public void queEstouAcessandoAAplicação() {
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

    @Quando("realizo uma busca")
    public void realizoUmaBusca() {
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

    @Então("posso realizar uma nova busca")
    public void possoRealizarUmaNovaBusca() {
        realizoUmaBusca();
        receboOResultado("Rua Treze de Maio - até 469/470");
    }

    @After
    public void fecharBrowser() {
        if(Propriedades.FECHAR_BROWSER) {
            killDriver();
        }
    }
}
