/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

/**
 *
 * @author crfranco
 */
public class Reptil extends Animal{

    private final String corEscamas;
    
    public Reptil(String nome, Raca raca, double peso, String corEscamas) {
        super(nome, raca, peso);
        
        this.corEscamas = corEscamas;
    }

    public String getCorEscamas() {
        return corEscamas;
    }

    @Override
    public String toString() {
       return "Animal{" + "nome=" + nome + ", cor=" + corEscamas + ", diagnostico=" + diagnostico + '}';
    }
    
    
    
}
