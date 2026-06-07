class Solution:
    def isValid(self, s: str) -> bool:
        bracketMap = {
            ')': '(',
            ']': '[',
            '}': '{',
            '(': ')',
            '[': ']',
            '{': '}',
        }
        stack = []
        for char in s:
            if char in {')', ']', '}'} :
                if len(stack) > 0 and stack[-1] == bracketMap[char]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(char)
        return len(stack) == 0

