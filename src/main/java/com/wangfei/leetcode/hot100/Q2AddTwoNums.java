package com.wangfei.leetcode.hot100;

import java.util.ArrayList;
import java.util.List;

public class Q2AddTwoNums {
    public static void main(String[] args) {
        int[] nums1 = new int[]{2, 4, 3};
        int[] nums2 = new int[]{5, 6, 4};
        ListNode l1 = buildListNode(nums1);
        ListNode l2 = buildListNode(nums2);
        System.out.println(printListNode(l1));
        System.out.println(printListNode(l2));
        System.out.println(printListNode(addTwoNumbers1(l1, l2)));
        System.out.println(printListNode(addTwoNumbers2(l1, l2)));
    }

    private static ListNode buildListNode(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ListNode();
        }
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        for (int num : nums) {
            temp.next = new ListNode(num);
            temp = temp.next;
        }
        return dummy.next;
    }

    private static List<Integer> printListNode(ListNode head) {
        List<Integer> res = new ArrayList<>();
        if (head == null) {
            return res;
        }
        for (ListNode temp = head; temp != null; temp = temp.next) {
            res.add(temp.val);
        }
        return res;
    }

    private static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) {
            return new ListNode();
        }
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int l1Val = l1 == null ? 0 : l1.val;
            int l2Val = l2 == null ? 0 : l2.val;
            int rem = l1Val + l2Val + carry;
            carry = rem / 10;

            cur.next = new ListNode(rem % 10);
            cur = cur.next;

            if(l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry != 0) {
            cur.next = new ListNode(1);
        }
        return dummy.next;
    }

    private static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode temp = head;
        ListNode l1temp, l2temp;
        int carry = 0;
        for(l1temp = l1,  l2temp = l2; l1temp != null || l2temp != null;) {
            int l1Val = l1temp == null ? 0 : l1temp.val;
            int l2Val = l2temp == null ? 0 : l2temp.val;
            int rem = l1Val + l2Val + carry;
            carry = rem / 10;
            temp.next = new ListNode(rem % 10);

            temp = temp.next;
            l1temp = l1temp == null ? null : l1temp.next;
            l2temp = l2temp == null ? null : l2temp.next;
        }
        if(carry != 0) {
            temp.next = new ListNode(1);
        }
        return head.next;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
