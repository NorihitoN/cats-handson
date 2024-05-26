error id: Boolean
### java.lang.AssertionError: assertion failed: denotation class Boolean invalid in run 7. ValidFor: Period(1..2, run = 8)

Error while printing type, could not create short name for type: 
TypeRef(ThisType(TypeRef(NoPrefix,module class scala)),class Boolean)


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
	scala.meta.internal.pc.printer.ShortenedNames.loop$1(ShortenedNames.scala:159)
	scala.meta.internal.pc.printer.ShortenedNames.shortType(ShortenedNames.scala:229)
	scala.meta.internal.pc.printer.MetalsPrinter.$anonfun$1(MetalsPrinter.scala:75)
	scala.util.Try$.apply(Try.scala:210)
	scala.meta.internal.pc.printer.MetalsPrinter.tpe(MetalsPrinter.scala:75)
	scala.meta.internal.pc.printer.MetalsPrinter.defaultMethodSignature(MetalsPrinter.scala:224)
	scala.meta.internal.pc.completions.OverrideCompletions$.toCompletionValue(OverrideCompletions.scala:430)
	scala.meta.internal.pc.completions.OverrideCompletions$.contribute$$anonfun$1(OverrideCompletions.scala:127)
	scala.collection.immutable.List.map(List.scala:246)
	scala.meta.internal.pc.completions.OverrideCompletions$.contribute(OverrideCompletions.scala:127)
	scala.meta.internal.pc.completions.Completions.advancedCompletions(Completions.scala:461)
	scala.meta.internal.pc.completions.Completions.completions(Completions.scala:183)
	scala.meta.internal.pc.completions.CompletionProvider.completions(CompletionProvider.scala:86)
	scala.meta.internal.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:147)
	scala.meta.internal.pc.CompilerAccess.withSharedCompiler(CompilerAccess.scala:156)
	scala.meta.internal.pc.CompilerAccess.$anonfun$1(CompilerAccess.scala:102)
	scala.meta.internal.pc.CompilerAccess.onCompilerJobQueue$$anonfun$1(CompilerAccess.scala:245)
	scala.meta.internal.pc.CompilerJobQueue$Job.run(CompilerJobQueue.scala:152)
	java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	java.lang.Thread.run(Thread.java:748)
```
#### Short summary: 

java.lang.AssertionError: assertion failed: denotation class Boolean invalid in run 7. ValidFor: Period(1..2, run = 8)