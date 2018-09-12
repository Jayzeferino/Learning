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
public class Html {
    
    
    public static String toHtml(String nome, String conteudo){
        return "<" + nome + ">" + conteudo + "</" + nome + ">"; 
    } 
}
