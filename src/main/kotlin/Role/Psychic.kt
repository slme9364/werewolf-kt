package Role

import Exceptions.ActionException
import Team
import User

class Psychic : Role {
    override val isWolf: Boolean
        get() = false
    override val team: Team
        get() = Team.Citizen

    override var doneAction: Boolean = false

    override fun action(user: User): Boolean {
        return wasWolf(user)
    }

    override fun clear() {
        doneAction = false
    }

    private fun wasWolf(user: User): Boolean {
        if (doneAction) throw ActionException()
        if (!user.role.isWolf) return false
        return true
    }

    override fun toString(): String {
        return "霊媒師"
    }
}
