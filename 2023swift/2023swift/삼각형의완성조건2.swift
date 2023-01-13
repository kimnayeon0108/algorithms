//
//  삼각형의완성조건2.swift
//  2023swift
//
//  Created by 김나연 on 2023/01/13.
//
import Foundation

func solution(sides:[Int]) -> Int {
    var max = (max(sides[0], sides[1]))
    var min = (min(sides[0], sides[1]))
    var count = 1
    var num = max - min + 1
    
    // max가 가장 긴 변인 경우
    while num < max{
        count += 1
        num += 1
    }
    // num이 가장 긴 변인 경우
    while num < max + min - 1{
        count += 1
        num += 1
    }
    return count
}


