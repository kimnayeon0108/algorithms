//
//  ValidParentheses.swift
//  2023swift
//
//  Created by 김나연 on 2023/01/24.
//

import Foundation

func validParentheses(_ s: String) -> Bool {
   
    var stack:[Character] = []
    
    for char in s {
        let lastElement = stack.last
        
        if !stack.isEmpty && ((char == ")" && lastElement == "(") || (char == "}" && lastElement == "{")
                                || (char == "]" && lastElement == "[")) {
                stack.removeLast()
        } else {
            stack.append(char)
        }
    }
    return stack.count == 0
}
