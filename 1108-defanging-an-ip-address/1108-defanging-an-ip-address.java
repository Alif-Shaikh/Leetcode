class Solution {
    public String defangIPaddr(String address) {

// String str1="";
// str1=address.replaceAll("[.]","[.]");
// return str1;


        
    String s="";
    s= address.replace(".","[.]");
    return s;
    }
}