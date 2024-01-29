package dev.pablo.jpatest;

import Models.Alumno;
import Models.Carrera;
import Models.Controller;
import Models.Materia;
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class JpaTest {

    public static void main(String[] args) {
        Controller control = new Controller();
            
//        Crear lista de materias vacia
        LinkedList<Materia> materias = new LinkedList<>();
//        crear la carrera
        Carrera carrera = new Carrera("Ing Informatica", 10, null);
        control.createCarrera(carrera);
          
//        crear las materias
        Materia m1 = new Materia("Calculo I", "Semestral", carrera);
        Materia m2 = new Materia("Logica", "Semestral", carrera);
        Materia m3 = new Materia("Algebra Lineal", "Semestral", carrera);
        Materia m4 = new Materia("Programacion I", "Semestral", carrera);
        
        control.createMateria(m1);
        control.createMateria(m2);
        control.createMateria(m3);
        control.createMateria(m4);
        
//        agregar las materias a la lista
        materias.add(m1);
        materias.add(m2);
        materias.add(m3);
        materias.add(m4);
        
//        editar la carrera
        carrera.setMaterias(materias);
        control.editarCarrera(carrera);
        
//        crear los usuarios
        Alumno a1 = new Alumno("Jhon","Doe", carrera, new GregorianCalendar(1996,2,10));
        Alumno a2 = new Alumno("Jane","Doe", carrera, new GregorianCalendar(2002,8,20));
        Alumno a3 = new Alumno("Matt","White", carrera, new GregorianCalendar(1999,1,1));
        Alumno a4 = new Alumno("Yenny","Marquez", carrera, new GregorianCalendar(2000,7,7));
    
        control.createAlumno(a1);
        control.createAlumno(a2);
        control.createAlumno(a3);
        control.createAlumno(a4);
    }
}






















