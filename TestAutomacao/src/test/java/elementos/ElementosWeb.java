package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {
	
	public By clicarSpan = By.xpath("//input[@id='epdsubmit']");
	public By preencherCep = By.xpath("//input[@class='fad-input fad-txt-br']");
	public By clicarGo = By.xpath("//a[@data-telium-event='fad_go_universal']");
	public By agendaConsulta = By.xpath("//a[@data-telium-event='footer_request_appt_sub_menu']");
	public By preencherNome = By.xpath("//input[@name='firstName']");
	public By digitarData = By.xpath("//input[@id='dob']");
	public By digitarPhone = By.xpath("//input[@id='phone']");
	public By preencherSobrenome = By.xpath("//input[@name='lastName']");
	public By preencherEmail = By.xpath("//input[@name='email']");
	public By confirmaCep = By.xpath("//input[@id='zip']");
	public By enviarMensagem = By.xpath("//textarea[@id='data.project.shortDescription']");
	public By clicarMensagem = By.xpath("//button[@class='invbtn']");

}
