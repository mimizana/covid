 import java.util.ArrayList;
class Person{
    String name;
    String email;
    String ph;
    String address;
    ArrayList<Symptom> arraySym= new ArrayList<Symptom>();
    ArrayList<ContactPerson> contactPersonArrayList = new ArrayList<ContactPerson>();

    public void setName(String name)
    {
        this.name=name;
    }

    public void setEmail(String email)
    {
        this.email=email;
    }
    public void setAddress(String adress)
    {
        this.address=adress;
    }

    public void setState(String adress)
    {
        this.address=adress;
    }
    public void setPh(String ph)
    {
        this.ph=ph;
    }
}