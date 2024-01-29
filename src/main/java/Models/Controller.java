package Models;

import Controller.ManagerController;
import Models.Alumno;
import java.util.ArrayList;

public class Controller {
    ManagerController managerController = new ManagerController();
    
    /*
    * ------------------ Alumnos ----------------------
    */
//      Crear Alumno
    public void createAlumno(Alumno alu){
        managerController.createAlumno(alu);
    }
    
//      Eliminar Alumno
    public void eliminarAlumno(int id){
        managerController.eliminarAlumno(id);
    }
    
//      Ediatr Alumno
    public void editarAlumno(Alumno alu){
        managerController.editarAlumno(alu);
    }
    
//      Obtener alumno mediante id
    public Alumno obtenerAlumno(int id){
        return managerController.obtenerAlumno(id);
    }
    
//      Obtener todos los alumnos de la base de datos
    public ArrayList<Alumno> obtenerAlumnos(){
        return managerController.obtenerAlumnos();
    }
    
    
    /*
    *  ------------------- Carrera -------------------
    */
    //      Crear Carrera
    public void createCarrera(Carrera carrera){
        managerController.createCarrera(carrera);
    }
    
//      Eliminar Carrera
    public void eliminarCarrera(int id){
        managerController.eliminarCarrera(id);
    }
    
//      Ediatr Carrera
    public void editarCarrera(Carrera carrera){
        managerController.editarCarrera(carrera);
    }
    
//      Obtener Carrera mediante id
    public Carrera obtenerCarrera(int id){
        return managerController.obtenerCarrera(id);
    }
    
//      Obtener todos las Carreras de la base de datos
    public ArrayList<Carrera> obtenerCarreras(){
        return managerController.obtenerCarreras();
    }
    
    
    /*
    *  ------------------- Materia -------------------
    */
    //      Crear Materia
    public void createMateria(Materia materia){
        managerController.createMateria(materia);
    }
    
//      Eliminar Materia
    public void eliminarMateria(int id){
        managerController.eliminarMateria(id);
    }
    
//      Ediatr Materia
    public void editarMateria(Materia materia){
        managerController.editarMateria(materia);
    }
    
//      Obtener Materia mediante id
    public Materia obtenerMateria(int id){
        return managerController.obtenerMateria(id);
    }
    
//      Obtener todos las Materias de la base de datos
    public ArrayList<Materia> obtenerMaterias(){
        return managerController.obtenerMaterias();
    }
}
