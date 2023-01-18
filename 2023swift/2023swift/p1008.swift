//
//  p1008.swift
//  week1
//
//  Created by 김나연 on 2023/01/18.
//

import Foundation

func p1008() {
    let input = readLine() ?? ""
    let split = input.split(separator: " ")
    let values = split.map{ Int($0.trimmingCharacters(in:
                CharacterSet.whitespacesAndNewlines)) ?? 0}

    print(Double(values[0]) / Double(values[1]))
}
