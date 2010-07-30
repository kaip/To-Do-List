import org.specs._

class ToDoList(var list:List[String]) {
    def this() =
        this(Nil)
}

object ToDoListConstruction extends Specification {
    "Construction of an empty to do list" should {
        "create an empty list" in {
            val testString = "test"
            var testToDoList = new ToDoList()
            testToDoList.list mustEqual Nil
        }
    }
}
