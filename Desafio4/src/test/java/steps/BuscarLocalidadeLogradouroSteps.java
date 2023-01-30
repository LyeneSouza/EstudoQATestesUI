package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.localidade.BuscaPage;
import pages.localidade.ResultadoPage;

import static org.junit.Assert.*;

public class BuscarLocalidadeLogradouroSteps {

    BuscaPage buscaPage = new BuscaPage();
    ResultadoPage resultadoPage = new ResultadoPage();

    @Dado("que estou acessando a página de busca por localidade ou logradouro")
    public void queEstouAcessandoAPáginaDeBuscaPorLocalidadeOuLogradouro() {
        buscaPage.acessarPagina();
    }

    @Quando("informo a UF {string}")
    public void informoAUF(String uf) {
        buscaPage.selecionarUF(uf);
    }

    @Quando("informo a localidade {string}")
    public void informoALocalidade(String localidade) {
        buscaPage.escreverLocalidade(localidade);
    }

    @Quando("informo o tipo {string}")
    public void informoOTipo(String tipo) {
        buscaPage.selecionarTipo(tipo);
    }

    @Quando("informo o logradouro {string}")
    public void informoOLogradouro(String logradouro) {
        buscaPage.escreverLogradouro(logradouro);
    }

    @Quando("informo o numero {string}")
    public void informoONumero(String numero) {
        buscaPage.escreverNumero(numero);
    }

    @Quando("clico em ?")
    public void clicoEm() {
        buscaPage.clicarEmAjuda();
    }

    @Quando("seleciono a letra {string}")
    public void selecionoALetra(String letra) {
        buscaPage.selecionarLetra(letra);
    }

    @Quando("seleciono a cidade {string}")
    public void selecionoACidade(String cidade) {
        buscaPage.selecionarCidade(cidade);
    }

    @Quando("clico em Buscar")
    public void clicoEmBuscar() {
        buscaPage.buscar();
    }

    @Quando("realizo uma busca por localidade ou logradouro")
    public void realizoUmaBuscaPorLocalidadeOuLogradouro() {
        buscaPage.selecionarUF("PR");
        buscaPage.escreverLocalidade("Curitiba");
        buscaPage.escreverLogradouro("Treze de Maio");
        clicoEmBuscar();
    }

    @Quando("clico em Nova Busca")
    public void clicoEmNovaBusca() {
        resultadoPage.novaBusca();
    }

    @Então("recebo o CEP {string}")
    public void receboOCEP(String cep) {
        String resultado = resultadoPage.obterResultado();
        assertTrue(resultado.contains(cep));
    }

    @Então("o campo localidade é preenchido com {string}")
    public void oCampoLocalidadeÉPreenchidoCom(String localidade) {
        String resultado = buscaPage.verificarLocalidade();
        assertEquals(localidade, resultado);
    }

    @Então("posso realizar uma nova busca por localidade ou logradouro")
    public void possoRealizarUmaNovaBuscaPorLocalidadeOuLogradouro() {
        realizoUmaBuscaPorLocalidadeOuLogradouro();
        receboOCEP("80020-270");
    }

    @Então("recebo o aviso informativo {string}")
    public void receboOAvisoInformativo(String aviso) {
        String msgFalha = resultadoPage.mensagemFalha();
        assertEquals(aviso, msgFalha);
    }

    @Então("recebo a mensagem informativa {string}")
    public void receboAMensagemInformativa(String mensagem) {
        String msgFalha = buscaPage.mensagemFalha();
        assertEquals(mensagem, msgFalha);
    }
}
