/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Ciclope extends Heroi{

    public Ciclope(String nome, int vida, int energia) {
        super(nome, vida, energia);
      
    }
    
    
    
  @Override 
     public void atacar(){
        System.out.println("Estou atacando com meus raios das profundezas do escuro profundo");
    }
    
    
}
