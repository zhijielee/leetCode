//
//  TwoSum.swift
//  leetcode-Swift
//
//  Created by Die antwort on 2021/7/10.
//

import Foundation

class TwoSum {
    func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
        var numToIndex = [Int: Int]()

        // faster than (index,num) in nums.enumerated()
        for index in nums.indices {
            let anotherNum = target - nums[index]

            if let anotherIndex = numToIndex[anotherNum] {
                return [anotherIndex, index]
            }

            numToIndex[nums[index]] = index
        }

        return []
    }
}
