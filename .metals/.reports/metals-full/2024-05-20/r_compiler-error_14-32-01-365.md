file://<WORKSPACE>/src/main/scala/Main.scala
### java.lang.AssertionError: assertion failed: denotation class Character invalid in run 28. ValidFor: Period(1..2, run = 29)

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.3/scala3-library_3-3.3.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 74
uri: file://<WORKSPACE>/src/main/scala/Main.scala
text:
```scala
object Main extends App {
  println("Hello, World!")
}

def gcd(a: Int, b:@@)

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
	dotty.tools.dotc.core.Symbols$ClassSymbol.classDenot(Symbols.scala:481)
	dotty.tools.dotc.core.Symbols$.toClassDenot(Symbols.scala:497)
	dotty.tools.dotc.core.TypeErasure$.normalizeClass(TypeErasure.scala:109)
	dotty.tools.dotc.core.TypeErasure.dotty$tools$dotc$core$TypeErasure$$sigName(TypeErasure.scala:911)
	dotty.tools.dotc.core.TypeErasure$.sigName(TypeErasure.scala:235)
	dotty.tools.dotc.core.Signature$.apply(Signature.scala:167)
	dotty.tools.dotc.core.Types$MethodOrPoly.computeSignature$2(Types.scala:3760)
	dotty.tools.dotc.core.Types$MethodOrPoly.signature(Types.scala:3780)
	dotty.tools.dotc.core.Denotations$SingleDenotation.signature(Denotations.scala:617)
	dotty.tools.dotc.core.Denotations$SingleDenotation.signature(Denotations.scala:607)
	dotty.tools.dotc.core.Symbols$Symbol.signature(Symbols.scala:195)
	scala.meta.internal.pc.SemanticdbSymbols$.addOverloadIdx$1(SemanticdbSymbols.scala:153)
	scala.meta.internal.pc.SemanticdbSymbols$.addDescriptor$1(SemanticdbSymbols.scala:174)
	scala.meta.internal.pc.SemanticdbSymbols$.addSymName(SemanticdbSymbols.scala:178)
	scala.meta.internal.pc.SemanticdbSymbols$.symbolName(SemanticdbSymbols.scala:116)
	scala.meta.internal.pc.completions.Completions.visit$4(Completions.scala:677)
	scala.meta.internal.pc.completions.Completions.$anonfun$9(Completions.scala:707)
	scala.meta.internal.pc.completions.Completions.enrichWithSymbolSearch$$anonfun$1(Completions.scala:584)
	scala.collection.immutable.List.map(List.scala:250)
	scala.meta.internal.pc.completions.Completions.enrichWithSymbolSearch(Completions.scala:584)
	scala.meta.internal.pc.completions.Completions.filterInteresting(Completions.scala:707)
	scala.meta.internal.pc.completions.Completions.completions(Completions.scala:204)
	scala.meta.internal.pc.completions.CompletionProvider.completions(CompletionProvider.scala:86)
	scala.meta.internal.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:147)
```
#### Short summary: 

java.lang.AssertionError: assertion failed: denotation class Character invalid in run 28. ValidFor: Period(1..2, run = 29)