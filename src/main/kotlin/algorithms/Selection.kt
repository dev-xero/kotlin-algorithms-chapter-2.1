package algorithms

import definitions.Sort

class Selection<T> : Sort<T>() {
    override fun <T: Comparable<T>> sort(array: Array<T>) {
        val size = array.size

        for (i in 0 until size) {
            var min = i
            for (j in i + 1 until size) {
                if (isLesser(array[j], array[min])) {
                    min = j
                }
            }
            exchange(array, i, min)
        }
    }
}