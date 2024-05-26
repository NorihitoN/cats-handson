file://<WORKSPACE>/src/main/scala/Main.scala
### java.lang.AssertionError: assertion failed: denotation trait Function0 invalid in run 1. ValidFor: Period(1..2, run = 61)

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.3/scala3-library_3-3.3.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 421
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
    b@@

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
	dotty.tools.dotc.core.Definitions.scalaClassName(Definitions.scala:1509)
	dotty.tools.dotc.core.Definitions.isSyntheticFunctionClass(Definitions.scala:1573)
	dotty.tools.dotc.core.TypeErasure.dotty$tools$dotc$core$TypeErasure$$sigName(TypeErasure.scala:908)
	dotty.tools.dotc.core.TypeErasure.dotty$tools$dotc$core$TypeErasure$$sigName(TypeErasure.scala:926)
	dotty.tools.dotc.core.TypeErasure.dotty$tools$dotc$core$TypeErasure$$sigName(TypeErasure.scala:936)
	dotty.tools.dotc.core.TypeErasure$.sigName(TypeErasure.scala:235)
	dotty.tools.dotc.core.Signature.$anonfun$2(Signature.scala:111)
	scala.collection.immutable.List.map(List.scala:246)
	dotty.tools.dotc.core.Signature.prependTermParams(Signature.scala:111)
	dotty.tools.dotc.core.Types$MethodOrPoly.computeSignature$2(Types.scala:3768)
	dotty.tools.dotc.core.Types$MethodOrPoly.signature(Types.scala:3780)
	dotty.tools.dotc.core.Denotations$SingleDenotation.signature(Denotations.scala:617)
	dotty.tools.dotc.core.Denotations$SingleDenotation.matchesLoosely(Denotations.scala:1023)
	dotty.tools.dotc.core.Denotations$SingleDenotation.matches(Denotations.scala:1007)
	dotty.tools.dotc.core.Denotations$SingleDenotation.filterDisjoint(Denotations.scala:1057)
	dotty.tools.dotc.core.Denotations$SingleDenotation.mapInherited(Denotations.scala:1052)
	dotty.tools.dotc.core.Denotations$SingleDenotation.mapInherited(Denotations.scala:1049)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2158)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2154)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2163)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2148)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2115)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2157)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.collect$1(SymDenotations.scala:2154)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.addInherited(SymDenotations.scala:2163)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2148)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2115)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2166)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:721)
	dotty.tools.dotc.core.Types$Type.goThis$1(Types.scala:827)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:738)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:900)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:704)
	dotty.tools.dotc.core.Types$Type.member(Types.scala:688)
	dotty.tools.dotc.core.Types$Type.allMembers$$anonfun$1(Types.scala:1041)
	scala.runtime.function.JProcedure2.apply(JProcedure2.java:15)
	scala.runtime.function.JProcedure2.apply(JProcedure2.java:10)
	dotty.tools.dotc.core.Types$Type.memberDenots$$anonfun$1(Types.scala:946)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.immutable.HashSet.foreach(HashSet.scala:958)
	dotty.tools.dotc.core.Types$Type.memberDenots(Types.scala:946)
	dotty.tools.dotc.core.Types$Type.allMembers(Types.scala:1041)
	scala.meta.internal.pc.IndexedContext$.accesibleMembers$1(IndexedContext.scala:154)
	scala.meta.internal.pc.IndexedContext$.scala$meta$internal$pc$IndexedContext$$$extractNames(IndexedContext.scala:216)
	scala.meta.internal.pc.IndexedContext$LazyWrapper.<init>(IndexedContext.scala:100)
	scala.meta.internal.pc.IndexedContext$.apply(IndexedContext.scala:88)
	scala.meta.internal.pc.IndexedContext$LazyWrapper.<init>(IndexedContext.scala:99)
	scala.meta.internal.pc.IndexedContext$.apply(IndexedContext.scala:88)
	scala.meta.internal.pc.IndexedContext$LazyWrapper.<init>(IndexedContext.scala:99)
	scala.meta.internal.pc.IndexedContext$.apply(IndexedContext.scala:88)
	scala.meta.internal.pc.IndexedContext$LazyWrapper.<init>(IndexedContext.scala:99)
	scala.meta.internal.pc.IndexedContext$.apply(IndexedContext.scala:88)
	scala.meta.internal.pc.IndexedContext$LazyWrapper.<init>(IndexedContext.scala:99)
	scala.meta.internal.pc.IndexedContext$.apply(IndexedContext.scala:88)
	scala.meta.internal.pc.IndexedContext$LazyWrapper.<init>(IndexedContext.scala:99)
	scala.meta.internal.pc.IndexedContext$.apply(IndexedContext.scala:88)
	scala.meta.internal.pc.completions.CompletionProvider.completions(CompletionProvider.scala:62)
	scala.meta.internal.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:147)
```
#### Short summary: 

java.lang.AssertionError: assertion failed: denotation trait Function0 invalid in run 1. ValidFor: Period(1..2, run = 61)