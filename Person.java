
package phonebook;


public class Person {
    private int id;
    private String Name;
    private String Surname;
    private String Address;
    public Person next;
        public Person(int i, String na, String s,String d, Person next){
        id=i;
        Name = na;
        Surname = s;
        Address = d;
        this.next=next;
    }
        public void SetId(int n){
        id=n;
    }
    public int GetId(){
        return id;
    }

     public void SetName(String n){
        Name=n;
    }
    public String GetName(){
        return Name;
    }
     public void SetSurName(String s){
        Surname=s;
    }
    public String GetSurname(){
        return Surname;
    }
     public void SetAddress(String d){
        Address=d;
    }
    public String GetAddress(){
        return Address;
    }	
    public boolean equals(String x,String y){
        return x.equals(y);
    }

}
