import Game.AbstractGame
import Game.Configuration
import Role.*
import org.junit.Test
import org.junit.Assert.*

private class  Game : AbstractGame() {
    override fun run() { }
}
class GameTest {
    private val game = Game()

    @Test
    fun gameTest() {
        val roles = arrayListOf<Role>().apply {
            add(Citizen())
            add(Wolf())
            add(Hunter())
            add(FortuneTeller())
        }

        val members = arrayListOf<String>().apply {
            add("hoge")
            add("foo")
            add("bar")
            add("huga")
        }
        game.initialize(Configuration(0, 0, roles, members))

        var citizen_id = -1
        var wolf_id = -1
        var hunter_id = -1
        var fortune_id = -1

        game.aliveMembers.mapIndexed {
            index , it ->
            when(it.role) {
                is Citizen -> citizen_id = index
                is Wolf -> wolf_id = index
                is Hunter -> hunter_id = index
                is FortuneTeller -> fortune_id = index
                else -> {}
            }
        }

        game.aliveMembers[wolf_id].role.action(game.aliveMembers[citizen_id])
        game.aliveMembers[hunter_id].role.action(game.aliveMembers[citizen_id])
        val fortune_result = game.aliveMembers[fortune_id].role.action(game.aliveMembers[wolf_id])

        assert(game.aliveMembers[citizen_id].isKillTarget)
        assert(game.aliveMembers[citizen_id].isProtected)
        assertEquals(fortune_result, game.aliveMembers[wolf_id].name + "は黒です")
    }
}