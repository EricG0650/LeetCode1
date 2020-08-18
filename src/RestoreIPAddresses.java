import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {
    List<String> res = new ArrayList<String>();
    public List<String> restoreIpAddresses(String s) {
        int len = s.length();
        for(int i = 1; i < 4 && i < len -2;i++){
            for(int k =i+ 1;k <i+4 &&k< len-1;k++ ){
                for(int j = 1+k; j<4+k && j <len;j++){
                    String s1 = s.substring(0,i),s2 = s.substring(i,k),s3=s.substring(k,j),s4=s.substring(j,len);
                    if(isV(s1) && isV(s2) && isV(s3) && isV(s4)){
                        res.add(s1+"."+s2+"."+s3+"."+s4);

                    }

                }
            }
        }
        return res;
    }
    public boolean isV(String s){
        if(s.length() >3 || s.length() == 0 ||(s.charAt(0)=='0' && s.length()>1 )|| Integer.parseInt(s) >255 ){
            return false;
        }
        return true;

    }

}
