package definitions
import kotlin.Comparable

abstract  class Sort<T> {
    abstract fun sort(array: Array<Comparable<T>>)

    fun isLesser(v: Comparable<T>, w: T): Boolean {
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

}