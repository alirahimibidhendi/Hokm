package com.example.hokm.model

enum class Suit { HEARTS, DIAMONDS, CLUBS, SPADES }
data class Card(val suit: Suit, val rank: Int) { val shortRank:String get() = when(rank){14->"A";13->"K";12->"Q";11->"J";else->rank.toString()} }
