package unit

import Role.Citizen
import Role.Psychic
import Role.Wolf
import User
import org.junit.Test
import org.junit.Assert.*

class PsychicTest {
    private val psychic = User("psychic", Psychic())

    @Test
    fun psychicActionTest() {
        val wolf = User("wolf", Wolf())
        assertEquals(true, psychic.role.action(wolf))
        psychic.role.clear()
        val citizen = User("citizen", Citizen())
        assertEquals(false, psychic.role.action(citizen))
    }
}