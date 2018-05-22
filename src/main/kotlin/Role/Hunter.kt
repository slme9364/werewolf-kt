package Role

import Exceptions.ActionException
import User
import Team

class Hunter : Role {
    override val team: Team
        get() = Team.Citizen

    override val isWolf: Boolean
        get() = false

    override var doneAction: Boolean = false

    override fun clear() {
        doneAction = false
    }

    override public fun action(user: User): Boolean {
        return protect(user)
    }

    private fun protect(user: User): Boolean {
        if (doneAction) throw ActionException()
        user.isProtected = true
        doneAction = true
        return true
    }

    override fun toString(): String {
        return "狩人"
    }
}