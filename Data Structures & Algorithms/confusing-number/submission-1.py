class Solution:
    def confusingNumber(self, n: int) -> bool:
        rev =0
        orig = n
        while(n>0):
            rem = n%10
            if(rem == 6):
                rem =9
            elif ( rem ==9):
                rem =6
            elif (rem ==2 or rem ==3 or rem ==4 or rem ==5 or rem ==7):
                return False
            rev = rev*10+rem
            n = n//10
        print(f"orig {orig} and rev is {rev}")
        return rev != orig
        