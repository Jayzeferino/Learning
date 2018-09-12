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
public abstract class TagDupla extends Tag {
    
        private ArrayList <HtmlComponent> conteudo; 
        
     public TagDupla(HtmlComponent ... conteudos) {
        conteudo = new ArrayList <HtmlComponent>();
        
        for(HtmlComponent c : conteudos){
            conteudo.add(c);
        }
    }

    public TagDupla(String ... conteudos) {
        conteudo = new ArrayList <HtmlComponent>();
        for(String c : conteudos){
            conteudo.add(new HtmlString(c));
        } 
    }
    
    
    public void add(HtmlComponent ... component){
        for(HtmlComponent c : component){
           this.conteudo.add(c) ;  
        }
      
    }
    
      public void add(String ... component){
        for(String c : component){
           this.conteudo.add(new HtmlString(c)) ;  
        }
      
    }
      
      
     public String toHtml(){
         String abreTag = super.toHtml() +  ">" ;
         
         StringBuffer buffer = new StringBuffer();
         buffer.append(abreTag);
         for(HtmlComponent c : conteudo){
             buffer.append("\n");
             buffer.append(c.toHtml());
             
         }
        
         String fechaTag = "</" + tagNome() + ">"; 
         buffer.append(fechaTag);
         
         return   buffer.toString() ; 
    }

    
}
