class PalindromeNumber:
    def isPalindrome(self, x: int) -> bool:
        original = x
        reverse = 0
        while x > 0:
            reverse = reverse * 10 + (x % 10)
            x = x // 10

        return original == reverse