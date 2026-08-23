class Solution:
    def interpret(self, a: str) -> str:
        str = ""
        for i in range(len(a)):
            match a[i]:
                case 'G':
                    str = str + a[i]
                case '(':
                    if a[i + 1] is ')':
                        str = str + 'o'
                        i = i + 1
                    else:
                        str = str + 'al'
                        i = i + 3
        return str