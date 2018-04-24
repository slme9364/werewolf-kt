package Role

import User
import Team

class Hunter : Role {
    override val team: Team
        get() = Team.Citizen

    override public val isWolf: Boolean
        get() = false

    override public fun action(user: User): String {
        return protect(user)
    }

    private fun protect(user: User): String {
        user.isProtected = true
        return user.name + "を護衛します"
    }

    override fun toString(): String {
        return "狩人"
    }
}