package practicaSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tareaSelenium {

public static <string> void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		//obtener objetos /webelemtns de la pagina
		driver.manage().window().maximize();
		WebElement userNameTxt = driver.findElement(By.id("user-name"));
		WebElement passwordTxt = driver.findElement(By.name("password"));
		WebElement loginBt = driver.findElement(By.xpath("//input[@data-test = 'login-button']"));

		//LOGIN
				userNameTxt.sendKeys("standard_user");
				Thread.sleep(2000);
				passwordTxt.sendKeys("secret_sauce");
				Thread.sleep(2000);
				loginBt.click();
				Thread.sleep(2000);
				
		
				
		// seleccionar producto		
				
				WebElement carPrice = driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket"));		
		carPrice.click();
		Thread.sleep(2000);
		
		
		// clic al carrito
		
		WebElement carComp = driver.findElement(By.className("shopping_cart_link"));		
		carComp.click();
		Thread.sleep(2000);
		
		// confirmar  pedido
		
		WebElement confPed = driver.findElement(By.id("checkout"));		
		confPed.click();
		Thread.sleep(2000);
		
		//llenar datos  de envio
		
		WebElement userNameTxt4 = driver.findElement(By.id("first-name"));
		WebElement usernameTxt2 = driver.findElement(By.name("lastName"));
		WebElement userNameTxt3= driver.findElement(By.name("postalCode"));
		WebElement btnCon = driver.findElement(By.id("continue"));

	
				userNameTxt4.sendKeys("jose");
				Thread.sleep(2000);
				usernameTxt2.sendKeys("Escobedo");
				Thread.sleep(2000);
				userNameTxt3.sendKeys("97386");
				Thread.sleep(2000);
				btnCon.click();
				Thread.sleep(2000);
				
	// finalizar pedido
				WebElement finNs = driver.findElement(By.id("finish"));		
				finNs.click();
				Thread.sleep(2000);	
				
				  driver.quit();
				
	}

}
