fun main()  {
    var nums= indences(listOf("bety","prudance","nazill","Enoth","kety","james","passy","tut","Ameria","sarah"))
    println(nums)

    var q= height(listOf(12,5,9,10,50,3))
    println(q)

    var p = person("Dallen",45,70.5,43)
    var f=person("sissy",19,60.9,40)
    sorts(listOf(p,f))

    var l=car("A84K",5.3)
    var b=car("HKM7W",8.0)
    var x=car("FD6FX",6.2)
    println(  all(listOf(l,b,x)))
}
fun indences(names:List<String>):List<String>{
    var newlist= mutableListOf<String>()
    names.forEachIndexed { index, i ->
        if (index % 2== 0)
            newlist.add(i)


    }
    return newlist
}
fun height(heigh:List<Int>):String{
    var hc= heigh.average()
    var c=heigh.sum()
    var g="average is$hc Metres and the sum is $c Metres"
    return g

}
data class person(var name:String, var age:Int, var height:Double,var weight:Int)
fun sorts(people:List<person>){
    var sortedlst=people.sortedByDescending{m-> m.age }
    println(sortedlst)
}


data class car(var registration:String,var milage:Double )
fun all(cars:List<car>):Double{
    var adds=0.0
    var num=cars.count()

    var p=  cars.forEach { cr->
        adds+=cr.milage
    }
    return adds/num
     }