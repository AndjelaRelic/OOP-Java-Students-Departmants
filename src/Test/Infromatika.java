package Test;

import java.util.ArrayList;

public class Infromatika extends Departman{

    public Infromatika(ArrayList<Student> studenti, String naziv) {
        super(studenti, naziv);
    }

    public Infromatika() {
    }

    public Infromatika(String naziv) {
        super(naziv);
    }

    @Override
    public double finansije() {
        return getStudenti().size()/2.0 *5000;
    }
}
