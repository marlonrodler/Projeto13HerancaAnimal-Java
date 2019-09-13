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
public class Cao extends Canino{
    private double tamanho;

    public Cao() {
    }

    public Cao(double tamanho, String comida, String habitat) {
        super(comida, habitat);
        this.tamanho = tamanho;
    }

    
    
    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    
    
    
    @Override
    public void makeNoise(){
        System.out.println("           Cão:     Late");
    }
}
