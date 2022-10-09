
// Шаг 1. Открыть среду разработки Android Studio

// Шаг 2. Создать новый проект

// Шаг 3. Создать классы для травоядных и плотоядных животных

// Шаг 4. Каждому присвоить некоторые уникальные поля

// Шаг 5. Поместить 2 травоядных и 2 плотоядных в список

// Шаг 6. Вывести список на экран


package com.example.mypraktika41

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.jar.Attributes.Name

// Cоздаем пустую коллекцию в которую можно поместить различные типы данных

var List = mutableListOf<Any>()



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Создаем два класса животных
        data class CarnivorousAnimal(var Name:String, val LongLife: Int)
        data class HerbivoreAnimal(var Name:String, val TypeEat: String)

// Создаем переменные из разных классов животных для дальнейшего внесения в список
       val Bear = CarnivorousAnimal("Медведь", 10)
        val Tiger = CarnivorousAnimal("Тигр", 20)
        val Horse = HerbivoreAnimal("Лошадь", "Трава")
        val Hamster = HerbivoreAnimal("Хомяк", "Зерно")
//Создаем переменные, которые объединяют в один список соответствующих животных
         val carni = listOf(Bear, Tiger)
        val herbi = listOf(Horse, Hamster)
//Добавляем в пустую коллекцию два списка из предыдущего действия
List.add(carni+herbi)

// Объявляем функцию вывода на экран эмулятора
        printOnScreen()
    }
        fun printOnScreen() {
   //Инициализируем переменную типа TextView
            val textView: TextView = findViewById(R.id.textView)
            // Присваиваем текстовое значение коллекции, на экран будут выведены все уникальные названия(id) объектов
            textView.text = List.toString()
        }


    }
