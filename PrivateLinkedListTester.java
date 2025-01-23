public class PrivateLinkedListTester {
    public static void main (String[] args) {

        MemoryBlock mem1 = new MemoryBlock(100, 10);
        LinkedList ownList = new LinkedList();
        ownList.addLast(mem1);
        System.out.println(ownList);

        ownList.addLast(new MemoryBlock(130, 2));
        System.out.println(ownList);

        ownList.addFirst(new MemoryBlock(40, 2));
        System.out.println(ownList);

        ownList.add(1, new MemoryBlock(50, 2));
        System.out.println(ownList);

        System.out.println(ownList.getNode(2));

        System.out.println(ownList.getFirst());

        System.out.println(ownList.getLast());

        System.out.println(ownList.getSize());

        ownList.remove(1);
        System.out.println(ownList);
        System.out.println(ownList.getSize());

        ownList.remove(mem1);
        System.out.println(ownList);
        System.out.println(ownList.getSize());

        // System.out.println(ownList);
	}
}

