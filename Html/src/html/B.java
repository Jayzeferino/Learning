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
public class B extends TagDupla {

    public B(HtmlComponent... conteudos) {
        super(conteudos);
    }

    public B(String... conteudos) {
        super(conteudos);
    }

    

    @Override
    public String tagNome() {
        return "b";
    }
    
    
}
