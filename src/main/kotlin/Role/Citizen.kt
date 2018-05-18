package Role

import User
import Team

class Citizen : Role {
    override val isWolf: Boolean
        get() = false
    override val team: Team
        get() = Team.Citizen

    override var doneAction: Boolean = false

    override fun clear() {
        doneAction = false
    }

    override fun action(user: User): Boolean {
        return false
    }

    override fun toString(): String {
        return "市民"
    }
}