public class C11LocalInnerClass{

    public void createInnerClass() {

        // member class or local inner class
        class LocalInnerClass {

            public void printMsg(String msg) {
                System.out.println(msg);
            }
        }
        LocalInnerClass mInnerclass = new LocalInnerClass();
        mInnerclass.printMsg("memberInnerClass method call");
    }
    
    public static void main(String[] args) {
        //InnerClass ic = new InnerClass(); // not allow
        //ic.printMsg("new class call");
        
        //C10NestedClass.InnerClass ic2 =  C10NestedClass.new InnerClass(); //not allow
        //ic2.printMsg("new outer class call");
        
        C11LocalInnerClass nc = new C11LocalInnerClass();
        nc.createInnerClass();
        
        
        
    }
}