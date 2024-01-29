package Models;

import java.io.Serializable;
import java.util.GregorianCalendar;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="alumnos")
public class Alumno implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Basic
    private String name;
    private String lastName;
    
    @OneToOne
    private Carrera carrera;
    
    @Temporal(TemporalType.DATE)
    private GregorianCalendar birthdate;

    public Alumno() {
    }

    public Alumno( String name, String lastName, Carrera carrera, GregorianCalendar birthdate) {
        this.name = name;
        this.lastName = lastName;
        this.carrera = carrera;
        this.birthdate = birthdate;
    }

    public Alumno(int id, String name, String lastName, Carrera carrera, GregorianCalendar birthdate) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.carrera = carrera;
        this.birthdate = birthdate;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public GregorianCalendar getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(GregorianCalendar birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", birthdate=" + birthdate + '}';
    }
       
}
