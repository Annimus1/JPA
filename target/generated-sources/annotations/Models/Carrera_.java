package Models;

import Models.Materia;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-01-29T19:37:29", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Carrera.class)
public class Carrera_ { 

    public static volatile SingularAttribute<Carrera, String> name;
    public static volatile SingularAttribute<Carrera, Integer> semester;
    public static volatile SingularAttribute<Carrera, Integer> id;
    public static volatile ListAttribute<Carrera, Materia> materias;

}