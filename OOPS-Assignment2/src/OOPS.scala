class Person(var name:String,var age:Int) extends Ordered[Person] {
   override def compare(that: Person): Int = {
    this.name compare that.name match {
      case 0 =>  if(this.age.equals(that.age))
                    println("True\nName & age both are same")
                  else
                    println("False\nName are same but ages are not equal")
                  0

      case _ =>  if(this.name.length.equals(that.name.length) && this.age.equals(that.age))
                        println("True")
                      else println("false")
                      1

    }
  }
}
object Person extends  App{
  var personOne = new Person("Alex",22)
  var personTwo = new Person("John",28)
  personOne compare personTwo
}


