def remove_duplicates(arr):
    arr.sort()
    unique_arr = [] # Unique
    removed_elements = [] # The duplicate elements
    for i in range(len(arr)):
        if i == 0 or arr[i] != arr[i-1]:
            unique_arr.append(arr[i]) # Append unique elements
        else:
            removed_elements.append(arr[i]) # Append duplicate elements to removed list
    return unique_arr, removed_elements

# Test the function
arr = [1, 2, 2, 3, 4, 4, 5]
unique_arr, removed_elements = remove_duplicates(arr)
print("Original array:", arr) # The original array with duplicates
print("Unique array:", unique_arr) # The distinct elements array
print("Removed elements:", removed_elements) # The removed elements array
