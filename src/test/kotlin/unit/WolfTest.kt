package unit

import Exceptions.IsWolfException
import Role.Wolf
import Role.Citizen
import User
import org.junit.Test
import org.junit.Assert.*

class WolfTest {
    private val wolf = User("wolf", Wolf())

    @Test
    fun wolfActionTest() {
        val target = User("target", Citizen())
        assertEquals(true, wolf.role.action(target))
        assert(target.isKillTarget)
        wolf.role.clear()
        try {
            val wolfTarget = User("friend", Wolf())
            wolf.role.action(wolfTarget)
        }
        catch (e: IsWolfException) {
            assert(true)
        }
    }
}