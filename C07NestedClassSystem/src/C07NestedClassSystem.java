public class C07NestedClassSystem {

    double price;

    class Processor {
        double cores;
        String manufacturer;

        double getCache() {
            return 4.3;
        }
    }

    protected class HDD {

        double size;
        String manufacturer;

        double getAccessTime() {
            return 1.5;
        }
    }
    
    private class RAM {

        double memory;
        String manufacturer;

        double getClockSpeed() {
            return 5.5;
        }
    }
    
    public static void main(String[] args) {
        C07NestedClassSystem cpu = new C07NestedClassSystem();
        C07NestedClassSystem.Processor processor = cpu.new Processor();
        C07NestedClassSystem.HDD hdd = cpu.new HDD();
        C07NestedClassSystem.RAM ram = cpu.new RAM();
        
        System.out.println("Processor Cache = " + processor.getCache());
        System.out.println("Harddisk access = " + hdd.getAccessTime());
        System.out.println("Ram Clock speed = " + ram.getClockSpeed());
        System.out.println(cpu);
        System.out.println(processor);
        System.out.println(hdd);
        System.out.println(ram);
    }

}