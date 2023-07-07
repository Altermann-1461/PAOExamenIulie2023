public class Salariat_spital {

    private String nume;
    private int salariu;
    private int vechime;


    public Salariat_spital(String nume, int salariu, int vechime) {
        this.nume = nume;
        this.salariu = salariu;
        this.vechime = vechime;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public int getVechime() {
        return vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }
}
