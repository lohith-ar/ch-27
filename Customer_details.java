import java.util.Scanner;

public class Customer_details {
    Scanner s = new Scanner(System.in);
    String fname, lname;
    String phone_number;
    int age;    
    String Aadhar_number;
    String door_no;
    String streetname;
    String village;
    String city; 
    String statecode;
    String country;
    String account_number;
    // String address = address(door_no, streetname, village, city, country);

    String address(String door_no, String streetname, String village, String city, String country){
        door_no = s.next();
        streetname = s.next();
        village =s.next();
        city =s.next();
        country= s.next();

        String adrs = door_no+streetname+village+city+country;

        return adrs;
    }


    void new_account_creation(){
    
    // System.out.println("Welcome to your new banking experience");
    // System.out.println("Enter number of customers:"); int n = s.nextInt();
    System.out.println("\nEnter customer details below:");
    System.out.println("Enter first name:"); fname = s.next();
    System.out.println("Enter last name:"); lname = s.next();
    System.out.println("Enter phone number");

    do{
    phone_number = s.next();
    if(phone_number.length()>10 || phone_number.length()<10){
        System.out.println("Enter valid 10 digit phone number");
    }
    }while(phone_number.length()>10 || phone_number.length()<10 );



    System.out.println("Enter age"); age = s.nextInt();
    System.out.println("Enter aadhar number: "); 

    
    do{
        Aadhar_number = s.next();
        if(Aadhar_number.length()>12 || Aadhar_number.length()<12){
            System.out.println("Enter valid 12 digit aadhar number");
        }
    }while(Aadhar_number.length()>12 || Aadhar_number.length()<12 );




    System.out.println("Enter address in the below order:\n1. streetname\n2. village\n3. city\n");
    streetname = s.next(); village=s.next(); city = s.next(); 
    System.out.println("4. Statecode:");
    do{
        statecode = s.next();
        if(statecode.length()>2 || statecode.length()<2){
            System.out.println("Enter valid 2 character state code. (Example: first 2 letters of your state Vehicle number plate");
        }
    }while(statecode.length()>2 || statecode.length()<2);
    System.out.println("5. country:");
    country=s.next();


    String temp1 = "ICGSB";
    String temp2= statecode;
    String temp3 = phone_number.substring(6);
    // int temp3 =0;
    
    account_number = temp1+temp2+temp3;
    // temp3++; 

    System.out.println("Customer account number is: "+account_number);
    }



    
    boolean show_customerdetails_bylname(String lname){

        if(this.lname.equals(lname)){
            System.out.print(fname+" "+lname+"\n"+ age+"\n"+ phone_number+"\n"+ Aadhar_number+"\n"+streetname+"\n"+village+"\n"+city+"\n"+ statecode+"\n"+country);
            return true;
        }
        else{
            return false;
        }

    }

    boolean show_villagewise_customerdetails(String village){
        if(this.village.equals(village)){
            System.out.print(fname+"\t"+lname+"\t"+ age+"\t"+ phone_number+"\t"+streetname+"\t"+village+"\n");
            return true;
        }
        else{
            return false;
        }
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDoor_no() {
        return door_no;
    }

    public void setDoor_no(String door_no) {
        this.door_no = door_no;
    }

    public String getStreetname() {
        return streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
}
