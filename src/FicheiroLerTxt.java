import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class FicheiroLerTxt {
    private ArrayList<Computador> listaEncher = new ArrayList<>();

    public FicheiroLerTxt() {
    }

    public ArrayList<Computador> getListaEncher() {
        return listaEncher;
    }

    public void lerTxt(String nomeTxt){
        File f = new File( nomeTxt);
        Boolean EOF = false;
        try {

            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            while (!EOF){
                try {
                    String line = br.readLine();
                    if(line != null){
                        String str[] = line.split(";");
                        Computador cpd = new Computador(
                                str[0],
                                Integer.parseInt(str[1].trim()),
                                str[2],
                                Integer.parseInt(str[3].trim()));
                        listaEncher.add(cpd);
                    }else{
                        EOF = true;
                    }
                } catch (NullPointerException e) {
                    System.out.println("Error Message: " + e.getMessage());
                    e.printStackTrace();
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
