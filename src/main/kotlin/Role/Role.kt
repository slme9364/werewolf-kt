package Role

import  User
import  Team

interface Role {
    val isWolf: Boolean
    val team: Team
    fun action(user: User): String
}