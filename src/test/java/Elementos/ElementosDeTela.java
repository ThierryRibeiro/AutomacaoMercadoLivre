package Elementos;

import org.openqa.selenium.By;

public class ElementosDeTela {
		
	private By preencherCampoDeTexto = By.id("cb1-edit");
	
	private By btnClicarLupa = By.xpath("/html/body/header/div/div[2]/form/button/div");
	
	private By btnAppleIpad = By.xpath("//*[@id=\":R1agl9b9:\"]/div[2]/div/div/div[1]/a/img");
	
	private By btnCarrinho = By.xpath("//*[@id=\":R9j9ahit7k:\"]/span");

	public By getPreencherCampoDeTexto() {
		return preencherCampoDeTexto;
	}

	public By getBtnClicarLupa() {
		return btnClicarLupa;
	}

	public By getBtnAppleIpad() {
		return btnAppleIpad;
	}

	public By getBtnCarrinho() {
		return btnCarrinho;
	}

}
