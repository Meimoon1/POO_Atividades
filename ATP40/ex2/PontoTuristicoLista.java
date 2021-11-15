package ex2;

import java.util.ArrayList;

public class PontoTuristicoLista implements IPontosTuristicos{
    private ArrayList<PontosTuristicos> lista = new ArrayList<PontosTuristicos>();

    @Override
    public String salvar(PontosTuristicos model) {
        this.lista.add(model);
        return "Salvo com sucesso!";
    }

    @Override
    public ArrayList<PontosTuristicos> read() {
       return this.lista;
    }
    
}
