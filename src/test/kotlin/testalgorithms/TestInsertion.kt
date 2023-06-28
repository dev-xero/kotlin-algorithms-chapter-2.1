package testalgorithms

import algorithms.Insertion
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class TestInsertion {
    private lateinit var insertion: Insertion<Char>

    @BeforeEach
    fun setup() {
        insertion = Insertion()
    }

    @Test
    fun testInsertionSortsCorrectly() {
        val testChars = arrayOf('S', 'O', 'R', 'T', 'E', 'X', 'A', 'M', 'P', 'L', 'E')
        insertion.sort(testChars)

        assertTrue(insertion.isSorted(testChars))
    }
}