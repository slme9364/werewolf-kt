import Role.Role

class User (username: String, userRole: Role){
    val name = username
    var role: Role = userRole
    var isProtected = false
    var isKillTarget = false
}