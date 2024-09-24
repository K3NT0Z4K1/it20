
package multidimensional;

public class MultiDimensional {

  
    public static void main(String[] args) {
        
        // 3.3 MultiDimensional Array
        
        
        int MultiNum[][] = {
            {1, 2 , 3 , 4, 5},
            {6, 7 ,8 , 9, 10},
            {11,12 ,13,14,15}
        };
        
        
           
        
        for (int i = 0 ; i < MultiNum.length; i++){
          
            for(int j = 0; j < MultiNum[i].length; j++){
                
                System.out.print(MultiNum[i][j] + " ");
                
            }
            System.out.println();
            
        }
        
    }
    
}
