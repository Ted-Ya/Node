public class ReverseLinkList {

    public static void main(String[] args) {
        Node<Integer> node1 = new Node<Integer>(1);
        Node<Integer> node2 = new Node<Integer>(2);
        Node<Integer> node3 = new Node<Integer>(3);
        Node<Integer> node4 = new Node<Integer>(4);
        Node<Integer> node5 = new Node<Integer>(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        Node<Integer> head = revereSingerLinkList(node1);
        for(Node<Integer> cur = head; cur !=null; cur=cur.next){
            System.out.print(cur.data+" ");
        }
    }


    private static <T> Node<T> revereSingerLinkList(Node<T> head){
        if(head == null){
            return null;
        }

      Node<T> pre = null;
      Node<T> next;

       while (head.next !=null){
           next = head.next;
           head.next = pre;
           pre = head;
           head = next;
       }
      head.next =pre;
       return head;
    }
}
