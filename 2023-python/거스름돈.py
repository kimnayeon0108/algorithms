# 거스름돈 n원
def result(n) -> int:
    count = 0

    coins = [500, 100, 50, 10]

    for coin in coins:
        count = count + (n // coin)
        n %= coin

    return count
