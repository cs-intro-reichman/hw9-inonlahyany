public class PrivateMemoryTester {
    public static void main (String[] args) {

        MemorySpace memorySpace = new MemorySpace(100);
        
            String expected1 = "\n(0 , 5) (5 , 20) (25 , 20) (45 , 55) ";
            String expected2 = "(0 , 5) (25 , 20) \n(5 , 20) (45 , 55) ";
            String expected3 = "(0 , 45) \n(45 , 55) ";
 
                int address = memorySpace.malloc(5);
                int address1 = memorySpace.malloc(20);
                int address2 = memorySpace.malloc(20);
                int address3 = memorySpace.malloc(55);
                // expected 1 
                System.out.println(memorySpace);
                memorySpace.free(address);
                memorySpace.free(address2);
                // expected 2
                System.out.println(memorySpace);
                memorySpace.defrag();
                // expected 2
                System.out.println(memorySpace);
                memorySpace.free(address1);
                memorySpace.defrag();
                // expected 3
	}    
}
