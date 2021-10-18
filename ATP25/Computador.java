public class Computador{
    public String marca;
    public String memoriaRam;
    public String processador;
    public String discoRigido;

    @Override
    public String toString() {
        return "Marca: "+marca+"\nMemória Ram:"+memoriaRam+ "\nProcessador: "+processador+"\nDisco Rígido: "+discoRigido+"\n";
    }
}