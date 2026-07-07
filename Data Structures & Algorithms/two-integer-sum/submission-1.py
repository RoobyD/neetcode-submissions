class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}
        for i, current in enumerate(nums):
            pair = target - current
            if pair in seen:
                return[seen[pair], i]
            seen[current] = i
        return []
        