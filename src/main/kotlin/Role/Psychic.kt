package Role

import Team
import User

class Psychic : Role {
    override val isWolf: Boolean
        get() = false
    override val team: Team
        get() = Team.Citizen

    override fun action(user: User):String {
        return wasWolf(user)
    }

    private fun wasWolf(user: User): String {
        var judge = "白"
        if (user.role!!.isWolf) {
            judge = "黒"
        }
        return user.name + "は" + judge + "です"
    }
}
