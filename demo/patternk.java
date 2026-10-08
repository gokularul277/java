public class patternk {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n*2-1; i++) {
            if(i>5){
                for (int j = 1; j <=n*2-1; j++) {
                if(j>=-n+1+i && j<=n*3+1-i-2){ 
                    if(i%2==0 && j%2==0){
                        System.out.print(" * ");

                    }
                    else if(i%2==1 && j%2==1){
                        System.out.print(" * ");

                    }
                    
                    else{
                        System.out.print("   ");
                    }
                    
                    
                    
                    
                }
                else{
                    System.out.print("   ");
                }

                
                
                
            }

                

            }else{

            for (int j = 1; j <=n*2-1; j++) {
                if(j>=n*2-n+1-i && j<=n-1+i){
                    if(i%2==0 && j%2==0){
                        System.out.print(" * ");

                    }
                    else if(i%2==1 && j%2==1){
                        System.out.print(" * ");

                    }
                    
                    else{
                        System.out.print("   ");
                    }
                    
                    
                    
                    
                }
                else{
                    System.out.print("   ");
                }

                
                
                
            }
        }


            System.out.println();
            
        }
    }
}
