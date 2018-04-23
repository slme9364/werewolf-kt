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
        user.isKillTarget = true
        return user.name + "を殺害対象とします"
    }
}