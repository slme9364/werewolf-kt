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
        assertEquals("wolfは黒です", fortuneTeller.role.action(wolf))
        val citizen = User("citizen", Citizen())
        assertEquals("citizenは白です", fortuneTeller.role.action(citizen))
    }
}