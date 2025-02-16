class Solution {
    public void reverseArray(int arr[]) {
        int start = 0;
        int end = arr.length-1;
        int temp,i=0;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        }
    
}