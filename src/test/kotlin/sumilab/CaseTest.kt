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
        assertEquals(Case.toPascal("HelloWorld"), pascalCase)
        assertEquals(Case.toPascal("helloWorld"), pascalCase)
    }

    @Test
    fun testToCamel() {
        val camelCase = "helloWorld"

        assertEquals(Case.toCamel("hello_world"), camelCase)
        assertEquals(Case.toCamel("helloWorld_"), camelCase)
        assertEquals(Case.toCamel("_hello_world_"), camelCase)
        assertEquals(Case.toCamel("HelloWorld"), camelCase)
        assertEquals(Case.toCamel("helloWorld"), camelCase)
    }

    @Test
    fun testToSnake() {
        val snakeCase = "hello_world"

        assertEquals(Case.toSnake("hello_world"), snakeCase)
        assertEquals(Case.toSnake("helloWorld_"), snakeCase)
        assertEquals(Case.toSnake("_hello_world_"), snakeCase)
        assertEquals(Case.toSnake("HelloWorld"), snakeCase)
        assertEquals(Case.toSnake("helloWorld"), snakeCase)
    }
}