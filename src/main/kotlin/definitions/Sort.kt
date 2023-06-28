package definitions
import kotlin.Comparable

abstract  class Sort<T> {
    abstract fun <T: Comparable<T>> sort(array: Array<T>)

    fun <T: Comparable<T>> isLesser(v: T, w: T): Boolean {
        return v < w
    }

    fun <T: Comparable<T>> exchange(array: Array<T>, i: Int, j: Int) {
        val temp = array[i]

        array[i] = array[j]
        array[j] = temp
    }

    fun show(array: Array<T>) {
        for (item: T in array) {
            print("$item ")
        }
        println()
    }

    fun <T: Comparable<T>> isSorted(array: Array<T>): Boolean {
        for (i in 1 until array.size) {
            if (isLesser(array[i], array[i-1])) {
                return false
            }
        }

        return true
    }

}