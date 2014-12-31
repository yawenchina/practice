public class Solution {
  public int closest(int[] array, int target) {
    // Write your solution here
    if(array == null || array.length == 0){
      return -1;
    }
    int first = 0;
    int last = array.length-1;
    if(array[first] > target){
      return first;
    }
    if(array[last] < target){
      return last;
    }
    while(first < last-1){
      int mid = (first+last)/2;
      if(array[mid] == target){
        return mid;
      }else if(array[mid] > target){
        last = mid;
      }else{
        first = mid;
      }
    }
    if(Math.abs(array[first] - target) < Math.abs(array[last]- target)){
      return first;
    }
    return last;
 
  }
}