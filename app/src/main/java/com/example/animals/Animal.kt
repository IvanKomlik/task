package com.example.animals

import com.example.animals.AnimalsCarnivorous
import com.example.animals.AnimalsHerbivorous

fun main (){
    var animalsCarnivorous1 = AnimalsCarnivorous("Волк",true,10)
    var animalsCarnivorous2 = AnimalsCarnivorous("Тигр",true,5)
    var animalsCarnivorous3 = AnimalsCarnivorous("Лев",true,7)
    var animalsCarnivorous4 = AnimalsCarnivorous("Ягуар",true,8)
    var animalsCarnivorous5 = AnimalsCarnivorous("Гепард",true,2)

    var animalsHerbivorous1 = AnimalsHerbivorous("Заяц",false, 2)
    var animalsHerbivorous2 = AnimalsHerbivorous("Олень",false, 12)
    var animalsHerbivorous3 = AnimalsHerbivorous("Кабан",false, 4)
    var animalsHerbivorous4 = AnimalsHerbivorous("Крот",false, 1)
    var animalsHerbivorous5 = AnimalsHerbivorous("Слон",false, 21)

    println("Наименование: "+animalsCarnivorous1.name+", Питается мясом: "+animalsCarnivorous1.meat+ ", Возраст: "+animalsCarnivorous1.age)
    println("Наименование: "+animalsCarnivorous2.name+", Питается мясом: "+animalsCarnivorous2.meat+ ", Возраст: "+animalsCarnivorous2.age)
    println("Наименование: "+animalsHerbivorous1.name+", Питается мясом: "+animalsHerbivorous1.meat+ ", Возраст: "+animalsHerbivorous1.age)
    println("Наименование: "+animalsHerbivorous2.name+", Питается мясом: "+animalsHerbivorous2.meat+ ", Возраст: "+animalsHerbivorous2.age)
// for (id 1....5)
//  animalsCarnivorous + id () ЧТОБЫ ПОЛУЧИТЬ animalsHerbivorous1, animalsHerbivorous2 И Т.Д.
//  ЕСТЬ ЛИ СИНТАСИС НАПИСАНИЯ ОБОЗНАЧЕНИЯ ПЕРЕМЕННОЙ  В ЦИКЛЕ СОЕДИНЕНИЕМ?
//
}
