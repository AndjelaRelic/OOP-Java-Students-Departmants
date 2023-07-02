package Test;

import java.util.ArrayList;

public class Hemija extends Departman{

    public Hemija(ArrayList<Student> studenti, String naziv) {
        super(studenti, naziv);
    }

    public Hemija() {
    }

    public Hemija(String naziv) {
        super(naziv);
    }

    @Override
    public double finansije() {
        return getStudenti().size()/2.0*4000;
    }
}
