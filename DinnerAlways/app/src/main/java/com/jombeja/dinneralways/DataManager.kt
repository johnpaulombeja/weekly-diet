package com.jombeja.dinneralways

object DataManager {
    val diets = HashMap<String, DietClass>()
    val menus = ArrayList<MenuClass>()

    init {
        initializeDiet()
        initializeMenu()
    }

    private fun initializeDiet() {
        var diet = DietClass("Sunday", "Habit and Chicken")
        diets.set(diet.Day, diet)

        diet = DietClass(Day = "Monday", Recipe = "Rice and Beans")
        diets.set(diet.Day, diet)

        diet = DietClass(Day = "Tuesday", Recipe = "Tortilla and Grams")
        diets.set(diet.Day, diet)

        diet = DietClass(Day = "Wednesday", Recipe = "Mixture")
        diets.set(diet.Day, diet)

        diet = DietClass(Day = "Thursday", Recipe = "Chips")
        diets.set(diet.Day, diet)

        diet = DietClass(Day = "Friday", Recipe = "Pilau")
        diets.set(diet.Day, diet)

        diet = DietClass(Day = "Saturday", Recipe = "Spagheti and Beef")
        diets.set(diet.Day, diet)
    }

    private fun initializeMenu() {
        var diet = diets["Sunday"]!!
        var menu = MenuClass(diet, R.drawable.ugkuk, "Hot Water",
            "Ugali has Carbs, fats and proteins, " +
                    "and Chicken is rich in proteins and a low fat content")
        menus.add(menu)

        diet = diets["Monday"]!!
        menu = MenuClass(diet, R.drawable.ricebeans, "Straw Berry Juice",
            "Beans are rich in fats and proteins, and Rice  is rich in carbs inform " +
                    "of starch which is easily digestible")
        menus.add(menu)

        diet = diets["Tuesday"]!!
        menu = MenuClass(diet, R.drawable.chapndeng, "Blended Apple Juice",
            "Tortilla is rich in  Carbs, fats and proteins, " +
                    "and grams are rich in proteins and a low fat content")
        menus.add(menu)

        diet = diets["Wednesday"]!!
        menu = MenuClass(diet, R.drawable.beanmaiz, "Coffee",
            "Maize is rich in carbs, fats and proteins, and Beans are rich in proteins and a low fat content")
        menus.add(menu)

        diet = diets["Thursday"]!!
        menu = MenuClass(diet, R.drawable.chips, "Soda",
            "Most people consider chips to be garbage food. " +
                    "That's not true because they are known to increase calories in the body")
        menus.add(menu)

        diet = diets["Friday"]!!
        menu = MenuClass(diet, R.drawable.chips, "Ginger Tea",
            "Pilau, is a mixture of rice and some spices. Rice is rich in quick " +
                    "digestable carbohydrates, the spices are rich in vitamins")
        menus.add(menu)

        diet = diets["Saturday"]!!
        menu = MenuClass(diet, R.drawable.spabeef, "Lemon Water",
            "Spagheti has Carbs, fats and Vitamins, " +
                    "and Beef is rich in proteins and a low fat content")
        menus.add(menu)

    }

}