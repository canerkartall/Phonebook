
package phonebook;

import java.util.*;
import phonebook.LinkedList;
import phonebook.LinkedListP;
import phonebook.Person;
import phonebook.Phone;

public class Test {
    public static void main(String[] args) {
        int i;
        Scanner x=new Scanner(System.in);
        Scanner x1=new Scanner(System.in);
        LinkedList PList = new LinkedList ();
        LinkedListP PHList = new LinkedListP();
        
       while(true){
        System.out.println("--------------------");
        System.out.println("Adding a new Person or Phone : 1");
        System.out.println("Updating a Person or Phone: 2");
        System.out.println("Removing a Person or Phone: 3");
        System.out.println("Searching a Person or Phone: 4");
        System.out.println("List all People and Phones: 5");
        System.out.println("Exit: 0");
        System.out.println("--------------------");
        while(true){
        System.out.println("Choose operation number:");
        i = x.nextInt();
        int control= i;
        if(control>=0 && control<=5){
            break;
        }
    }
        if(i==0)
            break;
        if(i==1){
                    int y;
             System.out.println("--------------------");
             System.out.println("Adding a new Person: 1");
             System.out.println("-DO NOT CHOOSE WITHOUT ANY PERSON REGISTERED- Adding a new Phone : 2");
             System.out.println("--------------------");
            while(true){
        System.out.println("Choose operation number:");
        y = x.nextInt();
        int control= y;
        if(control>=1 && control<=2){
            break;
        }
        }
            if(y==1){
            int id;
            while(true){
             System.out.println("Enter person id : ");
             id=x.nextInt();
             int security=id;
             int controlls=0;
             for(int o=0;o<PList.size;o++){
                 if(PList.get(o).GetId()==id)
                     controlls=1;
             }
             if (controlls==1){
             System.out.println("id must be unique");
             }
                 for(int o1=0;o1<PList.size;o1++){
                 if(PList.get(o1).GetId()==security)
                    controlls=1;
             }
             if (controlls==0)
                 break;
            }
             System.out.println("Enter person name: ");
             String name=x1.nextLine();
             System.out.println("Enter person surname: ");
             String surname=x1.nextLine();
             System.out.println("Enter person address: ");
             String address=x1.nextLine();
             
             PList.add(new Person(id,name,surname,address,null));
        }
            if(y==2){
            int id;
            System.out.println("----------Choose the person id for adding phones--------");
            PList.write();
            while(true){
                
            System.out.println("Select ID: ");
            
             id=x.nextInt();
             int security=id;
             int controlls=0;

 
             for(int o=0;o<PList.size;o++){
                 if(PList.get(o).GetId()==id)
                    controlls=1;
             }
                 for(int o1=0;o1<PHList.size;o1++){
                 if(PHList.get(o1).GetId()==security)
                    controlls=0;
             }
             if (controlls==1){
                    break;
             }
             else{System.out.println("Wrong Person ID --IF YOU DONT HAVE ANY OPTION, RESTART THE PROGRAM--");}
                 
            }
            
            System.out.println("-0 if not available- Enter Home Number: ");
             int h=x.nextInt();
             System.out.println("-0 if not available-Enter Work Number: ");
             int w=x.nextInt();
             System.out.println("-0 if not available-Enter Cell Number: ");
             int c=x.nextInt();
             
             PHList.add(new Phone(id,h,w,c,null));
            }
        }
        if(i==2){
        
         int z;
             System.out.println("--------------------");
             System.out.println("Updating a Person: 1");
             System.out.println("Updating a Phone : 2");
             System.out.println("--------------------");
            while(true){
        System.out.println("Choose operation number:");
        z = x.nextInt();
        int control= z;
        if(control>=1 && control<=2){
            break;
        }
        }
        if(z==1){
                int g;
                int z1;
                int Searchid;
                int controlls=0;
                while(true){
                System.out.println("Enter Person id for updating: ");
                Searchid = x.nextInt();
                for (g=0;g<PList.size;g++){
                    if(PList.get(g).GetId()==Searchid){
                        controlls=1;
                        break;
                    }
                }
                if (controlls==1)
                    break;
                }
             System.out.println("--------------------");
             System.out.println("Name : 1");
             System.out.println("Surname : 2");
             System.out.println("Address : 3");
             System.out.println("--------------------");
             while(true){
        System.out.println("Choose Property number for update:");
        z1 = x.nextInt();
        int control= z1;
        if(control>=1 && control<=3){
            break;
        }
            }
                          if(z1==1){
                 System.out.println("Enter new name:");
                 String newname = x1.nextLine();
                 PList.get(g).SetName(newname);
                 
             }
             if(z1==2){
                 System.out.println("Enter new surname:");
                 String newsurname = x1.nextLine();
                 PList.get(g).SetSurName(newsurname);
                 
             }
             if(z1==3){
                 System.out.println("Enter new Address:");
                 String newaddress= x1.nextLine();
                 PList.get(g).SetAddress(newaddress);
                 
             }
        }
        if(z==2){
                int g;
                int z2;
                int controlId = 0;
                while(true){
                System.out.println("Enter Phone -owner- id: ");
                int Searchid7 = x.nextInt();
                for (g=0;g<PHList.size;g++){
                    if(PHList.get(g).GetId() == Searchid7){
                        controlId =1; 
                        break;
                    }
                }
                  if (controlId == 1)
                    break;
                }
             System.out.println("--------------------");
             System.out.println("Home Number: 1");
             System.out.println("Work Number : 2");
             System.out.println("Cell Number : 3");
             System.out.println("--------------------");
                    while(true){
        System.out.println("Choose number type for update:");
        z2 = x.nextInt();
        int control= z2;
        if(control>=1 && control<=3){
            break;
        }
            }
               if(z2==1){
                 System.out.println("Enter new Home number:");
                 int newhn = x.nextInt();
                 PHList.get(g).SetHome(newhn);
                 
             }
                if(z2==2){
                 System.out.println("Enter new Work number:");
                 int newwn = x.nextInt();
                 PHList.get(g).SetWork(newwn);
                 
             }
                if(z2==3){
                 System.out.println("Enter new Cell number:");
                 int newcn = x.nextInt();
                 PHList.get(g).SetCell(newcn);
                 
             }
        }
        }
        if(i==3){
        
               int k;
             System.out.println("--------------------");
             System.out.println("Removing a person -also phones of him/her-: 1");
             System.out.println("Removing a specific phone : 2");
             System.out.println("--------------------");
            while(true){
        System.out.println("Choose operation number:");
        k = x.nextInt();
        int control= k;
        if(control>=1 && control<=3){
            break;
        }
        }
                if(k==1){
                int g;
                int h;
                int Searchid2;
                int controlls=0;
                while(true){
                System.out.println("Enter person id for remove: ");
                Searchid2 = x.nextInt();
                for (g=0;g<PList.size;g++){
                    if(PList.get(g).GetId()==Searchid2){
                        controlls=1; 
                        break;}
                         
                }
                  if (controlls==1)
                    break;
                }if(PList.size == PHList.size){
                   for (h=0;h<PHList.size;h++){
                    if(PHList.get(h).GetId()==Searchid2){
                        break;}                        
                }
                     PHList.deletion(PHList.get(h));
                }
                PList.deletion(PList.get(g));

                System.out.println("Removed!");
            }
                if(k==2){
                                    int g;
                int z2;
                int controlId = 0;
                while(true){
                System.out.println("Enter Phone -owner- id: ");
                int Searchid7 = x.nextInt();
                for (g=0;g<PHList.size;g++){
                    if(PHList.get(g).GetId() == Searchid7){
                        controlId =1; 
                        break;
                    }
                }
                  if (controlId == 1)
                    break;
                }
             System.out.println("--------------------");
             System.out.println("Home Number: 1");
             System.out.println("Work Number : 2");
             System.out.println("Cell Number : 3");
             System.out.println("--------------------");
                    while(true){
        System.out.println("Choose number type for delete:");
        z2 = x.nextInt();
        int control= z2;
        if(control>=1 && control<=3){
            break;
        }
            }
               if(z2==1){

                 PHList.get(g).SetHome(0);
                 
             }
                if(z2==2){
                 PHList.get(g).SetWork(0);               
}
                if(z2==3){
                 PHList.get(g).SetCell(0);               
}              
}
}
        if(i==4){
             int d;
             System.out.println("--------------------");
             System.out.println("Listing Persons: 1");
             System.out.println("Listing Phones: 2");
             System.out.println("--------------------");
            while(true){
        System.out.println("Choose operation number:");
        d = x.nextInt();
        int control= d;
        if(control>=1 && control<=2){
            break;
        }
        }
           if(d==1){
                int d1;
                String Searchid9;
             System.out.println("--------------------");
             System.out.println("Name : 1");
             System.out.println("Surname : 2");
             System.out.println("Address : 3");
             System.out.println("--------------------");
             while(true){
        System.out.println("Choose Property number:");
        d1 = x.nextInt();
        int control= d1;
        if(control>=1 && control<=3){
            break;
        }
            }
               if(d1==1){
                System.out.println("Enter person name for List: ");
                 Searchid9=x1.nextLine();
                 PList.FilterByName(Searchid9);
               }
               if(d1==2){
                System.out.println("Enter person surname for List: ");
                Searchid9 = x1.nextLine(); 
                PList.FilterBySurName(Searchid9);
               }
               if(d1==3){
                System.out.println("Enter person address for List: ");
                Searchid9 = x1.nextLine();
                PList.FilterByAddress(Searchid9);
               }
            
            }
           if(d==2){
                int d1;
             System.out.println("--------------------");
             System.out.println("Home number : 1");
             System.out.println("Work number: 2");
             System.out.println("Cell number: 3");
             System.out.println("--------------------");
             while(true){
        System.out.println("Choose Property number:");
        d1 = x.nextInt();
        int control= d1;
        if(control>=1 && control<=3){
            break;
        }
            }
               if(d1==1){
                System.out.println("Enter Home number for List: ");
                int Searchid9 = x.nextInt();
                PHList.FilterByHome(Searchid9);
                
               }
               if(d1==2){
                System.out.println("Enter Work number for List: ");
                int Searchid9 = x.nextInt();
                PHList.FilterByWork(Searchid9);
               }
               if(d1==3){
                System.out.println("Enter cell number for List: ");
                int Searchid9 = x.nextInt();
                PHList.FilterByCell(Searchid9);
               }
           }
        }
        if(i==5){        
                PList.write();
                PHList.write();                
}
}
            System.out.println("finished");
}
}