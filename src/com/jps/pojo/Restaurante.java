package com.jps.pojo;

public class Restaurante {
    //TODO atributos
    private String nombre,direccion;
    private int np,ne;
    private String p[][]= new String [2][100];
    private String e[][]= new String [2][100];
    //TODO constructores
    public Restaurante(){

    }
    //TODO getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNp() {
        return np;
    }

    public void setNp(int np) {
        this.np = np;
    }

    public int getNe() {
        return ne;
    }

    public void setNe(int ne) {
        this.ne = ne;
    }

    public String[][] getP() {
        return p;
    }

    public void setP(String[][] p) {
        this.p = p;
    }

    public String[][] getE() {
        return e;
    }

    public void setE(String[][] e) {
        this.e = e;
    }
}
