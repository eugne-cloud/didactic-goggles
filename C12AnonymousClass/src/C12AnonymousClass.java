class Polygon {
   public void display() {
      System.out.println("Inside the Polygon class");
   }
}
class AnonymousDemo {
   public void createClass() {
      // creation of anonymous class extending class Polygon
      Polygon p1 = new Polygon() {
         @Override
         public void display() {
            System.out.println("Inside an anonymous class.");
         }
      };
      p1.display();
   }
}

public class C12AnonymousClass {
    
    public class AnonymousClass {
        
    }

    public static void main(String[] args) {

       AnonymousDemo an = new AnonymousDemo();
       an.createClass();
        
       Polygon p2 = new Polygon() {
         @Override
         public void display() {
            System.out.println("Inside an anonymous class2.");
         }
      };
      p2.display();
    }
}

