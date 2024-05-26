file://<WORKSPACE>/src/main/scala/Main.scala
### java.lang.AssertionError: assertion failed: denotation object Predef invalid in run 18. ValidFor: Period(1..2, run = 19)

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.3/scala3-library_3-3.3.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 379
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

  def gcd2(a: Int, b:@@

  val result1 = gcd(8, 3).run
  println(result1)

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
	dotty.tools.dotc.core.Denotations$SingleDenotation.updateValidity(Denotations.scala:716)
	dotty.tools.dotc.core.Denotations$SingleDenotation.bringForward(Denotations.scala:742)
	dotty.tools.dotc.core.Denotations$SingleDenotation.toNewRun$1(Denotations.scala:799)
	dotty.tools.dotc.core.Denotations$SingleDenotation.current(Denotations.scala:870)
	dotty.tools.dotc.core.Symbols$Symbol.recomputeDenot(Symbols.scala:120)
	dotty.tools.dotc.core.Symbols$Symbol.computeDenot(Symbols.scala:114)
	dotty.tools.dotc.core.Symbols$Symbol.denot(Symbols.scala:107)
	dotty.tools.dotc.core.Symbols$.toDenot(Symbols.scala:494)
	scala.meta.internal.pc.SemanticdbSymbols$.addDescriptor$1(SemanticdbSymbols.scala:158)
	scala.meta.internal.pc.SemanticdbSymbols$.addSymName(SemanticdbSymbols.scala:178)
	scala.meta.internal.pc.SemanticdbSymbols$.addOwner$1(SemanticdbSymbols.scala:133)
	scala.meta.internal.pc.SemanticdbSymbols$.addSymName(SemanticdbSymbols.scala:177)
	scala.meta.internal.pc.SemanticdbSymbols$.symbolName(SemanticdbSymbols.scala:116)
	scala.meta.internal.pc.completions.CompletionValue$Symbolic.completionData(CompletionValue.scala:55)
	scala.meta.internal.pc.completions.CompletionValue$Symbolic.completionData$(CompletionValue.scala:44)
	scala.meta.internal.pc.completions.CompletionValue$Scope.completionData(CompletionValue.scala:109)
	scala.meta.internal.pc.completions.CompletionProvider.mkItem$1(CompletionProvider.scala:189)
	scala.meta.internal.pc.completions.CompletionProvider.completionItems(CompletionProvider.scala:300)
	scala.meta.internal.pc.completions.CompletionProvider.$anonfun$1(CompletionProvider.scala:96)
	scala.collection.immutable.List.map(List.scala:250)
	scala.meta.internal.pc.completions.CompletionProvider.completions(CompletionProvider.scala:97)
	scala.meta.internal.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:147)
```
#### Short summary: 

java.lang.AssertionError: assertion failed: denotation object Predef invalid in run 18. ValidFor: Period(1..2, run = 19)