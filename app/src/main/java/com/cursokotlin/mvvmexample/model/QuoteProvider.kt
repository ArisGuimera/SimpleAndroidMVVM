package com.cursokotlin.mvvmexample.model

class QuoteProvider {
    companion object {

        fun random(): QuoteModel {
            val position = (0..10).random()
            return quotes[position]
        }

        private val quotes = listOf(
            QuoteModel(
                quote = "It’s not a bug. It’s an undocumented feature!",
                author = "Anonymous"
            ),
            QuoteModel(
                quote = "“Software Developer” – An organism that turns caffeine into software",
                author = "Anonymous"
            ),
            QuoteModel(
                quote = "If debugging is the process of removing software bugs, then programming must be the process of putting them in",
                author = "Edsger Dijkstra"
            ),
            QuoteModel(
                quote = "A user interface is like a joke. If you have to explain it, it’s not that good.",
                author = "Anonymous"
            ),
            QuoteModel(
                quote = "I don’t care if it works on your machine! We are not shipping your machine!",
                author = "Vidiu Platon"
            ),
            QuoteModel(
                quote = "Measuring programming progress by lines of code is like measuring aircraft building progress by weight.",
                author = "Bill Gates"
            ),
            QuoteModel(
                quote = "My code DOESN’T work, I have no idea why. My code WORKS, I have no idea why.",
                author = "Anonymous"
            ),
            QuoteModel(quote = "Things aren’t always #000000 and #FFFFFF", author = "Anonymous"),
            QuoteModel(quote = "Talk is cheap. Show me the code.", author = "Linus Torvalds"),
            QuoteModel(
                quote = "Software and cathedrals are much the same — first we build them, then we pray.",
                author = "Anonymous"
            ),
            QuoteModel(quote = "¿A que esperas?, suscríbete.", author = "AristiDevs")
        )
    }
}