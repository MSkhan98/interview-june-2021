package exam;

public class ShiftElementsInArray {

  public void shift(int[] arr) 
  {
    int n=3;
 for(int i = 0; i < n; i++)
  {  
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

 
