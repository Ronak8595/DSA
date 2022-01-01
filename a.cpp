#include <bits/stdc++.h>
using namespace std;

#define MOD 1000000007
#define f first
#define s second
#define fo(i, a, b) for (int i = a; i < b; i++)
#define bfo(i, a, b) for (int i = a; i >= b; i--)
typedef unsigned int ui;
typedef long long ll;
typedef unsigned long long ull;
typedef long double ld;

int helper(vector<int>& arr, int n)
{
    int ans = 0;
	for (int i = 0; i < n; i++)
	{
		int left_sum = 0;
		for (int j = 0; j < i; j++) {
			left_sum += arr[j];
		}

		int right_sum = 0;
		for (int j = i; j < n; j++) {
			right_sum += arr[j];
		}

		if (left_sum == right_sum) {
			ans++;
		}
	}

	return ans;
}

void solve()
{
    int n;
    cin >> n;
    
    vector<int> arr(n, 0);
    for(int i = 0; i < n; i++)
        cin >> arr[i];

    int ans = 0;
    for(int i = 0; i < n; i++) {
        int a = arr[i];
        arr[i] = 0;
        ans += helper(arr, n);
        arr[i] = a;
    }

    cout << ans << endl;
}

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(0);

    int t = 1;
    cin >> t;
    while (t--)
    {
        solve();
    }
    return 0;
}
