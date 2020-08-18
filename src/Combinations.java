import java.util.ArrayList;
import java.util.List;
public class Combinations {
    /*
    1 <= n <= 20
1 <= k <= n
     */
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    public  List<List<Integer>> combine(int n, int k) {

        helper(k,n,1,new ArrayList<>());

        return res;
    }

    public  void helper(int n,int k ,int start,ArrayList temp){
        if(n == 0) {

            /*
            不能加 res.add(temp)
            temp会变的
             */
            res.add(new ArrayList<Integer>(temp));
            return;
        }else{
            for(int i = start; i <= k; i++){
                temp.add(i);
                helper(n-1,k,i+1,temp);
                temp.remove(temp.size()-1);
            }
        }


    }
}
