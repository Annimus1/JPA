package Models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="materias")
public class Materia implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    
    @Basic
    private String name;
    private String type;

    @ManyToOne
    private Carrera carrera;
    
    public Materia() {
    }

    public Materia(String name, String type, Carrera carrera) {
        this.name = name;
        this.type = type;
        this.carrera = carrera;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrype() {
        return type;
    }

    public void setTrype(String type) {
        this.type = type;
    }
    
}
