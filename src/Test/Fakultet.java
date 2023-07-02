package Test;

import java.util.ArrayList;

public class Fakultet implements Studije{

    private ArrayList<Departman> departmani;

    public Fakultet(ArrayList<Departman> departmani) {
        this.departmani = departmani;
    }

    public Fakultet() {
        this.departmani = new ArrayList<>();
    }

    public ArrayList<Departman> getDepartmani() {
        return departmani;
    }

    public void setDepartmani(ArrayList<Departman> departmani) {
        this.departmani = departmani;
    }

    @Override
    public void dodajStudenta(Departman d, Student s) {
        d.getStudenti().add(s);
    }

    @Override
    public void izbaciStudenta(Departman d, Student s) {
        d.getStudenti().remove(s);
    }

    @Override
    public Departman najvecaZarada() {
        Departman departmanSaNajvecomZaradom = null;
        double maxZarada = 0;

        for (Departman d : departmani){
            double zarada = d.finansije();
            if(zarada>maxZarada){
                maxZarada = zarada;
                departmanSaNajvecomZaradom = d;
            }
        }
        return departmanSaNajvecomZaradom;
    }

    @Override
    public ArrayList<Student> sviApsolventi() {
        ArrayList<Student> apsolventi = new ArrayList<>();
        for (Departman departman : departmani) {
            for (Student student : departman.getStudenti()) {
                if (student.getTrenutnaGodinaStudiranja() == 4) {
                    apsolventi.add(student);
                }
            }
        }
        return apsolventi;
        }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<departmani.size();i++){
            sb.append(departmani.get(i));
        }
        return sb.toString();
    }
}
