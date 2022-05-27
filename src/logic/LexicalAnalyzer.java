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
            if(!wordList.Contains(w)){
                return false;
            }
        }
        return true;
    }
    
}
