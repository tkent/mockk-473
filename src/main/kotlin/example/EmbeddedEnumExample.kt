package example

class EmbeddedEnumExample {

  enum class WithMethodType {
    FIRST { override fun myFun() = "FIRST" },
    SECOND { override fun myFun() = "SECOND"};
    abstract fun myFun(): String
  }
  var withMethodType: WithMethodType = WithMethodType.FIRST

  enum class WithoutMethodType {
    FIRST, SECOND;
  }
  var withoutMethodType: WithoutMethodType = WithoutMethodType.FIRST
}