/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author yunei
 */
public class LexicalAnalyzer {
    
    private WordList wordList;
    
    public LexicalAnalyzer(){
        wordList = new WordList();
    }
    
    public boolean lexicalCheck(String wordsToCheck){
        String[] words = wordsToCheck.split(" ");
        for(String w:words){
            if(wordList.Contains(w)){
                return false;
            }
        }
        return true;
    }
    
    public String wordsContained(String wordsToCheck){
        String result = "";
        String[] words = wordsToCheck.split(" ");
        int cont = 0;
        for(String w:words){
            if(wordList.Contains(w)){
                result += wordList.getWord(w)+": "+wordList.getType(w)+"\n";
                cont++;
            }
        }
        if(cont != words.length){
            result = "SENTENCIA INVALIDA";
        }
        return result;
    }
    
}
