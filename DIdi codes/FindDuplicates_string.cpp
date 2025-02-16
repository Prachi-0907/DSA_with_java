
#include <iostream>
#include<algorithm>
#include<bits/stdc++.h>
#include<sstream>

using namespace std;

int main()
{
    string str;
    cout<<"Enter String :";
    getline(cin,str);
    
    unordered_map<char,int> m;
    
    for(int i=0;i<str.size();i++)
    {
        m[str[i]]++;
    }
    
    for(auto i:m)
    {
        if(i.second > 1)
        {
            cout<<i.first<<" ";
        }
    }
    
    return 0;
}