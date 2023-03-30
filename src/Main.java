import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Computador> lisComp =  new ArrayList<Computador>();

        Computador c1 = new Computador("AMD1",1281, "Asus1", 11);
        Computador c2 = new Computador("AMD2",1282, "Asus2", 12);
        Computador c3 = new Computador("AMD3",1283, "Asus3", 13);
        Computador c4 = new Computador("AMD4",1284, "Asus4", 14);

        lisComp.add(c1);
        lisComp.add(c2);
        lisComp.add(c3);
        lisComp.add(c4);

        for (Computador comp : lisComp) {
            System.out.println(comp.getId());
        }

        FicheiroEscreveTxt fetxt = new FicheiroEscreveTxt(lisComp);
        fetxt.escreveTxt("computadorWrite.txt");

        FicheiroLerTxt fltxt = new FicheiroLerTxt();
        fltxt.lerTxt("computadorRead.txt");
        ArrayList<Computador> listaLidaTxt = new ArrayList<>();
        listaLidaTxt = fltxt.getListaEncher();
        for (Computador comp : listaLidaTxt) {
            System.out.println(comp.getId());
        }
    }
}
