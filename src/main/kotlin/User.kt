import Role.Role

class User (username: String){
    val name = username
    var role: Role? = null
    var isProtected = false
    var isKillTarget = false
}