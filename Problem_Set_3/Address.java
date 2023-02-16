/*
name: Evan Zhang
Date: 2022. 11。 20
Program name: the class to provide the address of a person
 */

package Problem_Set_3;

public class Address {
    //four initial variables
    private String address;
    private String city;
    private String province;
    private String postalCode;

    //create the instance of the class
    public Address(String address,String city, String province, String postalCode){
        this.address = address;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    //the accessor and the mutator and the accessor
    public String getAddress() {
        return address;
    }
    public String getCity() {
        return city;
    }
    public String getProvince() {
        return province;
    }
    public String getPostalCode() {
        return postalCode;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    //rewrite the toString method, let it return the address information of the person
    public String toString(){
        return ("Street address: " + address + "\nCity: " + city + "\nProvince: " + province + "" +"\nPostal code: " + postalCode);
    }
}
