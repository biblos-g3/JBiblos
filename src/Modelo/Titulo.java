package Modelo;

import java.util.*;

public class Titulo {

    Collection<Autor> escritoPor;
    private CodDewey id;
    private Date fPublicacion;
    private short numEdicion;
    private String editorial;
    private Idioma639_1 idioma;

    /**
     * 
     * @param codDewey
     */
    public Titulo(CodDewey codDewey) {
        throw new UnsupportedOperationException();
    }

    public Idioma639_1 getIdioma() {
        return this.idioma;
    }

    public Date getFPublicacion() {
        return this.fPublicacion;
    }

    public void setFPublicacion(Date fPublicacion) {
        this.fPublicacion = fPublicacion;
    }
}