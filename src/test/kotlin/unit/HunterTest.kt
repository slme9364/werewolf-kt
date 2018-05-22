package unit

import Role.Citizen
import Role.Hunter
import User
import org.junit.Test
import org.junit.Assert.*

class HunterTest {
    private val hunter = User("hunter", Hunter())

    @Test
    fun hunterActionTest() {
        val protectedUser = User("protectedUser", Citizen())
        assertEquals(true, hunter.role.action(protectedUser))
        assert(protectedUser.isProtected)
    }
}