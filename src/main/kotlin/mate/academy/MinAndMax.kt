package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    var min = inputArray[0];
    var max = inputArray[0];

    for (i in 1 until inputArray.size) {
        if (min > inputArray[i]) {
            min = inputArray[i]
        }
        if (max < inputArray[i]) {
            max = inputArray[i]
        }
    }

    return intArrayOf(min, max)
}
