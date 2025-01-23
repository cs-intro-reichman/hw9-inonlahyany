public class PrivateMemoryTester {
    public static void main (String[] args) {

        MemoryBlock mem1 = new MemoryBlock(100, 10);
        MemoryBlock mem2 = new MemoryBlock(110, 5);

        MemorySpace space = new MemorySpace(100);

        System.out.println(space);

        space.malloc(5);
        space.malloc(10);
        space.malloc(20);
        space.malloc(50);


        System.out.println(space);

        space.free(0);
        space.free(5);
        space.free(15);

        System.out.println(space);

        space.defrag();

        System.out.println(space);

        space.free(35);

        space.defrag();

        System.out.println(space);

        // ownList.addLast(mem1);
        // ownList.addLast(mem2);

        // System.out.println(ownList);

        // ownList


	}    
}
