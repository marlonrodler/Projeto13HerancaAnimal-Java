/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author marlo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gato objGato01 = new Gato();
        Leao objLeao01 = new Leao();
        Tigre objTigre01 = new Tigre();
        Lobo objLobo01 = new Lobo();
        Cao objCao01 = new Cao();
        
        objGato01.setComida("Ração");
        objGato01.setHabitat("Casa");
        objGato01.setRaca("Persa");
        
        objLeao01.setComida("Carne");
        objLeao01.setHabitat("Savanas Africanas");
        objLeao01.setOrigem("África subsaariana e na Ásia");
        
        objTigre01.setComida("Carne");
        objTigre01.setHabitat("Florestas e Savanas");
        objTigre01.setCor("Alaranjado com listras pretas");
        
        objLobo01.setComida("Carne");
        objLobo01.setHabitat("Florestas temperadas");
        objLobo01.setPeso(36);
        
        objCao01.setComida("Ração");
        objCao01.setHabitat("Casa");
        objCao01.setTamanho(63);
        
        
        System.out.println("*** ANIMAIS ***");
        System.out.println("\nInfº Gato: ");
        objGato01.makeNoise();
        System.out.println(  "           Comida:  "+objGato01.getComida()+
                           "\n           Habitat: "+objGato01.getHabitat()+
                           "\n           Raça:    "+objGato01.getRaca());
        
        
        System.out.println("\n\nInfº Leao: ");
        objLeao01.makeNoise();
        System.out.println(  "           Comida:  "+objLeao01.getComida()+
                           "\n           Habitat: "+objLeao01.getHabitat()+
                           "\n           Origem:  "+objLeao01.getOrigem());
          
        
        System.out.println("\n\nInfº Tigre: ");
        objTigre01.makeNoise();
        System.out.println(  "           Comida:  "+objTigre01.getComida()+
                           "\n           Habitat: "+objTigre01.getHabitat()+
                           "\n           Cor:     "+objTigre01.getCor());
          
        
        System.out.println("\n\nInfº Lobo: ");
        objLobo01.makeNoise();
        System.out.println(  "           Comida:  "+objLobo01.getComida()+
                           "\n           Habitat: "+objLobo01.getHabitat()+
                           "\n           Peso:    "+objLobo01.getPeso()+"Kg");
          
        
        System.out.println("\n\nInfº Cao: ");
        objCao01.makeNoise();
        System.out.println(  "           Comida:  "+objCao01.getComida()+
                           "\n           Habitat: "+objCao01.getHabitat()+
                           "\n           Tamanho: "+objCao01.getTamanho()+"cm");
        
        
    }
    
}
