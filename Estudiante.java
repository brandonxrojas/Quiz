/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz;

/**
 *
 * @author Aprendiz
 */
public class Estudiante extends Persona{
    
    public Estudiante(int identificador, String nombre, char genero, String materia, int nota) {
        super(identificador, nombre, genero, materia, nota);
    }
    
   int cont = 0;
   public int contarRegulares(){
    
       if( nota >= 2.5 && nota <= 3.5){
           cont += 1;
         
       }
         return cont;
     
   }
   
}

