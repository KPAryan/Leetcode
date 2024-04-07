class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        r=set()
        for i in nums:
            if i in r:
                return True
            r.add(i)
        return False;
