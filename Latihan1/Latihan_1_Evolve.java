package Latihan1;

public class Latihan_1_Evolve {
     public static void main(String[] args) {
         Custom_Method cm = new Custom_Method();

         cm.addItem("Aku");
         cm.addItem("Anak");
         cm.addItem("Indonesia");

         System.out.println("Next : " + cm.readtop());
         cm.addItem("Raya");
         System.out.println(cm.remove());
         cm.addItem("!");

         int counter = cm.searchItem("Aku");
         while (counter != -1 && counter >1){
             cm.remove();
             counter--;
         }
         System.out.println(cm.remove());
         System.out.println(cm.unfilled());
     }
}

