package Hibernate;
// Generated 27 mars 2013 14:02:55 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Offre generated by hbm2java
 */
@Entity
@Table(name="OFFRE"
    ,schema="USR_VIVIEN"
)
public class Offre  implements java.io.Serializable {


     private OffreId id;
     private Typechambre typechambre;
     private Etablissement etablissement;
     private BigDecimal nombrechambres;
     private Set attributions = new HashSet(0);

    public Offre() {
    }

	
    public Offre(OffreId id, Typechambre typechambre, Etablissement etablissement, BigDecimal nombrechambres) {
        this.id = id;
        this.typechambre = typechambre;
        this.etablissement = etablissement;
        this.nombrechambres = nombrechambres;
    }
    public Offre(OffreId id, Typechambre typechambre, Etablissement etablissement, BigDecimal nombrechambres, Set attributions) {
       this.id = id;
       this.typechambre = typechambre;
       this.etablissement = etablissement;
       this.nombrechambres = nombrechambres;
       this.attributions = attributions;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="idetab", column=@Column(name="IDETAB", nullable=false, length=8) ), 
        @AttributeOverride(name="idtypechambre", column=@Column(name="IDTYPECHAMBRE", nullable=false, length=2) ) } )
    public OffreId getId() {
        return this.id;
    }
    
    public void setId(OffreId id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDTYPECHAMBRE", nullable=false, insertable=false, updatable=false)
    public Typechambre getTypechambre() {
        return this.typechambre;
    }
    
    public void setTypechambre(Typechambre typechambre) {
        this.typechambre = typechambre;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDETAB", nullable=false, insertable=false, updatable=false)
    public Etablissement getEtablissement() {
        return this.etablissement;
    }
    
    public void setEtablissement(Etablissement etablissement) {
        this.etablissement = etablissement;
    }
    
    @Column(name="NOMBRECHAMBRES", nullable=false, precision=22, scale=0)
    public BigDecimal getNombrechambres() {
        return this.nombrechambres;
    }
    
    public void setNombrechambres(BigDecimal nombrechambres) {
        this.nombrechambres = nombrechambres;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="offre")
    public Set getAttributions() {
        return this.attributions;
    }
    
    public void setAttributions(Set attributions) {
        this.attributions = attributions;
    }




}


