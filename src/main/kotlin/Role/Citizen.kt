package Role

import User
import Team

class Citizen : Role {
    override val isWolf: Boolean
        get() = false
    override val team: Team
        get() = Team.Citizen

    override fun action(user: User): String {
        return ""
    }

    override fun toString(): String {
        return "市民"
    }
}