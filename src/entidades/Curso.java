/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santos
 */
public class Curso {
    private String nombreCurso;
    private int cupo;
    private float nota;
    private List<Inscripcion> incripciones;

    public Curso() {
        this.incripciones=new ArrayList<>();
    }

    public Curso(String nombreCurso, int cupo, float nota) {
        this.nombreCurso = nombreCurso;
        this.cupo = cupo;
        this.nota = nota;
        this.incripciones=new ArrayList<>();
    }

    public Curso(int cupo, float nota) {
        this.cupo = cupo;
        this.nota = nota;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }
    
    
}
