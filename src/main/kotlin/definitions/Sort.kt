package definitions
import kotlin.Comparable

abstract  class Sort<T> {
    abstract fun sort(array: Array<Comparable<T>>)

    fun <T: Comparable<T>> isLesser(v: T, w: T): Boolean {
        return v < w
    }

    fun exchange(array: Array<Comparable<T>>, i: Int, j: Int) {
        val temp = array[i]

        array[i] = array[j]
        array[j] = temp
    }

    fun show(array: Array<Comparable<T>>) {
        for (item: Comparable<T> in array) {
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