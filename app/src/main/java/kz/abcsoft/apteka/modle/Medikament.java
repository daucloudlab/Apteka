package kz.abcsoft.apteka.modle;

/**
 * Created by daulet on 6/4/15.
 */
public class Medikament {

    private String title ;
    private String description ;
    private double price ;

    public Medikament(){}

    public Medikament(String title, String description, double price){
        this.title = title ;
        this.description = description ;
        this.price = price ;
    }

    public String getTitle(){
        return title ;
    }

    public void setTitle(String title){
        this.title = title ;
    }

    public String getDescription(){
        return description ;
    }

    public void setDescription(String description){
        this.description = description ;
    }

    public double getPrice(){
        return price ;
    }

    public void setPrice(double price){
        this.price = price ;
    }
}
