package metodosuse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosUser {

	WebDriver driver;

	public void abrirNavegador(String url) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

	}
	public void fecharNavegador() {
		driver.quit();
	}

	public void clicarSpan(By elemento) {
		driver.findElement(elemento).click();

	}

	public void preencherCep(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(Keys.chord(texto));

	}

	public void clicarGo(By elemento) {
		driver.findElement(elemento).click();

	}

	public void agendaConsulta(By elemento) {
		driver.findElement(elemento).click();

	}

	public void preencherNome(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(Keys.chord(texto));

	}

	public void digitarData(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(Keys.chord(texto));

	}

	public void digitarPhone(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(Keys.chord(texto));

	}

	public void preencherSobrenome(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(Keys.chord(texto));

	}

	public void preencherEmail(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(Keys.chord(texto));

	}

	public void confirmaCep(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(Keys.chord(texto));

	}

	public void enviarMensagem(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(Keys.chord(texto));

	}

	public void clicarMensagem(By elemento) {
		driver.findElement(elemento).click();
	}

}
