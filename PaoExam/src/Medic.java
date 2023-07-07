public class Medic extends Salariat_spital{

    private String specializare="generalist";

    public Medic(String nume, int salariu, int vechime, String specializare) {
        super(nume, salariu, vechime);
        if(salariu<=5000){
            setSalariu(5000);
        }
        this.specializare = specializare;
    }

    @Override
    public void setSalariu(int salariu) {
        if(salariu<=5000){
            super.setSalariu(5000);
        }
        else{
            super.setSalariu(salariu);
        }

    }

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }
}
