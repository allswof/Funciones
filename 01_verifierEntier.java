public static boolean verifieEntier(String entree) { 
       
       int myNumber;
        try {
            myNumber = Integer.parseInt(entree);
        }catch(Exception e){
            return false;
        }
        
        if (myNumber >=1 && myNumber<=10){
            return true;
        }else{
            return false;
        }
   }