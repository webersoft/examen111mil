/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Santos
 */
public class Inscripcion {
    private Alumno alumno;
    private Curso curso;
    private float nota;

    public Inscripcion() {
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public float getNota() {
        return nota;
    }
    
    
}
