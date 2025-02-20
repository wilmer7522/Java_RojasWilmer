/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertposition;

/**
 *
 * @author wilmer
 */
public class InsertPosition {

   public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(target == nums[i]){
                return i;
            }
            if (nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }
}
