package kz.abcsoft.apteka.modle;


import java.util.List;

public class Apteka {
    private int id ;
    private String title ;
    private String phone ;
    private List<String> addresses ;

    public Apteka(){}

    public Apteka(int id, String title, String phone, List<String> addresses){
        this.id = id ;
        this.title = title ;
        this.phone = phone ;
        this.addresses = addresses ;
    }

    public int getId(){
        return id ;
    }

    public void setTitle(String title){
        this.title = title ;
    }

    public String getTitle(){
        return title ;
    }

    public void setPhone(String phone){
        this.phone = phone ;
    }

    public String getPhone(){
        return phone ;
    }

    public void setAddress(List<String> addresses) {
        this.addresses = addresses ;
    }

    public List<String> getAddresses(){
        return addresses ;
    }


}
