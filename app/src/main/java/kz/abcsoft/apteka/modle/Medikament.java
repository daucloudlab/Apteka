package kz.abcsoft.apteka.modle;

/**
 * Created by daulet on 6/4/15.
 */
public class Medikament {
    private int aid ; // apteka id
    private int cid ; // category id
    private String title ;
    private String description ;
    private double price ;

    public Medikament(){}

    public Medikament(int aid, int cid, String title, String description, double price){
        this.cid = cid ;
        this.aid = aid ;
        this.title = title ;
        this.description = description ;
        this.price = price ;
    }

    public int getAid(){
        return aid ;
    }

    public int getCid(){
        return cid ;
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
