package model;

public class patient implements human{
    private String taj;
    private String name;
    private String birthYear;
    private String kezeleskezdete;
    private String betegsegneve;
    private Enum allapot;

    public patient(String taj, String name, String birthYear, String kezeleskezdete, String betegsegneve, Enum allapot) {
        this.taj = taj;
        this.name = name;
        this.birthYear = birthYear;
        this.kezeleskezdete = kezeleskezdete;
        this.betegsegneve = betegsegneve;
        this.allapot = allapot;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getTaj() {
        return taj;
    }

    public void setTaj(String taj) {
        this.taj = taj;
    }

    public String getBetegsegneve() {
        return betegsegneve;
    }

    public void setBetegsegneve(String betegsegneve) {
        this.betegsegneve = betegsegneve;
    }
    public String getKezeleskezdete() {
        return kezeleskezdete;
    }

    public void setKezeleskezdete(String kezeleskezdete) {
        this.kezeleskezdete = kezeleskezdete;
    }

    public void setAllapot(Enum allapot) {
        this.allapot = allapot;
    }

    public Enum getAllapot() {
        return allapot;
    }

}
