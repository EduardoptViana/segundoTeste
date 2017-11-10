/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.gof.visitor;

/**
 *
 * @author crfranco
 */
public interface ItemElement {
    public int accept(ShoppingCartVisitor visitor);
    
}
