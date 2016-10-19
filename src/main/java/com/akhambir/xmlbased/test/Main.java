package com.akhambir.xmlbased.test;

import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static String testDameFormat() {
        final String TIMESTAMP_PATTERN = "hh:mm:ss, dd-MM-yyyy";
        LocalDateTime timestamp = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(TIMESTAMP_PATTERN);
        return timestamp.format(formatter);

    }

    public static void main(String[] args) {
        System.out.println(testDameFormat());
        Solution solution = new Solution();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        Solution solution1 = new Solution();
        solution1.addTwoNumbers(l1, l2);
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            return merging(l1, l2);
        }

        public ListNode merging(ListNode l1, ListNode l2) {
            ListNode result = null;


            for (; hasNext(l1, l2); l1 = l1.next, l2 = l2.next, result = result.next)  {
                if (l1.val + l2.val >= 10) {
                    result = new ListNode(singleDidgitValue(l1.val + l2.val));
                    if (l1.next != null) {
                        l1.val += 1;
                    }
                } else {
                    result = new ListNode(l1.val + l2.val);
                }
            }
            return result;
        }

        public boolean hasNext(ListNode node1, ListNode node2) {
            if (node1 == null || node2 == null) {
                return false;
            } else {
                return true;
            }
        }

        public int singleDidgitValue(int value) {
            return value % 10;
        }
    }
}
