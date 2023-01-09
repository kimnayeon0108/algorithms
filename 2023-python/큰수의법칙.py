def result():
    n, m, k = map(int, input().split())
    data = list(map(int, input().split()))

    data.sort()
    max = data[n-1]
    max2 = data[n-2]

    sum = 0
    for i in range(1, m + 1):
        if (i % k == 0):
            sum += max2
        else:
            sum += max

    return sum


if __name__ == '__main__':
    print(result())