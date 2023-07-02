package Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {


        ArrayList<Integer> ocene1 = new ArrayList<>();
        ocene1.add(8);
        ocene1.add(8);
        ocene1.add(8);

        ArrayList<Integer> ocene2 = new ArrayList<>();
        ocene2.add(9);
        ocene2.add(9);
        ocene2.add(9);

        ArrayList<Integer> ocene3 = new ArrayList<>();
        ocene3.add(8);
        ocene3.add(10);
        ocene3.add(8);

        ArrayList<Integer> ocene4 = new ArrayList<>();
        ocene4.add(6);
        ocene4.add(10);
        ocene4.add(8);


        Student andjela = new Student("Andjela", ocene1, 4);
        Student marko = new Student("Marko", ocene2, 3);
        Student nikola = new Student("Nikola", ocene3, 4);
        Student strahinja = new Student("Strahinja", ocene4, 4);

        System.out.println(andjela);
        andjela.getTrenutnaGodinaStudiranja();




        Departman biologija = new Biologija("Biologija");
        Departman informatika = new Infromatika("Informatika");
        Departman hemija = new Hemija("Hemija");

        biologija.getStudenti().add(andjela);
        biologija.getStudenti().add(marko);

        System.out.println(biologija.getStudenti());

        System.out.println(andjela.prosek());
        System.out.println(marko.prosek());
        System.out.println(biologija.prosekSvih());

        System.out.println(biologija.finansije());

        hemija.getStudenti().add(strahinja);
        hemija.getStudenti().add(nikola);

        System.out.println(hemija.finansije());

        ArrayList<Departman> departmani = new ArrayList<>();

        departmani.add(biologija);
        departmani.add(hemija);
        Fakultet fakultet = new Fakultet(departmani);
        System.out.println(fakultet.sviApsolventi());

        ArrayList<Student> apsolventi = fakultet.sviApsolventi();

        Departman depNajvecaZarada = fakultet.najvecaZarada();
        System.out.println(depNajvecaZarada.getNaziv());

        System.out.println(hemija.getStudenti());
        fakultet.izbaciStudenta(hemija, strahinja);
        System.out.println(hemija.getStudenti());
        fakultet.dodajStudenta(hemija, andjela);
        System.out.println(hemija.getStudenti() );
    }
}
