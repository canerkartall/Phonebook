package phonebook;
public class Phone {
     private int id;
    private int work;
    private int home;
    private int cell;
    public Phone next;

    public Phone(int i, int na, int s,int d, Phone next){
        id=i;
        home = na;
        work = s;
        cell = d;
        this.next=next;
    }
     public void SetId(int n){
        id=n;
    }
    public int GetId(){
        return id;
    }

     public void SetWork(int n){
        work=n;
    }
    public int GetWork(){
        return work;
    }
     public void SetHome(int s){
        home=s;
    }
    public int GetHome(){
        return home;
    }
     public void SetCell(int d){
        cell=d;
    }
    public int GetCell(){
        return cell;
    }	
}