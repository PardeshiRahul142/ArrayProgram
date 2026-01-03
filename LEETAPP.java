class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs==null || strs.length==0)
        {
            return "";
        }
        String prefix=strs[0];
        for(int i=0;i<strs.length;i++)
        {   System.out.print("\t"+prefix);
            while(strs[i].indexOf(prefix) !=0)
            {
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty())
                {
                    return "";
                }
            }
        }
        return prefix;
    }
}
public class LEETAPP
{  public static void main(String args[])
   {  String ar[]={"Flower","Flow","Flight"};
      Solution so=new Solution();
              System.out.println(so.longestCommonPrefix(ar));
   }
}