/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Principal {
    public static void main(String[] args) {
       
        Ciclope ciclope = new Ciclope("Scott Summers", 100, 200);
       
        ciclope.apresentar();
        ciclope.atacar();
        
        
        Magneto magneto = new Magneto("Erik Lehnsherr", 200, 100);
        magneto.apresentar();
        magneto.atacar();
        
        HomemAranha homemaranha = new HomemAranha("Peter Parker", 200, 200);
        homemaranha.apresentar();
        homemaranha.atacar();
       
        
        
        
    }
}
