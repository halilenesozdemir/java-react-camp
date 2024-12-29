public class User {

    String name;
    String surname;
    int id;
    String citizenshipNumber;

    public User(){

    };

    public User(String name,String surname,int id,String citizenshipNumber){
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.citizenshipNumber = citizenshipNumber;
    }

    public String getCitizenshipNumber() {
        return citizenshipNumber;
    }

    public void setCitizenshipNumber(String citizenshipNumber) {
        this.citizenshipNumber = citizenshipNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getName(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

}
