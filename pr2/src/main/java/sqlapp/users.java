package sqlapp;

import java.io.Serializable;

public class users  implements Serializable {
	 
		//private static final serialVersionUID = 1L;	
	    private int id;
	    private String name;
	    private String surname;
	    private String patronymic;
	    private String city;
	    private String street;
	    private String telnumb;
	    private String email;
	    private String wifi;
	    private String mobileinternet;
	    private String TV;
	    private String Password;
	    private String Tarif;
	    private String UrgentCall;
	     
	    public users(){ }
	    public users(String name,String surname,String patronymic,String city,String street, 
	    String telnumb,String email,String wifi,String mobileinternet,String TV
	    ,String Password,String Tarif,String UrgentCall){
	         
	        this.name = name;
	        this.surname = surname;
	        this.patronymic = patronymic;
	        this.city = city;
	        this.street = street;
	        this.telnumb = telnumb;
	        this.email = email;
	        this.wifi = wifi;
	        this.mobileinternet = mobileinternet;
	        this.TV = TV;
	        this.Password = Password;
	        this.Tarif = Tarif;
	        this.UrgentCall = UrgentCall;
	        
	    }
	    /*public users(int id,String name,String surname,String patronymic,String city,String street, 
	    String telnumb,String email,Boolean wifi,Boolean mobileinternet,Boolean TV){
	        
	    	this.id = id;
	        this.name = name;
	        this.surname = surname;
	        this.patronymic = patronymic;
	        this.city = city;
	        this.street = street;
	        this.telnumb = telnumb;
	        this.email = email;
	        this.wifi = wifi;
	        this.mobileinternet = mobileinternet;
	        this.TV = TV;
	        
	    }*/
	     
	    public int getId() {
	        return id;
	    }
	    public String getName() {
	        return name;
	    }
	    public  String getSurname() {
	        return surname;
	    }
	    public  String getPatronymic() {
	        return patronymic;
	    }
	    public  String getCity() {
	        return city;
	    }
	    public  String getStreet() {
	        return street;
	    }
	    public  String getTelnumb() {
	        return telnumb;
	    }
	    
	    public  String getEmail() {
	        return email;
	    }
	    public  String getWifi() {
	        return wifi;
	    }
	    public  String getMobileinternet() {
	        return mobileinternet;
	    }
	    public  String getTV() {
	        return TV;
	    }
	    public  String getPassowrd() {
	        return Password;
	    }
	    public  String getTarif() {
	        return Tarif;
	    }
	    public  String getUrgentCall() {
	        return UrgentCall;
	    }
	  
	    public void setName(String name) {
	        this.name = name;
	    }
	    public void setSurname(String surname) {
	        this.surname = surname;
	    }
	    public void setCity(String city) {
	        this.city = city;
	    }
	    public void setStreet(String Street) {
	        this.street = Street;
	    }
	    public void setTelNumb(String telnumb) {
	        this.telnumb = telnumb;
	    }
	    public void setEmail(String email) {
	        this.email = email;
	    }
	    public void setWifi(String wifi) {
	        this.wifi = wifi;
	    }
	    public void setMobInternet(String mobileinternet) {
	        this.mobileinternet = mobileinternet;
	    }
	    public void setTV(String TV) {
	        this.TV = TV;
	    }
	    public void setPassword(String Password) {
	        this.Password = Password;
	    }
	    public void setTarif(String Tarif) {
	        this.Tarif = Tarif;
	    }
	    public void setUrgentCall(String UrgentCall) {
	        this.UrgentCall = UrgentCall;
	    }
}
