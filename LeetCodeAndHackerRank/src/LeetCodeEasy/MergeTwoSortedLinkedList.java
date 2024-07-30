package LeetCodeEasy;

public class MergeTwoSortedLinkedList {

	public static class ListNode {
		int val;
		ListNode next;

		public ListNode() {
		}

		public ListNode(int val) {
			this.val = val;
		}

		public ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static void main(String[] args) {

		ListNode g = new ListNode(4, null);
		ListNode f = new ListNode(2, g);
		ListNode e = new ListNode(1, f);

		ListNode j = new ListNode(4, null);
		ListNode i = new ListNode(3, j);
		ListNode h = new ListNode(1, i);

		ListNode value1 = mergeTwoLists(e, h);

		while (value1 != null) {
			System.out.print(value1.val + " ");
			value1 = value1.next;
		}
	}

//	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//		if (list1 == null || list2 == null) {
//            return (list1 != null) ? list1 : list2;
//        }
//
//        if (list1.val > list2.val) {
//            ListNode temp = list1;
//            list1 = list2;
//            list2 = temp;
//        }
//
//        list1.next = mergeTwoLists(list1.next, list2);
//        return list1;       
//	}
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		ListNode dummy = new ListNode();
		ListNode curr = dummy;

		while (list1 != null && list2 != null) {
			if (list1.val > list2.val) {
				curr.next = list2;
				list2 = list2.next;
			} else {
				curr.next = list1;
				list1 = list1.next;
			}
			curr = curr.next;
		}
		curr.next = (list1 != null) ? list1 : list2;
		return dummy.next;
	}
}