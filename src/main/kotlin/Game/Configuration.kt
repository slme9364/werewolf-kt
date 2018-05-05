package Game

import Role.Role

class Configuration (noon: Int, night: Int, roles: ArrayList<Role>, names: ArrayList<String>){
    var noonSecond = noon
    var nightSecond = night
    var roleList = roles
    var nameList = names
}