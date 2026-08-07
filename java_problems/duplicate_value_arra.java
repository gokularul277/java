public class duplicate_value_arra {
    public static void main(String[] args) {
        String []v={"java","C++","C","C","java"};

        for (int i = 0; i < v.length; i++) {
            for (int j = i+1; j <v.length ; j++) {
                if(v[i]==v[j]){
                    System.out.println(v[j]);
                }
                
            }
            
        }


    }
    
}
