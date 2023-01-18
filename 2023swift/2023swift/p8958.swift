//
//  p8958.swift
//  week1
//
//  Created by 김나연 on 2023/01/18.
//

import Foundation

func p8958() {
    let input = Int(readLine() ?? "0") ?? 0
    var array: [Int] = Array(repeating: 0, count: input)

    for i in 0...input-1 {
        let result = readLine() ?? ""
        var score = 0
        var adding = 1
        for c in result {
            if c == "O" {
                score += adding
                adding += 1
            } else {
                adding = 1
            }
        }
        array[i] = score
    }
    
    for a in array {
        print(a)
    }
}
