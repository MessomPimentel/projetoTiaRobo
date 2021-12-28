package robos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class TiaRobo {
    private ChromeDriver emersonDriver;

    public void abrirChrome(){
        WebDriverManager.chromedriver().setup();
        emersonDriver = new ChromeDriver();
        //System.out.println("Vou abrir oChrome!");

    }
    public void acessarUmSite(){

        emersonDriver.get("http://www.estacio.com.br");
    }

    public void fazerLogin(){
        System.out.println("Vou fazer login!");

    }
    public void lancarNota(){
        System.out.println("Vou lançar notas!");

    }
}
