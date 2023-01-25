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

    @Quando("informo o CEP ou o endereço {string}")
    public void informoOCEPOuOEndereco(String string) {
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

    @Então("recebo o resultado {string}")
    public void receboOResultado(String string) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("resultado-DNEC")));

        String resultado = driver.findElement(By.id("resultado-DNEC")).getText();
        assertTrue(resultado.contains(string));
    }

    @Então("recebo a mensagem {string}")
    public void receboAMensagem(String string) {
        String msg = driver.findElement(By.xpath("//*[@class='msg']")).getText();
        assertEquals(string, msg);
    }

    @Então("recebo o aviso {string}")
    public void receboOAviso(String string) {
        String msg = driver.findElement(By.xpath("//*[@id='mensagem-resultado']")).getText();
        assertEquals(string, msg);
    }

    @After
    public void fecharBrowser() {
        driver.quit();
    }
}
