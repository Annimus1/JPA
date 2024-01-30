package Models;

import Models.Carrera;
import java.util.GregorianCalendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-01-29T19:37:29", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Alumno.class)
public class Alumno_ { 

    public static volatile SingularAttribute<Alumno, String> lastName;
    public static volatile SingularAttribute<Alumno, GregorianCalendar> birthdate;
    public static volatile SingularAttribute<Alumno, String> name;
    public static volatile SingularAttribute<Alumno, Integer> id;
    public static volatile SingularAttribute<Alumno, Carrera> carrera;

}