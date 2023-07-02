package Test;

import java.util.ArrayList;

public interface Studije {

    //-void dodajStudenta(Departman d, Student s) - Dodaje odgovarajuceg studenta u listu iz
    //Departmana.

    public void dodajStudenta(Departman d, Student s);

    public void izbaciStudenta(Departman d, Student s); //izbacuje studenta iz liste za odredjen Departman

    public Departman najvecaZarada();

    public ArrayList<Student> sviApsolventi();

}
