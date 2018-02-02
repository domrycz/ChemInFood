package domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "additives")
@NamedQuery(name = "Additive.findAll", query = "SELECT a FROM Additive a")
public class Additive implements Serializable {

    @Id
    @Column(name = "E_number", nullable = false, length = 4)
    private String numberE;
    @Column(name = "name_english", nullable = false, unique = true)
    private String nameEng;
    @Column(name = "name_polish", nullable = false, unique = true)
    private String namePol;
    @Column(name = "CAS_number", nullable = false)
    private String numberCAS;
    // TODO: use enum to describe harmfulness?
    private String harmfulness;

    public String getNumberE() {
        return numberE;
    }

    public void setNumberE(String numberE) {
        this.numberE = numberE;
    }

    public String getNameEng() {
        return nameEng;
    }

    public void setNameEng(String nameEng) {
        this.nameEng = nameEng;
    }

    public String getNamePol() {
        return namePol;
    }

    public void setNamePol(String namePol) {
        this.namePol = namePol;
    }

    public String getNumberCAS() {
        return numberCAS;
    }

    public void setNumberCAS(String numberCAS) {
        this.numberCAS = numberCAS;
    }

    public String getHarmfulness() {
        return harmfulness;
    }

    public void setHarmfulness(String harmfulness) {
        this.harmfulness = harmfulness;
    }
}
