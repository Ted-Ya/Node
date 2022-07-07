public class LinkListActions {

    public static void main(String[] args) {
        Node<Integer> node1 = new Node<Integer>(3);
        Node<Integer> node2 = new Node<Integer>(3);
        Node<Integer> node3 = new Node<Integer>(3);
        Node<Integer> node4 = new Node<Integer>(4);
        Node<Integer> node5 = new Node<Integer>(5);
        Node<Integer> node6 = new Node<>(6);
        Node<Integer> node7 = new Node<>(3);
        Node<Integer> node8 = new Node<>(8);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;

//        Node<Integer> head = revereSingerLinkList(node1);
        Node<Integer> head = deleteSpecificNode(node1,3);
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

    private static Node<Integer> deleteSpecificNode(Node<Integer> head, int value){
       if(head == null){
           return null;
       }

       while (head!=null){
           if(head.data == value){
               head = head.next;
           }else {
               break;
           }
       }

        Node<Integer> curr = head;
       while (curr.next !=null){
           if(curr.next.data == value){
               if(curr.next.next !=null){
                   curr.next = curr.next.next;
               }else {
                   curr.next = null;
               }
           }else {
               curr =curr.next;
           }

       }

        return  head;
    }
}
