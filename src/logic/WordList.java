/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.ArrayList;

/**
 *
 * @author yunei
 */
public class WordList {
    
    public ArrayList<Token> list;
    
    public WordList(){
        list = new ArrayList();
        
        //PALABRAS RESERVADAS
        list.add(new Token("EXEC","PALABRAS RESERVADAS"));
        list.add(new Token("DEFAULT","PALABRAS RESERVADAS"));
        list.add(new Token("ANY","PALABRAS RESERVADAS"));
        list.add(new Token("UNIQUE","PALABRAS RESERVADAS"));
        list.add(new Token("VALUES","PALABRAS RESERVADAS"));
        list.add(new Token("DISTINCT","PALABRAS RESERVADAS"));
        list.add(new Token("EXISTS","PALABRAS RESERVADAS"));
        list.add(new Token("FROM","PALABRAS RESERVADAS"));
        list.add(new Token("HAVING","PALABRAS RESERVADAS"));
        list.add(new Token("ROWNUM","PALABRAS RESERVADAS"));
        list.add(new Token("FULL","PALABRAS RESERVADAS"));
        list.add(new Token("PROCEDURE","PALABRAS RESERVADAS"));
        
        //INSTRUMENTOS STRING
        list.add(new Token("\"","INSTRUMENTOS DE STRING"));
        list.add(new Token("'","INSTRUMENTOS DE STRING"));
        
        //SIMBOLOS ESPECIALES
        list.add(new Token(";","SIMBOLOS ESPECIALES"));
        list.add(new Token("(","SIMBOLOS ESPECIALES"));
        list.add(new Token(")","SIMBOLOS ESPECIALES"));
        list.add(new Token(".","SIMBOLOS ESPECIALES"));
        list.add(new Token("_","SIMBOLOS ESPECIALES"));
        list.add(new Token("-","SIMBOLOS ESPECIALES"));
        list.add(new Token("=","SIMBOLOS ESPECIALES"));
        
        //CONSTANTES
        list.add(new Token("NULL","CONSTANTES"));
        list.add(new Token("*","CONSTANTES"));
        
        //AGREGADOS
        list.add(new Token("INNER","AGREGADOS"));
        list.add(new Token("BY","AGREGADOS"));
        list.add(new Token("AS","AGREGADOS"));
        list.add(new Token("ASC","AGREGADOS"));
        list.add(new Token("DESC","AGREGADOS"));
        list.add(new Token("RIGHT","AGREGADOS"));
        list.add(new Token("LEFT","AGREGADOS"));
        list.add(new Token("IS","AGREGADOS"));
        list.add(new Token("INTO","AGREGADOS"));
        list.add(new Token("TOP","AGREGADOS"));
        list.add(new Token("PRIMARY","AGREGADOS"));
        list.add(new Token("FOREIGN","AGREGADOS"));
        
        //IDENTIFICADORES
        list.add(new Token("COLUMN","IDENTIFICADORES"));
        list.add(new Token("TABLE","IDENTIFICADORES"));
        list.add(new Token("DATABASE","IDENTIFICADORES"));
        list.add(new Token("KEY","IDENTIFICADORES"));
        list.add(new Token("INDEX","IDENTIFICADORES"));
        list.add(new Token("CONSTRAINT","IDENTIFICADORES"));
        list.add(new Token("VIEW","IDENTIFICADORES"));
        
        //OPERADORES
        list.add(new Token("AND","OPERADORES"));
        list.add(new Token("OR","OPERADORES"));
        list.add(new Token("NOT","OPERADORES"));
        list.add(new Token("JOIN","OPERADORES"));
        list.add(new Token("UNION","OPERADORES"));
        list.add(new Token("ALTER","OPERADORES"));
        list.add(new Token("WHERE","OPERADORES"));
        list.add(new Token("BACKUP","OPERADORES"));
        list.add(new Token("UPDATE","OPERADORES"));
        list.add(new Token("CASE","OPERADORES"));
        list.add(new Token("CHECK","OPERADORES"));
        list.add(new Token("SELECT","OPERADORES"));
        list.add(new Token("CREATE","OPERADORES"));
        list.add(new Token("DELETE","OPERADORES"));
        list.add(new Token("DROP","OPERADORES"));
        list.add(new Token("SET","OPERADORES"));
        list.add(new Token("INSERT","OPERADORES"));
        list.add(new Token("GROUP","OPERADORES"));
        list.add(new Token("IN","OPERADORES"));
        list.add(new Token("ORDER","OPERADORES"));
        list.add(new Token("BETWEEN","OPERADORES"));
        list.add(new Token("LIKE","OPERADORES"));
        list.add(new Token("LIMIT","OPERADORES"));
    }
    
    public boolean Contains(String word){
        for(Token k:list){
            if(word.equalsIgnoreCase(k.word)){
                return true;
            }
        }
        return false;
    }
    
    public String getWord(String word){
        for(Token k:list){
            if(word.equalsIgnoreCase(k.word)){
                return k.word;
            }
        }
        return "";
    }

    public String getType(String word){
        for(Token k:list){
            if(word.equalsIgnoreCase(k.word)){
                return k.type;
            }
        }
        return "";
    }
    
}
