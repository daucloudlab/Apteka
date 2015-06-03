package kz.abcsoft.apteka.modle;


public class Apteka {
    private int id ;
    private String title ;
    private String phone ;
    private String address ;

    public Apteka(){}

    public Apteka(String title, String phone, String address){
        this.title = title ;
        this.phone = phone ;
        this.address = address ;
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

    public void setAddress(String address){
        this.address = address ;
    }

    public String getAddress(){
        return address ;
    }


}
