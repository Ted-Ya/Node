public class ReverseDoubleLinkList {

    public static void main(String[] args) {
        DoubleNode<Integer> node1 = new DoubleNode<>(1);
        DoubleNode<Integer> node2 = new DoubleNode<>(2);
        DoubleNode<Integer> node3 = new DoubleNode<>(3);
        DoubleNode<Integer> node4 = new DoubleNode<>(4);
        DoubleNode<Integer> node5 = new DoubleNode<>(5);
        DoubleNode<Integer> node6 = new DoubleNode<>(6);

        node1.next = node2;

        node2.pre = node1;
        node2.next = node3;

        node3.pre = node2;
        node3.next = node4;

        node4.pre = node3;
        node4.next = node5;

        node5.pre = node4;
        node5.next = node6;

        node6.pre = node5;
        DoubleNode<Integer> newHead = reverseDoubleLinKList(node1);


        System.out.print(node5.pre.data + " ");
        System.out.print(node4.pre.data + " ");
        System.out.print(node3.pre.data + " ");
        System.out.print(node2.pre.data + " ");
        System.out.print(node1.pre.data + " ");
        System.out.println(node1.data);

        System.out.print(newHead.data + " ");
        System.out.print(newHead.next.data + " ");
        System.out.print(node5.next.data + " ");
        System.out.print(node4.next.data + " ");
        System.out.print(node3.next.data + " ");
        System.out.print(node2.next.data + " ");
    }

    private static <T> DoubleNode<T> reverseDoubleLinKList(DoubleNode<T> head) {
        if(head == null){
            return  null;
        }

        DoubleNode<T> pre = null;
        DoubleNode<T> next= null;
       while (head.next != null){
         next = head.next;
         head.next = pre;
         head.pre = next;
         pre = head;
         head = next;
       }

       head.next = pre;
       head.pre = null;
       return head;
    }
}
