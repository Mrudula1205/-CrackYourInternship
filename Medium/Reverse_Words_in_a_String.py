class Solution:
    def reverseWords(self, s: str) -> str:
        str1 = s.split()
        str1.reverse()
        res = ""
        for i in range(len(str1)):
            if(i==(len(str1)-1)):
                res = res + str1[i] + ""
            else:
                res = res + str1[i] + " "
        return res