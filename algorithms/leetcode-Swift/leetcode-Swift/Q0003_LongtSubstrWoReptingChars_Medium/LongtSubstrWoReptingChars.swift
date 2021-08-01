//
//  LongtSubstrWoReptingChars.swift
//  leetcode-Swift
//
//  Created by Die antwort on 2021/7/18.
//

import Foundation

class LongSubstrWoReptingChars {
    func lengthOfLongestSubstring(_ s: String) -> Int {
        var result = 0
        var subStr : [Character] = []
        
        for char in s {
            
            if let index = subStr.firstIndex(of: char) {
                // Removes the specified number of elements from the beginning of the collection.
                subStr.removeFirst(index + 1)
            }
            
            subStr.append(char)
            result = max(result, subStr.count)
        }
        
        return result
    }
}
