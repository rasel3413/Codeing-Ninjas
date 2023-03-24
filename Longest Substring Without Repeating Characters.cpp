#include <bits/stdc++.h>
int lengthOfLongestSubstring(string &s) {

map<char,int>mp;
    int mx=0,c=0;
    int j=0;
    for(int i=0;i<s.size();i++)
    {
        mp[s[i]]++;
        c++;
        if(mp[s[i]]==2){
          while(mp[s[i]]==2)
          {
              mp[s[j]]--;
              c--;
              j++;
          }

        }
        mx=max(mx,c);

    }
    return mx;
    // Write your code here.
}
