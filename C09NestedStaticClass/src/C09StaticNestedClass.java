public class C09StaticNestedClass {
    //nested top level class or static
    static class InnerClass {
        public void printMsg(String msg) {
            System.out.println(msg);
        }
    }
    
    public void callInnerClass() {
        InnerClass cInnerclass = new InnerClass();
        cInnerclass.printMsg("method call");
    }
    
    public static void main(String[] args) {
        InnerClass ic = new InnerClass();
        ic.printMsg("new class call");
        
        C09StaticNestedClass.InnerClass ic2 = new C09StaticNestedClass.InnerClass();
        ic2.printMsg("new outer class call");
        
        C09StaticNestedClass nc = new C09StaticNestedClass();
        nc.callInnerClass();
        
        
    }
    
}
