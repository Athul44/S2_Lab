public class cpu{
    int price;
     class processor{
        int cores;
        String producer;
        processor(int noC, String manu){
            cores=noC;
            producer=manu;
        }
        void display(){
        System.out.println("\nProcessor info");
        System.out.println("No. of Cores = "+cores);
        System.out.println("Manufacturer = "+producer+"\n");
    }
    }
    static class ram{
        int mem;
        String manuf;
        ram(int memory,String producer ){
            mem=memory;
            manuf=producer;
        }
        void display(){
        System.out.println("Name: Athul Ajay");
	System.out.println("Reg No: SJC22MCA-017");
	System.out.println("Date: 28/03/2023");
	System.out.println("Course code: 20MCA132");
        System.out.println("\nRAM info");
        System.out.println("Memory = "+mem+" GB");
        System.out.println("Manufacturer = "+manuf+"\n");
    }}
    public static void main(String[] args) {
         cpu.ram obj1= new cpu.ram(64,"HyperX");
         cpu obj2 = new cpu();
         cpu.processor obj3 = obj2.new processor(16,"AMD");
         obj1.display();
         obj3.display();

    }
}
