class Terminal {

        fun addCredits(card: Card, amount: Int) {
            card.credits += amount
            println("$amount credits added to Card #${card.id}. Total credits: ${card.credits}")
        }

        fun transferCredits(cardFrom: Card, cardTo: Card) {
            val credits = cardFrom.credits
            cardFrom.credits = 0
            cardTo.credits += credits
            println("$credits credits transferred from Card #${cardFrom.id} to Card #${cardTo.id}")
        }

        fun transferTickets(cardFrom: Card, cardTo: Card) {
            val tickets = cardFrom.tickets
            cardFrom.tickets = 0
            cardTo.tickets += tickets
            println("$tickets tickets transferred from Card #${cardFrom.id} to Card #${cardTo.id}")
        }

        fun requestPrize(prize: String, card: Card) {
            if (card.tickets >= 10) {
                card.tickets -= 10
                println("Prize ($prize) claimed with Card #${card.id}. Total tickets: ${card.tickets}")
            } else {
                println("Not enough tickets on Card #${card.id} to claim prize ($prize). Need 10 tickets, but only has ${card.tickets}")
            }
        }
    }

