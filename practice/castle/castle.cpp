/*
ID: juwang1
TASK: castle
LANG: C++                 
*/

#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main() {
    freopen("castle.in", "r", stdin);
  	freopen("castle.out", "w", stdout);
  	ios_base::sync_with_stdio(false);
    int a, b;
    cin >> a; 
    cin >> b;
    int arr[b][a];
    for (int i =0; i<b;i++){
    	for(int j=0;j<a;j++){
    		cin>>arr[i][j];
    	}
    }



    cout << a+b << endl;
    return 0;
}