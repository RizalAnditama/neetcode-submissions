from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram_map = defaultdict(list)

        for s in strs:
            fingerprint = [0] * (ord('z') - ord('a') + 1)

            for char in s:
                fingerprint[ord(char) - ord('a')] += 1
            anagram_map[tuple(fingerprint)].append(s)
        return list(anagram_map.values())
        

        