
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

	int vowels=0,consonents =0;

	for(int i=0; i<str.size(); i++)
	{
	    if(str[i] == ' ') continue;
	    
		char alpha = tolower(str[i]);
		
		if(alpha=='a' || alpha=='e' ||alpha=='i'  || alpha=='o' ||alpha=='u')
		{
			vowels++;
		}
		else
		{
			consonents++;
		}
	}

	cout<<"No. of vowels : "<<vowels<<"\n"<<"No. of Consonents : "<<consonents;

	return 0;
}