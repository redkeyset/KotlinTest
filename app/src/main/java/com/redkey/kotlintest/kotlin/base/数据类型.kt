package com.redkey.kotlintest.kotlin.base

fun main(args: Array<String>) {
//    空类型安全()
//    智能类型转换()
//    安全类型转换()
//    区间()
//    数组()
}

//------------------------------------------
fun 空类型安全(){
    println(getName()?.length)
}

fun getName(): String? {
    //String? 加上？才能return null
    return null
}
//------------------------------------------
fun 智能类型转换() {
    val p: Parent = Child()
    if (p is Child) {
        //如果Kotlin编译器判断到已经对类型进行了判断
        //那么可以直接调用了
        p.say()
    }
}

open class Parent {
    open fun say() {
        println("is Parent!")
    }

}

class Child : Parent() {
    override fun say(){
        println("is Child!")
    }
}

//------------------------------------------
/**
 * Parent cannot be cast to com.redkey.kotlintest.kotlin.base.Child
 * 类型转换不成功，在编译期
 */
fun 安全类型转换(){
    val p: Parent = Parent()
//不安全的类型转换，转换失败会报异常
    val c1: Child? = p as Child
//安全的类型转换，转换失败的时候，返回null
    val c2: Child? = p as? Child

    c1?.say()
    c2?.say()
}
//------------------------------------------
fun 区间() {
    //[0,100]
    val r1: IntRange = 0..100

    //[0,101)相当于[0,100]
    val r2: IntRange = 0 until 101

    //空区间
    val r3: IntRange = 0..-1

    //第一个
    println(r1.start)

    //最后一个
    println(r1.endInclusive)

    //是否包含
    println(r1.contains(50))

    //运算符重载的方式判断
    println(50 in r2)

    //空区间 isEmpty()
    println(r3.isEmpty())

    //迭代
    for (i in r1) {
        println("$i,")
    }

}

//------------------------------------------
fun 数组() {

    //基本数据类型的数组（注意是经过定制的，减去了装箱以及拆箱的开销）
    val arr: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    //没有经过定制的数组
    val arr1: Array<String> = arrayOf("一", "er", "叁", "四", "⑤")
    //对象数组
    val arrMan: Array<Man> = arrayOf(Man("李"), Man("张"), Man("吴"))

    //大小
    println(arr.size)

    //操作某一个元素
    println(arr[0])

    //连接成字符串，可以指定分隔符（默认是,）
    println(arr.joinToString(","))
    //截取，注意传入的是一个区间（注意，字符串也支持这种操作）
    arr.slice(1..2)

    //遍历
    println()
    arr.forEach { print(it) }

    println()
    arr1.forEach { print(it) }

    println()
    arrMan.forEach { print(it.name) }
}

data class Man(var name: String)
