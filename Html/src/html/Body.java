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
public class Body extends TagDupla{

    public Body (HtmlComponent... conteudos) {
        super(conteudos);
    }

    public Body (String... conteudos) {
        super(conteudos);
    }
    
    @Override
    public String tagNome() {
        return "body";
    }
    
}
