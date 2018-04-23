package Role

import Team
import User

class Madman : Role{
    override val isWolf: Boolean
        get() = false
    override val team: Team
        get() = Team.Wolf

    override fun action(user: User): String {
        return ""
    }
}