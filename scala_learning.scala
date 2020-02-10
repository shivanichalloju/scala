// Databricks notebook source
// val,var
val variable1: String = "hello world"

// COMMAND ----------

var variable1_var : String = "hello world"
variable1_var


// COMMAND ----------

var value1 = "hello"

// COMMAND ----------

val variable1 = "hey"
val variable1 = "hey" + "world"

// COMMAND ----------

var value2 = "hey"
value2 = "hey" + "world"

// COMMAND ----------

val var_byte : Byte = 126
val val_int : Int = 2

// COMMAND ----------

print (f"hello, $val_int")

// COMMAND ----------

//switch stmnt
var n: Int = 3
n match{
  case 1 => print("1")
  case 2 => print("2")
  case 3 => print("3")
  case _ => print("not found")
}

// COMMAND ----------

var a=2
if(a==2){
  print("found")
}
else{
  print("not found")
}

// COMMAND ----------

for (i <- 1 to 4){
  println(i)
}

// COMMAND ----------

var wh = 4
while(wh >= 0){
  println(f"wh,$wh")
  wh=wh-1
}

// COMMAND ----------

//function def <name>(argument : <type>) return datatype Int : {commands}
def squareInt(x : Int): Int = {
  x * x
}
//calling a function
squareInt(2)

// COMMAND ----------

def noDivisor(x : Int,y : Int):Float = {
  x/y
}
noDivisor(4,2)

// COMMAND ----------


def table(x : Int):Unit={
  for(y <- 1 to 10){
  println(x*y)
  }
}
table(2)

// COMMAND ----------

def third(x : Double,y : Double):Double = {
  x+y
}
  def addNumber(variable1:Double,variable2:Double,func : (Double,Double) => Double)={
    func(variable1,variable2)
  }

addNumber(10,2,third)

// COMMAND ----------

//working with tuples
val tup = ("hello","shivani",4)
tup._2  //index basis

// COMMAND ----------

var list1 = List("shivani","challoju")
list1.head

// COMMAND ----------

var dict = (1 -> "hello",2 -> "world")
dict._1

// COMMAND ----------

var list = List("shivani")
var list2 = List("challoju")
list++list2

// COMMAND ----------

var newlist = List(1,2,3,4,5)
//newlist.filter((x:Int) => x<5 )
newlist.filter((x:Int) => x!=3 )

// COMMAND ----------

var liststring = List("hey","hello")
//liststring.map((x:String) => x.reverse )
liststring.map((x:String) => x.length)

// COMMAND ----------

var newlist = List(1,2,3,4,5)
//newlist.reduce((x:Int,y:Int) => x+y )
newlist(3)

// COMMAND ----------

var list3 = List("hey","shivani","welcome","to","scala")
//list3.map((x:String) => (x(0),1))
list3.map((x:String) => (x,1))

// COMMAND ----------

var ss : Byte = 124
//ss.toInt
//ss.toString
ss.toShort
