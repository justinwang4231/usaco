/*
ID: juwang1
TASK: barn1
LANG: C++                 
*/

#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main() {
    freopen("barn1.in", "r", stdin);
  	freopen("barn1.out", "w", stdout);
  	ios_base::sync_with_stdio(false);
    int a, b;
    cin >> a >> b;
    cout << a+b << endl;
    return 0;
}