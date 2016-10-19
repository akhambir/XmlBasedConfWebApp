package com.akhambir.xmlbased.test;

public class NewSolution {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode workingNode = l1;
            ListNode workingNode2 = l2;

            ListNode headOfResult;
            while (workingNode != null) {


                workingNode = workingNode.next;
                workingNode2 = workingNode2.next;
            }
            return null;
        }
    }

    private class Coratge {

        int a;
        int b;



    }
}
