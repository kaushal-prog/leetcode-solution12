class Solution {
    public String addBinary(String a, String b) {
        //Dono strings ke last index par pointer."""
        int i = a.length()- 1;
        int j = b.length() -1;
       // """initially carry 0"""
        int carry =0;
       // """ result store karne keleye """
        StringBuilder result = new StringBuilder();
        while(i>=0 || j>=0 || carry !=0)
        {
            int sum = carry;
            if(i>=0)
            {
                sum +=a.charAt(i) -'0' ;
                i--;
            }
            if(j>=0)
            {
                sum += b.charAt(j) -'0';
                j--;
            }
            result.append(sum % 2);
            carry = sum /2 ;
        }
        return result.reverse().toString();

        
    }
}