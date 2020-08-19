package example

enum class WithMethodType {
  FIRST { override fun myFun() = "FIRST" },
  SECOND { override fun myFun() = "SECOND" };
  abstract fun myFun(): String
}

class SeparateEnumExample {
  var type: WithMethodType = WithMethodType.FIRST
}