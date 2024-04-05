public class Covid19Data {
    private String region;
    private String aldersGruppe;
    private int dode;
    public Covid19Data(String region, String aldersGruppe, int dode, int intensiv, int indlagte, String dato) {
        this.region = region;
        this.aldersGruppe = aldersGruppe;
        this.dode = dode;
        this.intensiv = intensiv;
        this.indlagte = indlagte;
        this.dato = dato;
    }
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAldersGruppe() {
        return aldersGruppe;
    }

    public void setAldersGruppe(String aldersGruppe) {
        this.aldersGruppe = aldersGruppe;
    }

    public int getDode() {
        return dode;
    }

    public void setDode(int dode) {
        this.dode = dode;
    }

    public int getIntensiv() {
        return intensiv;
    }

    public void setIntensiv(int intensiv) {
        this.intensiv = intensiv;
    }

    public int getIndlagte() {
        return indlagte;
    }

    public void setIndlagte(int indlagte) {
        this.indlagte = indlagte;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    private int intensiv;
    private int indlagte;
    private String dato;

    @Override
    public String toString() {
        return "Region: " + getRegion()
                + ", AldersGruppe: " + getAldersGruppe()
                + ", Dode: " + getDode()
                + ", Intensiv: " + getIntensiv()
                + ", Indlagte: " + getIndlagte()
                + ", Dato: " + getDato();
    }
}
