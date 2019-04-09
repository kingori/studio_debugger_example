package kr.pe.kingori.debuggersample

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class DebuggerFeatureExerciseTest {
    @Test
    fun 내비게이션_실습() {
        val 삼 = 삼()
        val 오 = 5
        assertEquals(삼 + 오, 8)

    }

    fun 삼(): Int {
        var result = 1
        result += 2
        return result
    }

    @Test
    fun 스마트_스텝인투() {
        fun createCharList() = arrayListOf('1','0','0')
        fun listToCharArray(list: List<Char>) = list.toCharArray()
        fun charArrayToString(array:CharArray) = String(array)


        val a =  charArrayToString(listToCharArray(createCharList()))
        assertEquals(100, a)
    }

    @Test
    fun 객체조작() {
        val myData = MyData(5, 3)
        assertEquals(8, myData.a + myData.b)
    }

    @Test
    fun 마킹() {
        val 백개짜리_리스트 = (1..100).toMutableList()
        백개짜리_리스트.forEachIndexed { index, i -> 백개짜리_리스트[index] = i *2  }
        assertEquals( 30, 백개짜리_리스트[14])
        assertEquals(100, 백개짜리_리스트.size)
    }

    @Test
    fun 람다에_중단점() {
        val list = listOf(1, 2, 3).map { it * 2 }.filter { it >= 3 }
        assertEquals(2, list.size)
    }

    @Test
    fun 조건부_중단점() {
        for(  i in 1..100) {
            print(i)
        }
    }

    @Test
    fun 안멈춰_중단점() {
        for(  i in 1..100) {
            print(i)
        }
    }


    data class MyData(val a: Int, val b: Int)

}
