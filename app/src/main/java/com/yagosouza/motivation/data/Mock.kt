package com.yagosouza.motivation.data

import com.yagosouza.motivation.MotivationConstants
import kotlin.random.Random

data class Phrase(val description: String, val categoryId: Int)

class Mock {

    private val all = MotivationConstants.FILTER.ALL
    private val happy = MotivationConstants.FILTER.HAPPY
    private val sunny = MotivationConstants.FILTER.SUNNY

    val mListPhrase = listOf<Phrase>(
        Phrase("Não sabendo que era impossivel, foi lá e fez.", happy),
        Phrase("A melhor maneira de prever o futuro é inventá-lo", sunny)
    )

    fun getPhrase(categoryId: Int): String {
        val filtered = mListPhrase.filter { it.categoryId == categoryId || categoryId == all }
        val index = Random.nextInt(filtered.size)
        return filtered[index].description
    }
}