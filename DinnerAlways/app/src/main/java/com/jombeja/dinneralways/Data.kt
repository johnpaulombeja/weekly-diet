package com.jombeja.dinneralways

data class DietClass (val Day: String, val Recipe: String) {
    override fun toString(): String {
        return Day
    }
}

data class MenuClass (var diet: DietClass, var Icon: Int, var Drink: String, var Nutrients: String )
