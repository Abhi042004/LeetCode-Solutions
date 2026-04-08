public class IntersectionLinkedList {


// Definition for singly-linked list
static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

// ===== TWO POINTER APPROACH (ACTIVE - YOUR FINAL VERSION) =====
public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

    if(headA == null || headB == null){
        return null;
    }

    ListNode temp1 = headA;
    ListNode temp2 = headB;

    while(temp1 != temp2){
        
        if(temp1 == null){temp1 = headB;}
        else{temp1 = temp1.next;}

        if(temp2 == null){temp2 = headA;}
        else{temp2 = temp2.next;}
    }
    return temp1;
}

/*
// ===== OPTIMIZED LENGTH DIFFERENCE APPROACH (COMMENTED OUT) =====

public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

    ListNode temp1 = headA;
    ListNode temp2 = headB;
    int c1 = 0;
    int c2 = 0;

    while(temp1!=null){
        c1++;
        temp1 = temp1.next;
    }

    while(temp2!=null){
        c2++;
        temp2 = temp2.next;
    }

    if(c1>c2){return collision(headA, headB, c1-c2);}
    else if(c2>c1){return collision(headB, headA, c2-c1);}
    else{return collision(headA, headB, 0);}
}

public static ListNode collision(ListNode headA, ListNode headB, int d){

    ListNode temp1 = headA;
    ListNode temp2 = headB;

    while(temp1!=null){
        if(d == 0){
            break;
        }
        temp1 = temp1.next;
        d--;
    }

    while(temp1!=null && temp2!=null){
        if(temp1 == temp2){
            return temp1;
        }
        temp1 = temp1.next;
        temp2 = temp2.next;
    }
    return null;
}
*/

/*
// ===== HASHMAP APPROACH (COMMENTED OUT) =====

public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

    java.util.HashMap<ListNode, Integer> map = new java.util.HashMap<>();

    ListNode temp1 = headA;
    while (temp1 != null) {
        map.put(temp1, 0);
        temp1 = temp1.next;
    }

    ListNode temp2 = headB;
    while (temp2 != null) {
        if (map.containsKey(temp2)) {
            return temp2;
        }
        temp2 = temp2.next;
    }

    return null;
}
*/

public static void main(String[] args) {

    // Create intersection part
    ListNode common = new ListNode(8);
    common.next = new ListNode(10);

    // List A: 3 -> 7 -> 8 -> 10
    ListNode headA = new ListNode(3);
    headA.next = new ListNode(7);
    headA.next.next = common;

    // List B: 99 -> 1 -> 8 -> 10
    ListNode headB = new ListNode(99);
    headB.next = new ListNode(1);
    headB.next.next = common;

    ListNode intersection = getIntersectionNode(headA, headB);

    if (intersection != null) {
        System.out.println("Intersection at node with value: " + intersection.val);
    } else {
        System.out.println("No intersection");
    }
}


}
