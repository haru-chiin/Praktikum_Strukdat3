package Latihan2;

public class FirstLast {
    public LinkClass first;
    public LinkClass last;

    public FirstLast(){
        first = null;
        last = null;
    }
    public boolean Empty(){
        return first == null;
    }
    public void insertLast(String dd){
        LinkClass baru = new LinkClass(dd);
        if(Empty()){
            first = baru;
        }else {
            last.next = baru;
        }
        last = baru;
    }
    public String delete (){
        String temp = (String) first.dData;
        if(first.next == null){
            last = null;
        }
        first = first.next;
        return temp;
    }
    public void displayList(){
        LinkClass current = first;
        while (current != null){
            current.show();
            current = current.next;
        }
        System.out.println(" ");
    }
    public void showFirst(){
        LinkClass current = first;
        current.show();
    }
}
