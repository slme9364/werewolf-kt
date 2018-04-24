package Role

import Team
import User

class FortuneTeller : Role {
    override val isWolf: Boolean
        get() = false
    override val team: Team
        get() = Team.Citizen

    override fun action(user: User): String {
        return fortuneTell(user)
    }

    private fun fortuneTell(user: User): String {
        var judge = "白"
        if (user.role!!.isWolf) {
            judge = "黒"
        }
        return user.name + "は" + judge + "です"
    }

    override fun toString(): String {
        return "占い師"
    }
}