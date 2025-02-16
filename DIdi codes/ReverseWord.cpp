
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
    
    stringstream ss(str); string word,result;
    while(ss>>word)
    {
        reverse(word.begin(),word.end());
        result += word + " ";
    }
    
    cout<<result;

    return 0;
}