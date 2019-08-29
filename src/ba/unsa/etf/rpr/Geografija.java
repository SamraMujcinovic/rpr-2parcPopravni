package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Geografija {
    private List<Grad> gradoviGeografija = new ArrayList<>();
    private List<Drzava> drzaveGeografija = new ArrayList<>();

    public Geografija() {
    }

    public Geografija(List<Grad> gradoviGeografija, List<Drzava> drzaveGeografija) {
        this.gradoviGeografija = gradoviGeografija;
        this.drzaveGeografija = drzaveGeografija;
    }

    public List<Grad> getGradoviGeografija() {
        return gradoviGeografija;
    }

    public void setGradoviGeografija(List<Grad> gradoviGeografija) {
        this.gradoviGeografija = gradoviGeografija;
    }

    public List<Drzava> getDrzaveGeografija() {
        return drzaveGeografija;
    }

    public void setDrzaveGeografija(List<Drzava> drzaveGeografija) {
        this.drzaveGeografija = drzaveGeografija;
    }
}
