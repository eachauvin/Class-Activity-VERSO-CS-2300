#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

vector<int> remove_duplicates(vector<int> arr, vector<int>& removed_elements){
    vector<int> unique_arr;    //make new array
    sort(arr.begin(), arr.end());    //sort original array
    int n = arr.size();
    for(int i=0; i<n; i++){        //iterate through array size
        if(i == 0 || arr[i] != arr[i-1]){        //if first element or next element doesn't equal previous element, add it. This works because list is sorted
            unique_arr.push_back(arr[i]);
        }
        else{
            removed_elements.push_back(arr[i]);        //modify removed array (passed my reference)
        }
    }
    return unique_arr;        //return new array
}

int main(){
    // Test the function
    vector<int> arr = {1, 2, 2, 3, 4, 4, 5};
    vector<int> removed_elements;
    vector<int> unique_arr = remove_duplicates(arr, removed_elements);
    cout << "Original array: ";
    for(int i=0; i<arr.size(); i++){        //print array elements
        cout << arr[i] << " ";
    }
    cout << endl;
    cout << "Unique array: ";
    for(int i=0; i<unique_arr.size(); i++){        //print new array
        cout << unique_arr[i] << " ";
    }
    cout << endl;
    cout << "Removed elements: ";
    for(int i=0; i<removed_elements.size(); i++){        //print removed elements
        cout << removed_elements[i] << " ";
    }
    cout << endl;
    return 0;
}
