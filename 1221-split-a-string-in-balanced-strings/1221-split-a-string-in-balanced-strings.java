class Solution {
    public int balancedStringSplit(String s) {
        int cnt=0;
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='R') 
                cnt++;
            if(s.charAt(i)=='L')
                cnt--;
            if(cnt==0)
                max++; 
        }return max;
        
//         int cnt1=0,cnt2=0,cnt3=0;
//         for(int i=0;i<s.length();i++)
//         {
//             {
//                 if(s.charAt(i)=='R'){cnt1++;}
//                 else{cnt1--;}
//                 if(cnt1==0)
//                 {
                    
//                     cnt2++;
//                 }
//             }
//         }return cnt2;


    }
}