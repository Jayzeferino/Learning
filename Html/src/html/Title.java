/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package html;

/**
 *
 * @author JoaoVictor
 */
public class Title extends TagDupla {
    public Title (HtmlComponent... conteudos) {
        super(conteudos);
    }

    public Title (String... conteudos) {
        super(conteudos);
    }
    
    @Override
    public String tagNome() {
        return "Title";
    }
}
