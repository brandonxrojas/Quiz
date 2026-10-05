/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz;

/**
 *
 * @author Aprendiz
 */
public class Persona {
    protected int identificador;
    protected String nombre;
    protected char genero;
    protected String materia;
    protected int nota;
    

    public Persona(int identificador, String nombre, char genero,  String materia, int nota) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.genero = genero;
        this.materia = materia;
        this.nota = nota;
    }
    
   
    
}
