    public static void displayArray( int [] myArray){
        
        if (myArray.length == 0){
            System.out.println("[]");
        }else{
            System.out.print("[");
                for (int i=0; i<myArray.length-1; ++i){
                    System.out.print(myArray[i] + ", ");
                }    
                System.out.print(myArray[myArray.length - 1] + "]");
            System.out.println();
        }
    }