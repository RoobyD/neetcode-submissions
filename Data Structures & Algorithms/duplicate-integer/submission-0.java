//create an empty HashSet
//Create a loop that iterates through all of the ints in the array 
// check to see if its in the hashset
//if it is in hashset then true 
//if not false

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>(); //new hash set made named "hashSet"
        for(int i =0; i < nums.length; i++){ //increments i cant be greater then nums.length
            if(hashSet.contains(nums[i])){ 
                return true;
                }
                  else {
               hashSet.add(nums[i]); // add to hash set 
        }
            }   
          
        return false;
 
    }
}
