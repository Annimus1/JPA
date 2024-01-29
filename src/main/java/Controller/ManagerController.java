package Controller;

import Controller.exceptions.NonexistentEntityException;
import Models.Alumno;
import Models.Carrera;
import Models.Materia;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManagerController {
    AlumnoJpaController alumnoJpaController = new AlumnoJpaController();
    CarreraJpaController carreraJpaController = new CarreraJpaController();
    MateriaJpaController materiaJpaController = new MateriaJpaController();
    
    /*
    * -------------  ALUMNO ------------------------
    */
    public void createAlumno(Alumno alu){
        alumnoJpaController.create(alu);
    }

    public void eliminarAlumno(int id) {
        try{
            alumnoJpaController.destroy(id);
        }catch(NonexistentEntityException ex){
            System.out.println(ex);
        }
    }
    
    public void editarAlumno(Alumno alu){
        try {
            alumnoJpaController.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ManagerController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Alumno obtenerAlumno(int id){
        return alumnoJpaController.findAlumno(id);
    }

    public ArrayList<Alumno> obtenerAlumnos() {
       List response = alumnoJpaController.findAlumnoEntities();
       ArrayList<Alumno> alumnos = new ArrayList<Alumno>(response);
       return alumnos;
    }
    
    /*
    * -------------- CARRERA ------------------------
    */

    public void createCarrera(Carrera carrera) {
        carreraJpaController.create(carrera);
    }

    public void eliminarCarrera(int id) {
        try{
            carreraJpaController.destroy(id);
        }catch(NonexistentEntityException ex){
            ex.printStackTrace();
        }
    }

    public void editarCarrera(Carrera carrera) {
        try {
            carreraJpaController.edit(carrera);
        } catch (Exception ex) {
            Logger.getLogger(ManagerController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera obtenerCarrera(int id) {
        return carreraJpaController.findCarrera(id);
    }

    public ArrayList<Carrera> obtenerCarreras() {
        List response = carreraJpaController.findCarreraEntities();
       ArrayList<Carrera> alumnos = new ArrayList<Carrera>(response);
       return alumnos;
    }
    
    /*
    * --------------- MATERIA -----------------------
    */

    public void createMateria(Materia materia) {
        materiaJpaController.create(materia);
    }

    public void eliminarMateria(int id) {
        try{
            materiaJpaController.destroy(id);
        }catch(NonexistentEntityException ex){
            ex.printStackTrace();
        }
    }

    public void editarMateria(Materia carrera) {
        try {
            materiaJpaController.edit(carrera);
        } catch (Exception ex) {
            Logger.getLogger(ManagerController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Materia obtenerMateria(int id) {
        return materiaJpaController.findMateria(id);
    }

    public ArrayList<Materia> obtenerMaterias() {
        List response = materiaJpaController.findMateriaEntities();
       ArrayList<Materia> alumnos = new ArrayList<>(response);
       return alumnos;
    }
    
}
