
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
    string word;
    vector<string> words;
    
    stringstream ss(str);
    while(ss>>word)
    {
        words.push_back(word);
    }
    
    for(int i=words.size()-1;i>=0;i--)
    {
        reverse(words[i].begin(),words[i].end());
        cout<<words[i]<<" ";
    }
    return 0;
}