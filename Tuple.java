

// public class Tuple<A, B> implements Comparable<Tuple<A, B>> {
// 
   // private A first;
   // private B second;
// 
   // public Tuple(A first, B second) {
      // super();
      // this.first = first;
      // this.second = second;
   // }   
// 
// }

public class Tuple implements Comparable<Tuple> {

   private Integer field1;
   private Integer field2;
   
   public Tuple (Integer f1, Integer f2) {
      field1 = f1;
      field2 = f2;   
   }
   
   public int compareTo(Tuple that) {
      if (this.field1 < that.field1) {
         return -1;
      }   
      else if (this.field1 > that.field1) {
         return 1;
      }   
      else { 
         return 0;
      }
   }      

}