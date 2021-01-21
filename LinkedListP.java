package phonebook;
import java.util.ArrayList;
public class LinkedListP {
    public Phone head;
    public int size=0;
    public LinkedListP (){
        head=new Phone(Integer.MAX_VALUE,1,2,3,null);
    }
public void add(Phone n){
    Phone current = head;
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
    Phone current = head;
    while(current!=null){
        int id1=current.GetId();
        int id2=current.GetHome();
        int id3=current.GetWork();
        int id4=current.GetCell();
        System.out.println("ID:"+id1 + "   Home Number:"+id2 + "   Work Number:"+id3+"   Cell Number:"+id4);
        current = current.next;
    } 
}
public Phone get(int index){
    Phone current = head;
        for(int i=0;i<index;i++){
        current = current.next;
    }
        return current;
}
public void deletion(Phone n) { 
    Phone current = head;
       if(n.GetId()== head.GetId())
        head=head.next;
       else{
    while(current.next!= n){
        current = current.next;
    }
    Phone next = current.next.next;
 
    current.next = next;
    size -- ;
}
}
            public void FilterByHome(int home){
        Phone current = head;

        ArrayList<String> array= new ArrayList<>();
        if(current.GetHome() == home)
            array.add(current.GetHome()+ " " + current.GetWork()+ " " + current.GetCell());
        while(current.next!=null){
          if(current.GetHome() == home)
              array.add(current.GetHome()+ " " + current.GetWork()+ " " + current.GetCell()); 
        current = current.next;
    }
        for(int t=0;t<array.size();t++){
            System.out.println((t+1) + " " + array.get(t));
        }
    }
        public void FilterByWork(int work){
        Phone current = head;

        ArrayList<String> array= new ArrayList<>();
        if(current.GetWork() == work)
            array.add(current.GetHome()+ " " + current.GetWork()+ " " + current.GetCell());
        while(current.next!=null){
          if(current.GetWork() == work)
              array.add(current.GetHome()+ " " + current.GetWork()+ " " + current.GetCell()); 
        current = current.next;
    }
        for(int t=0;t<array.size();t++){
            System.out.println((t+1) + " " + array.get(t));
        }
    }
        public void FilterByCell(int cell){
        Phone current = head;

        ArrayList<String> array= new ArrayList<>();
        if(current.GetCell() == cell)
            array.add(current.GetHome()+ " " + current.GetWork()+ " " + current.GetCell());
        while(current.next!=null){
          if(current.GetCell() == cell)
              array.add(current.GetHome()+ " " + current.GetWork()+ " " + current.GetCell()); 
        current = current.next;
    }
        for(int t=0;t<array.size();t++){
            System.out.println((t+1) + " " + array.get(t));
        }
    }
}
