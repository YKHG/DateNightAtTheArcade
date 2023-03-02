// Class representing a card that holds credits and tickets
class Card {
    var id: Int = 0
    var credits: Int = 0
    var tickets: Int = 0
    // Initialization block that assigns unique ID to each card
    init {
        id = nextId++
    }
    // Companion object to hold a class-level variable for generating unique IDs for each card
    companion object {
        var nextId = 1
    }

        fun addCredits(amount: Int) {
            credits += amount
        }

        fun subtractCredits(amount: Int) {
            credits -= amount
        }

        fun addTickets(amount: Int) {
            tickets += amount
        }

        fun subtractTickets(amount: Int) {
            tickets -= amount
        }



        @JvmName("getTickets1")
        fun getTickets(): Int {
            return tickets
        }
    }
