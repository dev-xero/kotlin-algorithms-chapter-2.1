package testalgorithms

import algorithms.Selection
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class TestSelection {
    private lateinit var selection: Selection<Char>

    @BeforeEach
    fun setup() {
        selection = Selection()
    }

    @Test
    fun testSelectionSortsCorrectly() {
        val testChars = arrayOf('S', 'O', 'R', 'T', 'E', 'X', 'A', 'M', 'P', 'L', 'E')
        selection.sort(testChars)

        assertTrue(selection.isSorted(testChars))
        selection.show(testChars)
    }
}