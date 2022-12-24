package com.example.dictionarysandeep11dec;


import java.util.HashMap;

public class DictionaryUsingHashMap {
    HashMap<String, String> dictionary = new HashMap<>();

    public DictionaryUsingHashMap() {
        this.dictionary = new HashMap<>();
        addWordList();
        addWordGermanList();
    }

    public boolean addWords(String word, String meaning){
        try{
            dictionary.put(word, meaning);
        } catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public String getMeaning(String word){
        if(dictionary.containsKey(word)){
            return dictionary.get(word);
        }
        else{
            return "No word found!";
        }
    }

    private void addWordList(){
        addWords("shubh", "Auspicious.");
        addWords("phase", "A stage in the development of something.");
        addWords("awesome", "Extremely impressive.");
        addWords("Suspicious", "Showing distrust of someone or something.");
        addWords("start", "beginning of something.");
        addWords("dog", "animal");
        addWords("apple", "fruit");

    }
    private void addWordGermanList(){
        addWords("dog", "hunde");
        addWords("and", "und");
        addWords("apple", "appfal");
        addWords("girl", "madchen");
        addWords("man", "mann");
    }
}
