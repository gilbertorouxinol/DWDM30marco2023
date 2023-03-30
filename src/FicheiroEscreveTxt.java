import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FicheiroEscreveTxt {
    private ArrayList<Computador> listaComputador;

    public FicheiroEscreveTxt(ArrayList<Computador> listaComputador) {

        this.listaComputador = listaComputador;
    }

    public void escreveTxt(String nomeTxt){

        File f = new File(nomeTxt);

        try {

            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Computador e: listaComputador) {
                String str = e.toString();
                bw.write(str, 0, str.length());
                bw.newLine();
            }

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
