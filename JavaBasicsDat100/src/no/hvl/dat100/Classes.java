package no.hvl.dat100;

public class Classes {




    public static class Student {
        private int studentnr;
        private String fornavn;
        private String etternavn;

        public Student() {
            // Alle objektvariabler får standardverdi
        }

        public Student(int studentnr, String fornavn, String etternavn) {
            this.studentnr = studentnr;
            this.fornavn = fornavn;
            this.etternavn = etternavn;
        }

        public Student(String fornavn, String etternavn) {
            this(0, fornavn, etternavn);
        }

        public int getStudentnr() {
            return studentnr;
        }

        public String getFornavn() {
            return fornavn;
        }

        public String getEtternavn() {
            return etternavn;
        }

        public void setStudentnr(int studentnr) {
            this.studentnr = studentnr;
        }

        public void setFornavn(String fornavn) {
            this.fornavn = fornavn;
        }

        public void setEtternavn(String etternavn) {
            this.etternavn = etternavn;
        }

        public void skrivUt() {
            System.out.println(studentnr + " " + fornavn + " " + etternavn);
        }

        public String toString() {
            return studentnr + " " + fornavn + " " + etternavn;
        }

        
    }



    public static void main(String[] args) {
        // Opprette tabell med plass til 3 studenter
        Student[] sTab = new Student[3];

        // Legge inn studenter
        sTab[0] = new Student(7, "Ole", "Olsen");
        sTab[1] = new Student(11, "Kari", "Nilsen");
        sTab[2] = new Student (15, "Nils", "Nilsen");

        // Skrive ut alle objekta
        for (Student s : sTab) {
            s.skrivUt();
        }

        // Søke etter et gitt studentnr
        // Ved funn skriv ut studenten, elles skriv melding
        // Lager metode

        Student s1 = sok(sTab, 7);
        if (s1 != null) {
            System.out.println("Fann studenten");
            // s1.skrivUt();
            System.out.println(s1.toString());
        } else {
            System.out.println("Fann ikkje studenten");
        }

    }

    public static Student sok(Student[] sTab, int snr) {
        Student svar = null;
        for (int i = 0; i < sTab.length; i++) {
            if (sTab[i].getStudentnr() == snr) {
                svar = sTab[i];
            }
        }
        return svar;
    }}


