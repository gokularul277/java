import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class twosum22 {
    public static void main(String[] args) {
        Integer []nums={2,7,11,15};
        List<Integer> list = new ArrayList<>(Arrays.asList(nums));
        int target=9;
        int a[]=tosum(list, target);
        
    }


    static int []tosum(List<Integer> nums,int target){
        for (int i = 0; i < nums.size(); i++) {
            int ov=target-nums.get(i);
            if(nums.contains(ov)){
                return new int[]{nums.get(i),nums.indexOf(ov)};
            }


            
        }
        return new int[]{-1,-1};

    }
}

