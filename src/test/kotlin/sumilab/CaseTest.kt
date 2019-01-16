import org.junit.Assert.assertEquals
import org.junit.Test

import com.sumilab.Case

class CaseTest {

    @Test
    fun testCase() {
        assertEquals(Case.test(), "Hello!")
    }
}