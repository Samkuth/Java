# Definition for singly-linked list.
class ListNode:
    def __init__(self, val, next=None):
        self.val = val
        self.next = next

class Solution:
    def mergeTwoLists(self, list1, list2):
        dummy = ListNode(0)
        tail = dummy

        while(list1 and list2):
            if(list1.val <= list2.val):
                tail.next = list1
                list1 = list1.next

            else:
                tail.next = list2
                list2 = list2.next

            tail = tail.next

        if(list1):
            tail.next = list1

        else:
            tail.next = list2

        return dummy.next
            
l13 = ListNode(4, None)
l12 = ListNode(2,l13)
l11 = ListNode(1,l12)
list1 = l11

l23 = ListNode(4, None)
l22 = ListNode(3, l23)
l21 = ListNode(1, l22)
list2 = l21

sol = Solution()
merged = sol.mergeTwoLists(list1, list2)

temp = merged

while temp:
    print((temp.val), end = " -> ")
    temp = temp.next

print(None)


