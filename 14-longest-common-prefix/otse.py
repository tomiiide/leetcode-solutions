class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        """
        - Define a dict
        - Iterate through each word in the list
        - For each word store the combination of letters starting from the first and increase the count for each combination in the dict
        - Find the prefix with the longest count
        """
        prefixBag = {}

        for word in strs:
            for i in range(1, len(word) + 1):
                if word[:i] in prefixBag:
                    prefixBag[word[:i]] += 1
                else:
                    prefixBag[word[:i]] = 1

        longestPrefix = ""
        longestCount = 0

        for key, value in prefixBag.items():
            if value >= longestCount:
                longestCount = value
                longestPrefix = key

        if longestCount < len(strs):
            longestPrefix = ""

        return longestPrefix
