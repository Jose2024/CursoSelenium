package practicaSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PruebaSlenium {

	public static <string> void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		//obtener objetos /webelemtns de la pagina
				
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

//Metodos del Explorador
		String title =  driver.getTitle();
		System.out.println(" el titulo es: " + title);
		
//obtener url
		String url = driver.getCurrentUrl();
		System.out.println("La url es: " + url);
		
		
// metodos de navegacion
		//driver.navigate().back();
		//Thread.sleep(2000);
		//driver.navigate().forward();
		//Thread.sleep(2000);
		//driver.navigate().refresh();
		
// verificar elemento de desplegado en la pagina		
		boolean prodContainer = driver.findElement(By.className("inventory_item_name")).isDisplayed();
		if(prodContainer) {
			System.out.println("El articulo esta desplegado");
		}
		
//obtener text
		String prodName = driver.findElement(By.className("inventory_item_price")).getText();
		System.out.println("ell producto es: " + prodName);
		
// dropsdown
		driver.manage().window().maximize();//maximizar ventana
		Select drpdwnProdSelect = new Select(driver.findElement(By.className("product_sort_container")));
		drpdwnProdSelect.selectByVisibleText("Price (low to high)");
		Thread.sleep(3000);
		drpdwnProdSelect = new Select(driver.findElement(By.className("product_sort_container")));
	    drpdwnProdSelect.selectByValue("hilo");
	    
//cerrar navegador web
	    //driver.close(); // cierra la ventana que esta usando
	    driver.quit(); //cierra todas la ventanas que el webdriver usa
		
		
	}

}
