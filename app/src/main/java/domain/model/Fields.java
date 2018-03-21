
package domain.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;


public class Fields {

    @SerializedName("objectid")
    @Expose
    private int objectid;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("arrondissement")
    @Expose
    private String arrondissement;
    @SerializedName("nom_voie")
    @Expose
    private String nomVoie;
    @SerializedName("gestionnaire")
    @Expose
    private String gestionnaire;
    @SerializedName("geom_x_y")
    @Expose
    private List<Double> geomXY = null;
    @SerializedName("y")
    @Expose
    private double y;
    @SerializedName("x")
    @Expose
    private double x;
    @SerializedName("numero_voie")
    @Expose
    private String numeroVoie;
    @SerializedName("identifiant")
    @Expose
    private String identifiant;
    @SerializedName("horaires_ouverture")
    @Expose
    private String horairesOuverture;

    public int getObjectid() {
        return objectid;
    }

    public void setObjectid(int objectid) {
        this.objectid = objectid;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getArrondissement() {
        return arrondissement;
    }

    public void setArrondissement(String arrondissement) {
        this.arrondissement = arrondissement;
    }

    public String getNomVoie() {
        return nomVoie;
    }

    public void setNomVoie(String nomVoie) {
        this.nomVoie = nomVoie;
    }

    public String getGestionnaire() {
        return gestionnaire;
    }

    public void setGestionnaire(String gestionnaire) {
        this.gestionnaire = gestionnaire;
    }

    public List<Double> getGeomXY() {
        return geomXY;
    }

    public void setGeomXY(List<Double> geomXY) {
        this.geomXY = geomXY;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public String getNumeroVoie() {
        return numeroVoie;
    }

    public void setNumeroVoie(String numeroVoie) {
        this.numeroVoie = numeroVoie;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getHorairesOuverture() {
        return horairesOuverture;
    }

    public void setHorairesOuverture(String horairesOuverture) {
        this.horairesOuverture = horairesOuverture;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("objectid", objectid).append("source", source).append("arrondissement", arrondissement).append("nomVoie", nomVoie).append("gestionnaire", gestionnaire).append("geomXY", geomXY).append("y", y).append("x", x).append("numeroVoie", numeroVoie).append("identifiant", identifiant).append("horairesOuverture", horairesOuverture).toString();
    }

}
