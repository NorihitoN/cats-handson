file://<WORKSPACE>/src/main/scala/Main.scala
### java.lang.AssertionError: assertion failed: denotation class Int invalid in run 7. ValidFor: Period(1..2, run = 8)

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.3/scala3-library_3-3.3.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 1023
uri: file://<WORKSPACE>/src/main/scala/Main.scala
text:
```scala
import cats.data.Writer

object Main extends App {

  def gcd(a: Int, b: Int): Writer[Vector[String], Int] = {
    if (b == 0) {
      for {
        _ <- Writer.tell(Vector(s"Finished with $a"))
      } yield a
    } else {
      for {
        _ <- Writer.tell(Vector(s"$a mod $b = ${a % b}"))
        result <- gcd(b, a % b)
      } yield result
    }
  }

  def gcd2(a: Int, b: Int): Writer[List[String], Int] = {
    b match {
      case 0 => Writer(List(s"Finished with $a"), a)
      case _ => Writer(List(s"$a mod $b = ${a % b}"), a % b).flatMap(_ => gcd2(b, a % b))
    }
  }

  def gcd3(a: Int, b: Int): Writer[Vector[String], Int] = {
    b match {
      case 0 => Writer(Vector(s"Finished with $a"), a)
      case _ => Writer(Vector(s"$a mod $b = ${a % b}"), a % b).flatMap(_ => gcd3(b, a % b))
    }
  }

  val result1 = gcd(8, 3).run
  println(result1)

  val result2 = gcd2(8, 3).run
  println(result2)

  val result3 = gcd3(8, 3).run
  println(result3)

}

object UserInfo extends Users {
  def userInfo(name;@@)
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
	dotty.tools.dotc.core.Symbols$.toDenot(Symbols.scala:494)
	dotty.tools.dotc.core.TypeOps$AsSeenFromMap.apply(TypeOps.scala:102)
	dotty.tools.dotc.core.Types$TypeMap.mapOverLambda(Types.scala:5743)
	dotty.tools.dotc.core.TypeOps$AsSeenFromMap.apply(TypeOps.scala:105)
	dotty.tools.dotc.core.TypeOps$.asSeenFrom(TypeOps.scala:56)
	dotty.tools.dotc.core.Types$Type.asSeenFrom(Types.scala:1054)
	dotty.tools.dotc.core.Types$Type.memberInfo(Types.scala:1046)
	scala.meta.internal.pc.completions.OverrideCompletions$.toCompletionValue(OverrideCompletions.scala:420)
	scala.meta.internal.pc.completions.OverrideCompletions$.contribute$$anonfun$1(OverrideCompletions.scala:127)
	scala.collection.immutable.List.map(List.scala:250)
	scala.meta.internal.pc.completions.OverrideCompletions$.contribute(OverrideCompletions.scala:127)
	scala.meta.internal.pc.completions.Completions.advancedCompletions(Completions.scala:461)
	scala.meta.internal.pc.completions.Completions.completions(Completions.scala:183)
	scala.meta.internal.pc.completions.CompletionProvider.completions(CompletionProvider.scala:86)
	scala.meta.internal.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:147)
```
#### Short summary: 

java.lang.AssertionError: assertion failed: denotation class Int invalid in run 7. ValidFor: Period(1..2, run = 8)