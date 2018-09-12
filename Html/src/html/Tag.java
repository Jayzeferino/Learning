/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package html;

import java.util.ArrayList;

/**
 *
 * @author luizloja
 */
public abstract class Tag implements HtmlComponent {


 
    public abstract String tagNome();
    
    public String toString(){
        return toHtml();
    }
    
    public String toHtml(){
         String abreTag = "<" + tagNome() ;
         return abreTag;
    }

    
    
    
}
