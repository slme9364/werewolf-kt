package unit

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
        assertEquals("targetを殺害対象とします", wolf.role.action(target))
        assert(target.isKillTarget)
        val wolfTarget = User("friend", Wolf())
        assertEquals("friendは狼です", wolf.role.action(wolfTarget))
        assertFalse(wolfTarget.isKillTarget)
    }
}