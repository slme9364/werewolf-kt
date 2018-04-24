package Game

import User

abstract class AbstractGame {
    val allMembers = arrayListOf<User>()
    val aliveMembers = arrayListOf<User>()
    private var config: Configuration? = null


    abstract fun run()

    fun initialize(config: Configuration) {
        this.config = config
        java.util.Collections.shuffle(config.nameList)
        java.util.Collections.shuffle(config.roleList)

        for (i in 0..config.nameList.size) {
            val newUser = User(config.nameList[i], config.roleList[i])
            allMembers.add(newUser)
            aliveMembers.add(newUser)
        }
    }
}