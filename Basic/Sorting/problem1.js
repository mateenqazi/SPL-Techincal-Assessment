const swap = (items, leftIndex, rightIndex) => {
    var temp = items[leftIndex];
    items[leftIndex] = items[rightIndex];
    items[rightIndex] = temp;
}
const partition = (items, left, right) => {
    let pivot = items[Math.floor((right + left) / 2)] //middle element
    let i = left //left pointer
    let j = right; //right pointer
    while (i <= j) {
        while (items[i] < pivot)
            i++;
        while (items[j] > pivot)
            j--;
        if (i <= j) {
            swap(items, i, j); //sawpping two elements
            i++;
            j--;
        }
    }
    return i;
}

const quickSort = (items, left, right) => {
    var index;
    if (items.length > 1) {
        index = partition(items, left, right); //index returned from partition
        if (left < index - 1)  //more elements on the left side of the pivot
            quickSort(items, left, index - 1);
        if (index < right)  //more elements on the right side of the pivot
            quickSort(items, index, right);
    }
    return items;
}
var items = [5, 3, 7, 6, 2, 9, -1];
// first call to quick sort
console.log(quickSort(items, 0, items.length - 1)); //prints [2,3,5,6,7,9]