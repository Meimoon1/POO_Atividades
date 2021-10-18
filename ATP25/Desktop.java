public class Desktop extends Computador{
    public String tamanhoGabinete;
    public String monitorExterno;
    public String fonte;

    @Override
    public String toString() {
        return "Tamanho Gabinete: "+tamanhoGabinete+"\nMonitor Externo: "+monitorExterno+ "\nFonte: "+fonte+"\n";
    }
}
