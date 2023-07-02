package Test;

import java.util.ArrayList;

public class Biologija extends Departman{

    public Biologija(ArrayList<Student> studenti, String naziv) {
        super(studenti, naziv);
    }

    public Biologija() {
    }

    public Biologija(String naziv) {
        super(naziv);
    }

    @Override
    public double finansije() {
        return getStudenti().size()*3000;
    }
}
