package com.yaazhtech.railwayManagement.Demo;

public class RemoveDuplicate {
    public static void main(String[] args)
    {
        Integer values[] = {1,1,4,4,2,3,3,2,1,3};

        for(int i = 0;  i < values.length; i++){               //for entire array

            Integer currVal = values[i];                       // select current value
            int count = 1;                                     // and set count to 1

            if(currVal != null){                               // if value not seen

                for( int j = i + 1; j < values.length; j++){   // for rest of array
                    if(values[j] == currVal){                  // if same as current Value
                        values[j] = null;                      // mark as seen
                        count++;                               // and count it
                    }
                }
                System.out.print("Number : "  + currVal + "  Count : " + count + "\n");
                //print information
            }
            // if seen skip.
        }
    }
}
