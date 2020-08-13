import org.junit.After
import org.junit.Assert
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class GreetingKataTest {
    private lateinit var greetingKata: GreetingKata
    @Before
    fun setUp() {
        greetingKata = GreetingKata()
    }

    @After
    fun tearDown() {
    }

    @Test
    fun `greet name is null should be return null`() {
        assertEquals(greetingKata.greet(null),"Hello, my friend.")
    }

    @Test
    fun `greet name bob is Hello Bob`() {
        assertEquals(greetingKata.greet("Bob"),"Hello Bob.")
    }

    @Test
    fun `greet name isUppercase should return all uppercase`() {
        assertEquals(greetingKata.greet("JERRY"),"HELLO JERRY.")
    }

    @Test
    fun `greet names is array of 2 string`() {
        assertEquals(greetingKata.greet(arrayOf("Jill", "Jane")),"Hello, Jill and Jane.")
    }

    @Test
    fun `greet names is more than 3`() {
        assertEquals(greetingKata.greet(arrayOf("Amy", "Brian", "Charlotte")),"Hello, Amy, Brian, and Charlotte.")
    }
}