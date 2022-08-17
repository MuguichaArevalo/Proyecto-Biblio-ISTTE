/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.istte.biblioteca.modelo.entidad;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author MOISES
 */
@Entity
@Table (name = "Prestamo")
public class Prestamo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPrestamo;
    @Column (name = "Prestasmo_fechaInicio")
    private Date fechaDePrestamo;
    @Column (name = "Prestamo_fechaDevolver")
    private Date fechaDevolver;
    @Column (name = "Prestamo_Estudiante_id")
    private int estudianteId;
    @Column (name = "Prestamo_Libro_id")
    private int libroId;
    //varios prestamos un estudiante
    @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn (name = "fkEstudianteId")
    private Estudiante fkEstudianteId;
    
    //varios prestamos un libro
    @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn (name = "fkLibroId")
    private Libro fkLibroId;

    public Prestamo() {
    }

    public Prestamo(int idPrestamo, Date fechaDePrestamo, Date fechaDevolver, int estudianteId, int libroId, Estudiante fkEstudianteId, Libro fkLibroId) {
        this.idPrestamo = idPrestamo;
        this.fechaDePrestamo = fechaDePrestamo;
        this.fechaDevolver = fechaDevolver;
        this.estudianteId = estudianteId;
        this.libroId = libroId;
        this.fkEstudianteId = fkEstudianteId;
        this.fkLibroId = fkLibroId;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Date getFechaDePrestamo() {
        return fechaDePrestamo;
    }

    public void setFechaDePrestamo(Date fechaDePrestamo) {
        this.fechaDePrestamo = fechaDePrestamo;
    }

    public Date getFechaDevolver() {
        return fechaDevolver;
    }

    public void setFechaDevolver(Date fechaDevolver) {
        this.fechaDevolver = fechaDevolver;
    }

    public int getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(int estudianteId) {
        this.estudianteId = estudianteId;
    }

    public int getLibroId() {
        return libroId;
    }

    public void setLibroId(int libroId) {
        this.libroId = libroId;
    }

    public Estudiante getFkEstudianteId() {
        return fkEstudianteId;
    }

    public void setFkEstudianteId(Estudiante fkEstudianteId) {
        this.fkEstudianteId = fkEstudianteId;
    }

    public Libro getFkLibroId() {
        return fkLibroId;
    }

    public void setFkLibroId(Libro fkLibroId) {
        this.fkLibroId = fkLibroId;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "idPrestamo=" + idPrestamo + ", fechaDePrestamo=" + fechaDePrestamo + ", fechaDevolver=" + fechaDevolver + ", estudianteId=" + estudianteId + ", libroId=" + libroId + ", fkEstudianteId=" + fkEstudianteId + ", fkLibroId=" + fkLibroId + '}';
    }
    
    
    
    
}
