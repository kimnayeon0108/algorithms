//
//  p2920.swift
//  week1
//
//  Created by 김나연 on 2023/01/18.
//

import Foundation

func p2920() {
    let input = readLine() ?? ""
    let split = input.split(separator: " ")
    let values = split.map{ Int($0.trimmingCharacters(in:
                CharacterSet.whitespacesAndNewlines)) ?? 0}
    
    var num: Int
    if values[0] == 1 {
        num = 1
    } else if values[0] == 8{
        num = 8
    } else {
        print("mixed")
        return
    }
    
    let first = num
    
    for i in values {
        if i != num {
            print("mixed")
            return
        }
        
        if first == 1 {
            num += 1
        } else {
            num -= 1
        }
    }
    
    if first == 1 {
        print("ascending")
        return
    } else {
        print("descending")
        return
    }
}
