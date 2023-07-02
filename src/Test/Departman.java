package Test;

import java.util.ArrayList;

public abstract class Departman {

    private ArrayList <Student> studenti;
    private String naziv;


    public Departman(ArrayList<Student> studenti, String naziv) {
        this.studenti = studenti;
        this.naziv = naziv;
    }

    public Departman() {
        this.studenti = new ArrayList<>();
        this.naziv = "";
    }

    public Departman(String naziv) {
        this.naziv = naziv;
        this.studenti = new ArrayList<>();
    }


    public ArrayList<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(ArrayList<Student> studenti) {
        this.studenti = studenti;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    //List<Student> vredni(int prosek) - Metoda koja vraca listu Studenata koji imaju veci prosek
    //od prosledjenog.

    public ArrayList<Student> vredni (double prosek){
        ArrayList<Student> vredni = new ArrayList<>();
        for (Student s : studenti){
            if (s.prosek()> prosek){
                vredni.add(s);
            }
        }
        return vredni;
    }

    //double prosekSvih() - Metoda koja vraca prosek svih Studenata sa Departmana.

    public double prosekSvih(){
        double sum = 0;
        for (Student s : studenti){
            sum +=s.prosek();
        }
        return sum/studenti.size();
    }

    //double finansije() - Ova metoda je abstraktna. Vraca ukupan broj zarade od fakulteta, ako
    //racunamo da na svakom Departmanu 50% mesta su budzetska(besplatna), osim na
    //Departmanu za Biologije gde nema ni jedno budzetsko mesto.

    public abstract double finansije();

}
