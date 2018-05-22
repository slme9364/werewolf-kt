package Role

import Team
import User

class Madman : Role{
    override val isWolf: Boolean
        get() = false
    override val team: Team
        get() = Team.Wolf

    override var doneAction: Boolean = false

    override fun clear() {
    }

    override fun action(user: User): Boolean {
        return false
    }

    override fun toString(): String {
        return "狂人"
    }
}