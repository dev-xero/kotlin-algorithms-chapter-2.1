package algorithms

import definitions.Sort

class Insertion<T> : Sort<T>() {
    override fun <T : Comparable<T>> sort(array: Array<T>) {
        val size = array.size

        for (i in 1 until size) {
            var j = i
            while (j > 0 && isLesser(array[j], array[j - 1])) {
                exchange(array, j, j - 1)

                j -= 1
            }
        }
    }
}