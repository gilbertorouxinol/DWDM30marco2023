public class Computador {
    private String cpu;
    private int ram;
    private String marca;
    private int id;

    public Computador(String cpu, int ram, String marca, int id) {
        this.cpu = cpu;
        this.ram = ram;
        this.marca = marca;
        this.id = id;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", marca='" + marca + '\'' +
                ", id=" + id +
                '}';
    }

}
