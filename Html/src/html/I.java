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
public class I extends TagDupla {

    public I(HtmlComponent... conteudos) {
        super(conteudos);
    }

    public I(String... conteudos) {
        super(conteudos);
    }
    
    

 
    @Override
    public String tagNome() {
        return "i";
    }
    
}
