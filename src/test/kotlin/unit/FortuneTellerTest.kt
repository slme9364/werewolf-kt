package unit

import User
import Role.FortuneTeller
import Role.Wolf
import Role.Citizen
import org.junit.Test
import org.junit.Assert.*

class FortuneTellerTest {
    private val fortuneTeller = User("fortuneTeller", FortuneTeller())

    @Test
    fun fortuneTellerActionTest() {
        val wolf = User("wolf", Wolf())
        assertEquals(true, fortuneTeller.role.action(wolf))
        fortuneTeller.role.clear()
        val citizen = User("citizen", Citizen())
        assertEquals(false, fortuneTeller.role.action(citizen))
    }
}