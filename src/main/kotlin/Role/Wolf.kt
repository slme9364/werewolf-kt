package Role

import Exceptions.ActionException
import Exceptions.IsWolfException
import User
import Team

class Wolf : Role {
    override val team: Team
        get() = Team.Wolf

    override val isWolf: Boolean
        get() = true

    override var doneAction: Boolean = false

    override public fun action(user: User): Boolean {
        return kill(user)
    }

    override fun clear() {
        doneAction = false
    }

    private fun kill(user: User): Boolean {
        if (user.role.isWolf) throw IsWolfException()
        if (doneAction) throw ActionException()
        user.isKillTarget = true
        doneAction = true
        return true
    }

    override fun toString(): String {
        return "人狼"
    }
}