package steps;

import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.*;

public class BuscarCEPSteps {

    private WebDriver driver;

    @Dado("que estou acessando a aplicação")
    public void queEstouAcessandoAAplicação() {
        driver = new ChromeDriver();
        driver.get("https://buscacepinter.correios.com.br/app/endereco/index.php");
    }

    @Quando("informo o CEP {string}")
    public void informoOCEP(String string) {
        driver.findElement(By.id("endereco")).clear();
        driver.findElement(By.id("endereco")).sendKeys(string);
    }

    @Quando("informo o tipo do CEP {string}")
    public void informoOTipoDoCEP(String string) {
        WebElement element = driver.findElement(By.id("tipoCEP"));
        Select combo = new Select(element);
        combo.selectByVisibleText(string);
    }

    @Quando("seleciono Buscar")
    public void selecionoBuscar() {
        driver.findElement(By.id("btn_pesquisar")).click();
    }

    @Então("recebo o resultado da busca")
    public void receboOResultadoDaBusca() {
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.id("//*[@id='painel_form_consulta']")));

//        String nome = driver.findElement(By.xpath("//table[@id='resultado-DNEC']/tbody//td[1]")).getText();
        //String nome = driver.findElement(By.xpath("//*[@id='resultado-DNEC']/tbody/tr/td[1]")).getAttribute("value");
//        String bairro = driver.findElement(By.xpath("//table[@id='resultado-DNEC']/tbody/tr/td[2]")).getText();
//        String localidade = driver.findElement(By.xpath("//table[@id='resultado-DNEC']/tbody/tr/td[3]")).getText();
//        String cep = driver.findElement(By.xpath("//table[@id='resultado-DNEC']/tbody/tr/td[4]")).getText();

//        assertEquals("Rua Treze de Maio - até 469/470", nome);
//        assertEquals("Centro", bairro);
//        assertEquals("Curitiba/PR", localidade);
//        assertEquals("80020-270", cep);
    }

    @Então("recebo a mensagem")
    public void receboAMensagem() {
        String msg = driver.findElement(By.xpath("//*[@class='msg']")).getText();
        assertEquals("Informe o Endereço com no mínimo 2(dois) caracteres!", msg);
    }

    @Então("recebo o aviso")
    public void receboOAviso() {
        String msg = driver.findElement(By.xpath("//*[@id='mensagem-resultado']")).getText();
        assertEquals("Não há dados a serem exibidos", msg);
    }

    @After
    public void fecharBrowser() {
        driver.quit();
    }





//    private  WebDriver driver;
//
//    @Dado("que estou acessando a aplicação")
//    public void queEstouAcessandoAAplicação() {
//        driver = new ChromeDriver();
//        driver.get("https://seubarriga.wcaquino.me/");
//    }
//
//    @Quando("informo o usuário {string}")
//    public void informoOUsuário(String string) {
//        driver.findElement(By.id("email")).sendKeys(string);
//    }
//
//    @Quando("a senha {string}")
//    public void aSenha(String string) {
//        driver.findElement(By.name("senha")).sendKeys(string);
//    }
//
//    @Quando("seleciono entrar")
//    public void selecionoEntrar() {
//        driver.findElement(By.tagName("button")).click();
//    }
//
//    @Então("visualizo a página inicial")
//    public void visualizoAPáginaInicial() {
//        assertEquals("Bem vindo, Lyene!", driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText());
//    }
//
//    @Quando("seleciono Contas")
//    public void selecionoContas() {
//        driver.findElement(By.linkText("Contas")).click();
//    }
//
//    @Quando("seleciono Adicionar")
//    public void selecionoAdicionar() {
//        driver.findElement(By.linkText("Adicionar")).click();
//    }
//
//    @Quando("informo a conta {string}")
//    public void informoAConta(String string) {
//        driver.findElement(By.id("nome")).clear();
//        driver.findElement(By.id("nome")).sendKeys(string);
//    }
//
//    @Quando("seleciono Salvar")
//    public void selecionoSalvar() {
//        driver.findElement(By.tagName("button")).click();
//    }
//
//    @Então("recebo a mensagem {string}")
//    public void receboAMensagem(String string) {
//        assertEquals(string, driver.findElement(By.xpath("//div[starts-with(@class, 'alert alert-')]")).getText());
//    }
//
//    @After(order = 1, value = "@funcionais") // do io.cucumber executa apos cada cenario
//    public void screenshot(Scenario cenario) {
//        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        try {
//            FileUtils.copyFile(file, new File("target" + File.separator + "screenshot" +
//                    File.separator + cenario.getName() + "." + cenario.getLine() + ".jpg"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @After(order = 0, value = "@funcionais") // after com order 0 eh o ultimo a ser executado
//    public void fecharBrowser() {
//        driver.quit();
//    }
}
