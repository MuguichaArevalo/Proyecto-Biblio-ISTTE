/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.istte.biblioteca.modelo.entidad;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author MOISES
 */
@Entity
@Table(name = "Libro")
public class Libro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idLibro;
    @Column(name = "libro_isbn")
    private String isbnLibro;
    @Column(name = "libro_categoria")
    private String categoriaLibro;
    @Column(name = "libro_titulo")
    private String tituloLibtro;
    @Column(name = "libro_autor")
    private String autorLibro;
    @Column(name = "libro_editorial")
    private String editorialLibro;
    @Column(name = "libro_categoria")
    private String temaLibro;
    @Column(name = "libro_cantidad")
    private String cantidadLibro;
    @Column(name = "libro_percha")
    private String perchaLibro;
    @Column(name = "libro_estado")
    private String estadoLibro;
    @Column(name = "libro_responsable")
    private String resposableLibro;
    //un libro puede ser prestado varios veces
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkLibroId")
    private List<Prestamo> fkPrestamoLibroId;

    public Libro() {
    }

    public Libro(int idLibro, String isbnLibro, String categoriaLibro, String tituloLibtro, String autorLibro, String editorialLibro, String temaLibro, String cantidadLibro, String perchaLibro, String estadoLibro, String resposableLibro, List<Prestamo> fkPrestamoLibroId) {
        this.idLibro = idLibro;
        this.isbnLibro = isbnLibro;
        this.categoriaLibro = categoriaLibro;
        this.tituloLibtro = tituloLibtro;
        this.autorLibro = autorLibro;
        this.editorialLibro = editorialLibro;
        this.temaLibro = temaLibro;
        this.cantidadLibro = cantidadLibro;
        this.perchaLibro = perchaLibro;
        this.estadoLibro = estadoLibro;
        this.resposableLibro = resposableLibro;
        this.fkPrestamoLibroId = fkPrestamoLibroId;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getIsbnLibro() {
        return isbnLibro;
    }

    public void setIsbnLibro(String isbnLibro) {
        this.isbnLibro = isbnLibro;
    }

    public String getCategoriaLibro() {
        return categoriaLibro;
    }

    public void setCategoriaLibro(String categoriaLibro) {
        this.categoriaLibro = categoriaLibro;
    }

    public String getTituloLibtro() {
        return tituloLibtro;
    }

    public void setTituloLibtro(String tituloLibtro) {
        this.tituloLibtro = tituloLibtro;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    public String getEditorialLibro() {
        return editorialLibro;
    }

    public void setEditorialLibro(String editorialLibro) {
        this.editorialLibro = editorialLibro;
    }

    public String getTemaLibro() {
        return temaLibro;
    }

    public void setTemaLibro(String temaLibro) {
        this.temaLibro = temaLibro;
    }

    public String getCantidadLibro() {
        return cantidadLibro;
    }

    public void setCantidadLibro(String cantidadLibro) {
        this.cantidadLibro = cantidadLibro;
    }

    public String getPerchaLibro() {
        return perchaLibro;
    }

    public void setPerchaLibro(String perchaLibro) {
        this.perchaLibro = perchaLibro;
    }

    public String getEstadoLibro() {
        return estadoLibro;
    }

    public void setEstadoLibro(String estadoLibro) {
        this.estadoLibro = estadoLibro;
    }

    public String getResposableLibro() {
        return resposableLibro;
    }

    public void setResposableLibro(String resposableLibro) {
        this.resposableLibro = resposableLibro;
    }

    public List<Prestamo> getFkPrestamoLibroId() {
        return fkPrestamoLibroId;
    }

    public void setFkPrestamoLibroId(List<Prestamo> fkPrestamoLibroId) {
        this.fkPrestamoLibroId = fkPrestamoLibroId;
    }

    @Override
    public String toString() {
        return "Libro{" + "idLibro=" + idLibro + ", isbnLibro=" + isbnLibro + ", categoriaLibro=" + categoriaLibro + ", tituloLibtro=" + tituloLibtro + ", autorLibro=" + autorLibro + ", editorialLibro=" + editorialLibro + ", temaLibro=" + temaLibro + ", cantidadLibro=" + cantidadLibro + ", perchaLibro=" + perchaLibro + ", estadoLibro=" + estadoLibro + ", resposableLibro=" + resposableLibro + ", fkPrestamoLibroId=" + fkPrestamoLibroId + '}';
    }
    
    

}
