import org.junit.Assert.assertEquals
import org.junit.Test

import com.sumilab.Case

class CaseTest {

    @Test
    fun testToPascal() {
        val pascalCase = "HelloWorld"

        assertEquals(Case.toPascal("hello_world"), pascalCase)
        assertEquals(Case.toPascal("helloWorld_"), pascalCase)
        assertEquals(Case.toPascal("_hello_world_"), pascalCase)
    }
}