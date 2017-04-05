package wordObjects;

/**
 * Created by Zique Yuutaka on 4/2/2017.
 */

public class Word {

    private String germanWord;
    private String englishWord;
    private String type;

    //Default constructor for debugging
    public Word(){
        germanWord = "Duhas";
        englishWord = "Meh";
        type="word";
    }

    public Word(String germanWord, String englishWord, String type){
        setType(type);
        setGermanWord(germanWord);
        setEnglishWord(englishWord);
    }

    public String getGermanWord() {
        return germanWord;
    }

    public void setGermanWord(String germanWord) {
        String temp = germanWord.substring(0,3);
        if(temp.toLowerCase().equals("das") && type.toLowerCase().equals("noun")){
            this.germanWord = germanWord;
        }else if(type.toLowerCase().equals("noun")){
            this.germanWord = "das " + germanWord;
        }else{
            this.germanWord = germanWord;
        }
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
