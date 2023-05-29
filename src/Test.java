public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(1);
        myLinkedList.add(3);
        myLinkedList.add(10);

        System.out.println(myLinkedList.get(1));

        myLinkedList.remove(0);

        System.out.println(myLinkedList);
    }
}
