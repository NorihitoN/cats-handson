file://<WORKSPACE>/src/main/scala/Main.scala
### java.lang.AssertionError: assertion failed: denotation class Tuple15 invalid in run 14. ValidFor: Period(1..2, run = 15)

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.3/scala3-library_3-3.3.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 940
uri: file://<WORKSPACE>/src/main/scala/Main.scala
text:
```scala

object Main extends App {
  val testUsers = List(User(0, 0, "Vito", "vito@example.com"),
    User(1, 0, "Michael", "michael@example.com"),
    User(2, 0, "Fredo", "fredo@example.com"))

  def run: String = Program.app(mkUserRepo)
  def mkUserRepo: UserRepo = new UserRepo {
    def get(id: Long): User = (testUsers find {_.id == id}).get
    def find(name: String): User = (testUsers find {_.name == name}).get
  }

  println(run)

}

case class User(id: Long, parentId: Long, name: String, email: String)

trait UserRepo {
  def get(id: Long): User
  def find(name: String): User
}

trait Users {
  def getUser(id: Long): UserRepo => User = {
    case repo => repo.get(id)
  }
  def findUser(name: String): UserRepo => User = {
    case repo => repo.find(name)
  }
}

object UserInfo extends Users {
  def userInfo(name: String): UserRepo => Map[String, String] = {
    for {
      user <- findUser(name)
      boss <- getUser(user.parenT@@Id)
    } yield Map(
      "name" -> s"${user.name}",
      "email" -> s"${user.email}",
      "boss" -> s"${boss.name}"
      )
  }
}

trait Program {
  def app: UserRepo => String = {
    for {
      fred <- UserInfo.userInfo("Fred")
    } yield fred.toString
  }
}


```



#### Error stacktrace:

```
scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:8)
	dotty.tools.dotc.core.Denotations$SingleDenotation.updateValidity(Denotations.scala:717)
	dotty.tools.dotc.core.Denotations$SingleDenotation.bringForward(Denotations.scala:742)
	dotty.tools.dotc.core.Denotations$SingleDenotation.toNewRun$1(Denotations.scala:799)
	dotty.tools.dotc.core.Denotations$SingleDenotation.current(Denotations.scala:870)
	dotty.tools.dotc.core.Symbols$Symbol.recomputeDenot(Symbols.scala:120)
	dotty.tools.dotc.core.Symbols$Symbol.computeDenot(Symbols.scala:114)
	dotty.tools.dotc.core.Symbols$Symbol.denot(Symbols.scala:107)
	dotty.tools.dotc.core.SymDenotations$.stillValidInOwner(SymDenotations.scala:2668)
	dotty.tools.dotc.core.SymDenotations$.stillValid(SymDenotations.scala:2662)
	dotty.tools.dotc.core.Denotations$SingleDenotation.bringForward(Denotations.scala:742)
	dotty.tools.dotc.core.Denotations$SingleDenotation.toNewRun$1(Denotations.scala:799)
	dotty.tools.dotc.core.Denotations$SingleDenotation.current(Denotations.scala:870)
	dotty.tools.dotc.core.Symbols$Symbol.recomputeDenot(Symbols.scala:120)
	dotty.tools.dotc.core.Symbols$Symbol.computeDenot(Symbols.scala:114)
	dotty.tools.dotc.core.Symbols$Symbol.denot(Symbols.scala:107)
	dotty.tools.dotc.core.Symbols$Symbol.name(Symbols.scala:260)
	dotty.tools.dotc.core.unpickleScala2.Scala2Unpickler$.setClassInfo$$anonfun$1(Scala2Unpickler.scala:109)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.immutable.List.foreach(List.scala:333)
	dotty.tools.dotc.core.unpickleScala2.Scala2Unpickler$.setClassInfo(Scala2Unpickler.scala:112)
	dotty.tools.dotc.core.unpickleScala2.Scala2Unpickler$LocalUnpickler.parseToCompletion$1(Scala2Unpickler.scala:615)
	dotty.tools.dotc.core.unpickleScala2.Scala2Unpickler$LocalUnpickler.complete$$anonfun$1(Scala2Unpickler.scala:645)
	scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.scala:18)
	dotty.tools.dotc.core.unpickleScala2.Scala2Unpickler.atReadPos(Scala2Unpickler.scala:318)
	dotty.tools.dotc.core.unpickleScala2.Scala2Unpickler$LocalUnpickler.complete(Scala2Unpickler.scala:647)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.completeFrom(SymDenotations.scala:174)
	dotty.tools.dotc.core.Denotations$Denotation.completeInfo$1(Denotations.scala:187)
	dotty.tools.dotc.core.Denotations$Denotation.info(Denotations.scala:189)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.ensureCompleted(SymDenotations.scala:393)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.flags(SymDenotations.scala:66)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.is(SymDenotations.scala:112)
	dotty.tools.dotc.interactive.Completion$Completer.dotty$tools$dotc$interactive$Completion$Completer$$include(Completion.scala:465)
	dotty.tools.dotc.interactive.Completion$Completer$$anon$4.applyOrElse(Completion.scala:498)
	dotty.tools.dotc.interactive.Completion$Completer$$anon$4.applyOrElse(Completion.scala:497)
	scala.collection.immutable.List.collect(List.scala:267)
	scala.collection.immutable.List.collect(List.scala:79)
	dotty.tools.dotc.interactive.Completion$Completer.accessibleMembers(Completion.scala:499)
	dotty.tools.dotc.interactive.Completion$Completer.importedCompletions(Completion.scala:355)
	dotty.tools.dotc.interactive.Completion$Completer.scopeCompletions$$anonfun$1(Completion.scala:240)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.IterableOnceOps.foreach(IterableOnce.scala:576)
	scala.collection.IterableOnceOps.foreach$(IterableOnce.scala:574)
	dotty.tools.dotc.core.Contexts$Context$$anon$2.foreach(Contexts.scala:132)
	dotty.tools.dotc.interactive.Completion$Completer.scopeCompletions(Completion.scala:254)
	dotty.tools.dotc.interactive.Completion$.computeCompletions(Completion.scala:149)
	dotty.tools.dotc.interactive.Completion$.completions(Completion.scala:50)
	scala.meta.internal.pc.completions.Completions.completions(Completions.scala:202)
	scala.meta.internal.pc.completions.CompletionProvider.completions(CompletionProvider.scala:86)
	scala.meta.internal.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:147)
```
#### Short summary: 

java.lang.AssertionError: assertion failed: denotation class Tuple15 invalid in run 14. ValidFor: Period(1..2, run = 15)