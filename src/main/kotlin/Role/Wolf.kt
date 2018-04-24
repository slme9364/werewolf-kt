package Role

import User
import Team

class Wolf : Role {
    override val team: Team
        get() = Team.Wolf

    override public val isWolf: Boolean
        get() = true

    override public fun action(user: User): String {
        return kill(user)
    }

    private fun kill(user: User): String {
        if (user.role.isWolf) return user.name + "は狼です"
        user.isKillTarget = true
        return user.name + "を殺害対象とします"
    }

    override fun toString(): String {
        return "人狼"
    }
}