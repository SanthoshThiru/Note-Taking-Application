import java.util.*;

public class  Note {
    
    String title;
    String content;
    List<String> tags; 
    //Date creationDate;
    //Date ModifiedDate;

    //Default Constructor
    Note(){
        this.title = null;
        this.content = null;
        this.tags = new ArrayList<>();
    }

    //Parameterised Constructor
    Note(String title,String content,List<String> tags){
        this.title = title;
        this.content = content;
        this.tags = tags;
    }

    //toString method
    @Override
    public String toString(){
        return "Title: "+this.title+", Content: "+this.content+", Tags: "+this.tags;

    }

    //Getters & Setters
    public static void setTitle(String title){
        this.title = title;
    }

    public static void setContent(String content){
        this.content = content;
    }

    public static void setTag(List<String> tags){
        this.tags = tags;
    }

    public static void addTag(String tag){
        this.tags.add(tag);
    }

    public static void getTitle(){
        return this.title;
    }

    public static void setContent(String content){
        return this.content ;
    }

    public static void setTag(List<String> tags){
        return this.tags ;
    }


}