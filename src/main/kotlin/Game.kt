
class Game(private val cost: Int) {
    fun play(card: Card) {
        if (card.credits >= cost) {
            card.credits -= cost
            card.tickets++
            println("Card #${card.id} played game and has ${card.credits} credits and ${card.tickets} tickets.")
        } else {
            println("Not enough credits on Card #${card.id}. Game costs $cost credits, but card only has ${card.credits} credits.")
        }
    }
}