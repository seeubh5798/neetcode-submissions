class Solution:
    def validWordSquare(self, words: List[str]) -> bool:
        r = len(words)
        c = len(words[0])

        for i in range(r):
            word1 = "".join(words[i][:])
            word2 = "".join([row[i] for row in words if i < len(row)])
            print(f"{word1} : {word2}")
            if(word1 != word2):
                return False
        return True
        