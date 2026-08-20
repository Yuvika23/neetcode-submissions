class Solution {
    public boolean checkInclusion(String s1, String s2){
        int[] a=new int[26];
        for(int i=0; i<s1.length(); i++){
            char ch=s1.charAt(i);
            a[ch-'a']++;
        }
        for(int i=0; i<=s2.length()-s1.length(); i++){
            int[] b=new int[26];
            for (int j = i; j < i + s1.length(); j++) {
                b[s2.charAt(j) - 'a']++;
            }
            if(Arrays.equals(a,b)){
                return true;
            }
        }
        return false;
    }
}
