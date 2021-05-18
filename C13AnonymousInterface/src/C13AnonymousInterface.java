interface Weapon {
   public void shoot();
}
public class C13AnonymousInterface {
    public static void main(String[] args) {
        Weapon w1 = new Weapon() {
         @Override
         public void shoot() {
            System.out.println("Inside an anonymous interface.");
         }
      };
      w1.shoot();
      
      //lambda expression
      Weapon w2 = () -> {
          System.out.println("Inside an anonymous interface.");
        };
      w2.shoot();
    }
    
}
