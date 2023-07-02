package Test;

import java.util.ArrayList;

public class Student {

    private String ime;

    private ArrayList<Integer> ocena;

    private int trenutnaGodinaStudiranja;

    public Student(String ime, ArrayList<Integer> ocena, int trenutnaGodinaStudiranja) {
        this.ime = ime;
        this.ocena = ocena;
        this.trenutnaGodinaStudiranja = trenutnaGodinaStudiranja;
    }

    public Student() {
        this.ime = "";
        this.ocena = new ArrayList<>();
        this.trenutnaGodinaStudiranja = 2023; //npr da je podrazumevano da je ova godina podrazumevana
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public ArrayList<Integer> getOcena() {
        return ocena;
    }

    public void setOcena(ArrayList<Integer> ocena) {
        this.ocena = ocena;
    }

    public int getTrenutnaGodinaStudiranja() {
        return trenutnaGodinaStudiranja;
    }

    public void setTrenutnaGodinaStudiranja(int trenutnaGodinaStudiranja) {
        this.trenutnaGodinaStudiranja = trenutnaGodinaStudiranja;
    }

    public double prosek(){

        int sum = 0;
        for (int ocena : ocena){
            sum += ocena;
        }
        return (double) sum / ocena.size();
    }

    @Override
    public String toString() {


        return "Student " +
                 ime +
                ", ima ocene: " + ocena +
                " na " + trenutnaGodinaStudiranja + " . godini studiranja.";
    }
}
