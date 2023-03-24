import java.util.* ;
import java.io.*; 
public class Solution {
        
	public static int lengthOfLongestSubstring(String s) {


		int n=s.length();
		Map<Character,Integer>mp=new HashMap<>();
     int mx=0,c=0;
	 int j=0;
		for(int i=0;i<n;i++)
		{

			int val=0;
			c++;
			char ch=s.charAt(i);
			if(mp.containsKey(ch))
			{
				val=mp.get(ch);
			}
			mp.put(s.charAt(i),val+1);
			if(val+1==2)
			{
				val=2;
				while(val+1>2)
				{
					ch=s.charAt(j);
					int d=mp.get(ch);
					mp.put(ch,d-1);
					ch=s.charAt(i);
					val=mp.get(ch);
					j++;
					c--;
				}
			}
			mx=Math.max(mx,c);
		}
		return mx;
		// Write your code here.
	}
}