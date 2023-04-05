package Latihan2;

public class LinkQueue {
    public FirstLast thelist;
    public LinkQueue(){
        thelist = new FirstLast();
    }
    public boolean Empty(){
        return thelist.Empty();
    }
    public void enqueue (String j){
        thelist.insertLast(j);
    }
    public String dequeue(){
        return thelist.delete();
    }
    public void displayQueue(){
        System.out.println("Queue (head ==> tail) : ");
        thelist.displayList();
    }
    public void displayFisrt(){
        thelist.showFirst();
    }
}
