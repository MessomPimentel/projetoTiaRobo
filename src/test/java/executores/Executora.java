package executores;

import robos.TiaRobo;

public class Executora {
    public static void main(String[] args){
        TiaRobo umaTiaRobo = new TiaRobo();

        umaTiaRobo.abrirChrome();
        umaTiaRobo.acessarUmSite();
        umaTiaRobo.fazerLogin();
        umaTiaRobo.lancarNota();
    }
}
