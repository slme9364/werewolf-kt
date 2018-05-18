package Role

import Exceptions.ActionException
import Team
import User

class FortuneTeller : Role {
    override val isWolf: Boolean
        get() = false
    override val team: Team
        get() = Team.Citizen

    override var doneAction: Boolean = false

    override fun action(user: User): Boolean {
        return fortuneTell(user)
    }

    override fun clear() {
        doneAction = false
    }

    private fun fortuneTell(user: User): Boolean {
        if (doneAction) throw ActionException()
        if (!user.role.isWolf) return false
        doneAction = true
        return true
    }

    override fun toString(): String {
        return "占い師"
    }
}