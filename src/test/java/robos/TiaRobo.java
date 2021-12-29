package robos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class TiaRobo {
    private ChromeDriver emersonDriver;

    public TiaRobo(){
        WebDriverManager.chromedriver().setup();
        emersonDriver = new ChromeDriver();
    }

    public void acessarUmSite(){

        emersonDriver.get("http://www.estacio.com.br");
    }

    public void fazerLogin(){
        emersonDriver.get("https://sia.estacio.br/sianet/logon");

        //System.out.println("Vou fazer login!");

    }
    public void lancarNota(){
        System.out.println("Vou lançar notas!");

    }
}
