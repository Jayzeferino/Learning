/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package html;

/**
 *
 * @author luizloja
 */
public abstract class TagSimples extends Tag{

    public TagSimples() {
    }

    @Override
    public String toHtml() {
        return super.toHtml() + "/>"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
