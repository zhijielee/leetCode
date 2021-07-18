//
//  AddTwoNumbers.swift
//  leetcode-Swift
//
//  Created by Die antwort on 2021/7/18.
//

import Foundation

/*
 * Definition for singly-linked list.
 */
 public class ListNode {
    public var val: Int
    public var next: ListNode?

    public init() {
        self.val = 0;
        self.next = nil;
    }

    public init(_ val: Int) {
        self.val = val;
        self.next = nil;
    }

    public init(_ val: Int, _ next: ListNode?) {
        self.val = val;
        self.next = next;
    }
 }

class AddTwoNumbers {
    func addTwoNumbers(_ l1: ListNode?, _ l2: ListNode?) -> ListNode? {
        var resultList : ListNode? = nil
        var resultListIndex : ListNode? = resultList
        var l1Index : ListNode? = l1
        var l2Index : ListNode? = l2
        var carry = 0

        while nil != l1Index || nil != l2Index {
            var sum = 0
 
            if let l1IndexUnwrap = l1Index {
                sum += l1IndexUnwrap.val
                l1Index = l1Index?.next
            }

            if let l2IndexUnwrap = l2Index {
                sum += l2IndexUnwrap.val
                l2Index = l2Index?.next
            }

            let listNode = ListNode((sum + carry) % 10)
            if let resultListIndexUnwrap = resultListIndex {
                resultListIndexUnwrap.next = listNode
                resultListIndex = listNode
            }
            else {
                resultList = listNode
                resultListIndex = resultList
            }

            carry = (sum + carry) / 10
        }

        if let resultListIndexUnwrap = resultListIndex, 0 != carry {
            let listNode = ListNode(carry)
            resultListIndexUnwrap.next = listNode
        }

        return resultList
    }
}
