
package phonebook;

import java.util.ArrayList;

public class LinkedList {
public Person head;
public int size=0;
    public LinkedList (){
        head=new Person(Integer.MAX_VALUE,"x","y","z",null);
    }
public void add(Person n){
    Person current = head;
    if(head.GetId()==Integer.MAX_VALUE) 
    {   n.next = null;
        head = n ;

    }
    
    while(current.next!=null){
        current = current.next;
    }
    n.next = null;
    current.next = n ;
    size ++;
}
public boolean isEmpty(){
    return (size==0);
}
public void write(){
    Person current = head;
    while(current!=null){
        int id1=current.GetId();
        String name1=current.GetName();
        String name2=current.GetSurname();
        String name3=current.GetAddress();
        System.out.println("ID:"+id1 + "   Name:"+name1 + "   Surname:"+name2+"   Address:"+name3);
        current = current.next;
    } 
}
public Person get(int index){
    Person current = head;
        for(int i=0;i<index;i++){
        current = current.next;
    }
        return current;
}
public void deletion(Person n) { 
    Person current = head;
    if(n.GetId()== head.GetId())
        head=head.next;
    else{
    
    while(current.next!= n){
        current = current.next;
    }
    Person next = current.next.next;
 
    current.next = next;
    size -- ;
}
}
    public void FilterByName(String name){
        Person current = head;

        ArrayList<String> array= new ArrayList<>();
        if(current.GetName().equals(name))
            array.add(current.GetName()+ " " + current.GetSurname());
        while(current.next!=null){
          if(current.GetName().equals(name))
              array.add(current.GetName()+ " " + current.GetSurname()); 
        current = current.next;
    }
        for(int t=0;t<array.size();t++){
            System.out.println((t+1) + " " + array.get(t));
        }
    }
        public void FilterBySurName(String surname){
        Person current = head;

        ArrayList<String> array= new ArrayList<>();
        if(current.GetSurname().equals(surname))
            array.add(current.GetName()+ " " + current.GetSurname());
        while(current.next!=null){
          if(current.GetSurname().equals(surname))
              array.add(current.GetName()+ " " + current.GetSurname()); 
        current = current.next;
    }
        for(int t=0;t<array.size();t++){
            System.out.println((t+1) + " " + array.get(t));
        }
    }
            public void FilterByAddress(String address){
        Person current = head;

        ArrayList<String> array= new ArrayList<>();
        if(current.GetAddress().equals(address))
            array.add(current.GetName()+ " " + current.GetSurname()+ " " + current.GetAddress());
        while(current.next!=null){
          if(current.GetAddress().equals(address))
              array.add(current.GetName()+ " " + current.GetSurname()+ " " + current.GetAddress()); 
        current = current.next;
    }
        for(int t=0;t<array.size();t++){
            System.out.println((t+1) + " " + array.get(t));
        }
    }
}