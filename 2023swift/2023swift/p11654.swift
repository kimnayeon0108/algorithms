//
//  p11654.swift
//  week1
//
//  Created by 김나연 on 2023/01/18.
//

import Foundation

func p116545() {
    let input = readLine() ?? ""
    print(Int(UnicodeScalar(input)?.value ?? 0))
}
