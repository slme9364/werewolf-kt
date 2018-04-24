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
        assertEquals("wolfは黒です", psychic.role.action(wolf))
        val citizen = User("citizen", Citizen())
        assertEquals("citizenは白です", psychic.role.action(citizen))
    }
}