package Role

import  User
import  Team

interface Role {
    val isWolf: Boolean
    val team: Team
    var doneAction: Boolean
    fun action(user: User): Boolean
    fun clear()
}