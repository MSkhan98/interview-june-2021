package exam;

public class CountCombinations {

  public int getNumberOfWays(final int total, final int k) {
 for(int i = 0; i < k; i++){  
            int j, last;  
       
            last = arr[arr.length-1];  
          
            for(j = arr.length-1; j > 0; j--){  
                //Shift element of array by one  
                arr[j] = arr[j-1];  
            }  
    
            arr[0] = last;  
        }  
      
        System.out.println();  
          
         
        System.out.println("Array after right rotation: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
    return 0;
  }

}
