package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver;
	
	@Given("Abrir Chrome")
	public void abrir_Chrome() {
		System.out.println("En este paso abre el navegador Google Chrome");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Iplacex\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ced.iplacex.cl/login/index.php");
	}
	
	@When("Ingresa Username {String} y Password {String}")
	public void ingresar_Username_y_Password(String string, String string2) {
		System.out.println("En este pcaso ingresa las credenciales de usuario");
		driver.findElement(By.id("username")).sendKeys("string");
		driver.findElement(By.id("password")).sendKeys("string2");
	}
	
	@Then("Inicia sesion")
	public void inicia_sesion() {
		System.out.println("En este paso inicia sesion con los datos ingresados desde nuestro archivo MyTest.feature");
		driver.findElement(By.id("loginBtn")).click();
	}
}
