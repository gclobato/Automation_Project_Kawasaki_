package pages;

import static org.junit.Assert.assertEquals;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;
	
	
	
	public void abrirNavegador(String appUrl, String descricaoPasso) {
		// Setup do driver que irá utilizar
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		// Abrir o chromedriver
		driver = new ChromeDriver();
		// Digitar um site e entrar no site
		driver.get(appUrl);

	}

	public void maximizarTela() {
		driver.manage().window().maximize();

	}

	public void fecharNavegador() {
		driver.quit();

	}

	public void escrever(String texto, By elemento) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void submit(By elemento) {
		driver.findElement(elemento).submit();

	}

	public void validarTexto(String textoEsperado, By elemento) {
		String texto = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, texto);
	}

}
