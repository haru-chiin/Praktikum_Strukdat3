package Latihan2;

public class Main2 {
    public static void main(String[] args) {
        LinkQueue lq = new LinkQueue();
        lq.enqueue("Java");
        lq.enqueue("DotNet");
        lq.enqueue("PHP");
        lq.enqueue("HTML");
        System.out.println("Remove  : "+ lq.dequeue());
        System.out.print("Element : ");lq.displayFisrt();
        System.out.println("Poll : "+ lq.dequeue());
        System.out.print("Peek : ");lq.displayFisrt();

    }
}
