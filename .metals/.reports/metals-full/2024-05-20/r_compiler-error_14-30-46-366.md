file://<WORKSPACE>/src/main/scala/Main.scala
### java.lang.AssertionError: assertion failed: denotation class WithPureFuns invalid in run 3. ValidFor: Period(1..5, run = 4)

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.3/scala3-library_3-3.3.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 8
uri: file://<WORKSPACE>/src/main/scala/Main.scala
text:
```scala
object M@@

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
	dotty.tools.dotc.core.Symbols$Symbol.name(Symbols.scala:260)
	dotty.tools.dotc.core.tasty.TreeUnpickler$$anon$3.hasSymbol(TreeUnpickler.scala:750)
	dotty.tools.dotc.core.tasty.TreeUnpickler.dotty$tools$dotc$core$tasty$TreeUnpickler$TreeReader$$_$createMemberSymbol$$anonfun$1(TreeUnpickler.scala:649)
	scala.collection.immutable.List.exists(List.scala:395)
	dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.createMemberSymbol(TreeUnpickler.scala:649)
	dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.createSymbol(TreeUnpickler.scala:560)
	dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.symbolAtCurrent(TreeUnpickler.scala:282)
	dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.indexStats(TreeUnpickler.scala:764)
	dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.indexStats$$anonfun$1$$anonfun$1(TreeUnpickler.scala:774)
	dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.processPackage(TreeUnpickler.scala:794)
	dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.processPackage(TreeUnpickler.scala:790)
	dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.indexStats(TreeUnpickler.scala:774)
	dotty.tools.dotc.core.tasty.TreeUnpickler.enter(TreeUnpickler.scala:107)
	dotty.tools.dotc.core.tasty.DottyUnpickler.enter(DottyUnpickler.scala:57)
	dotty.tools.dotc.core.classfile.ClassfileParser.unpickleTASTY$1(ClassfileParser.scala:923)
	dotty.tools.dotc.core.classfile.ClassfileParser.unpickleOrParseInnerClasses(ClassfileParser.scala:991)
	dotty.tools.dotc.core.classfile.ClassfileParser.parseClass(ClassfileParser.scala:189)
	dotty.tools.dotc.core.classfile.ClassfileParser.$anonfun$1(ClassfileParser.scala:87)
	dotty.tools.dotc.core.classfile.ClassfileParser.run(ClassfileParser.scala:82)
	dotty.tools.dotc.core.ClassfileLoader.load(SymbolLoaders.scala:412)
	dotty.tools.dotc.core.ClassfileLoader.doComplete(SymbolLoaders.scala:407)
	dotty.tools.dotc.core.SymbolLoader$$anon$1.doComplete(SymbolLoaders.scala:325)
	dotty.tools.dotc.core.SymbolLoader.complete(SymbolLoaders.scala:341)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.completeFrom(SymDenotations.scala:174)
	dotty.tools.dotc.core.Denotations$Denotation.completeInfo$1(Denotations.scala:187)
	dotty.tools.dotc.core.Denotations$Denotation.info(Denotations.scala:189)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2145)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2115)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2128)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2497)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2564)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2115)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2166)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:721)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:900)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:704)
	dotty.tools.dotc.core.Types$Type.member(Types.scala:688)
	dotty.tools.dotc.core.Denotations$.select$1(Denotations.scala:1306)
	dotty.tools.dotc.core.Denotations$.recurSimple$1(Denotations.scala:1336)
	dotty.tools.dotc.core.Denotations$.recur$1(Denotations.scala:1338)
	dotty.tools.dotc.core.Denotations$.staticRef$$anonfun$1(Denotations.scala:1343)
	dotty.tools.dotc.util.GenericHashMap.getOrElseUpdate(GenericHashMap.scala:134)
	dotty.tools.dotc.core.Denotations$.staticRef(Denotations.scala:1343)
	dotty.tools.dotc.core.Symbols$.requiredClass(Symbols.scala:898)
	dotty.tools.dotc.core.classfile.ClassfileParser.lookupTopLevel$1(ClassfileParser.scala:118)
	dotty.tools.dotc.core.classfile.ClassfileParser.classNameToSymbol(ClassfileParser.scala:127)
	dotty.tools.dotc.core.classfile.ClassfileParser.sig2type$1(ClassfileParser.scala:429)
	dotty.tools.dotc.core.classfile.ClassfileParser.dotty$tools$dotc$core$classfile$ClassfileParser$$sigToType(ClassfileParser.scala:550)
	dotty.tools.dotc.core.classfile.ClassfileParser$ConstantPool.getType(ClassfileParser.scala:1289)
	dotty.tools.dotc.core.classfile.ClassfileParser.unpickleOrParseInnerClasses(ClassfileParser.scala:1018)
	dotty.tools.dotc.core.classfile.ClassfileParser.parseClass(ClassfileParser.scala:189)
	dotty.tools.dotc.core.classfile.ClassfileParser.$anonfun$1(ClassfileParser.scala:87)
	dotty.tools.dotc.core.classfile.ClassfileParser.run(ClassfileParser.scala:82)
	dotty.tools.dotc.core.ClassfileLoader.load(SymbolLoaders.scala:412)
	dotty.tools.dotc.core.ClassfileLoader.doComplete(SymbolLoaders.scala:407)
	dotty.tools.dotc.core.SymbolLoader$$anon$1.doComplete(SymbolLoaders.scala:325)
	dotty.tools.dotc.core.SymbolLoader.complete(SymbolLoaders.scala:341)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.completeFrom(SymDenotations.scala:174)
	dotty.tools.dotc.core.Denotations$Denotation.completeInfo$1(Denotations.scala:187)
	dotty.tools.dotc.core.Denotations$Denotation.info(Denotations.scala:189)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2145)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2115)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamedNoShadowingBasedOnFlags(SymDenotations.scala:2138)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.nonPrivateMembersNamed(SymDenotations.scala:2128)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.recur$5(SymDenotations.scala:2497)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.computeMembersNamed(SymDenotations.scala:2564)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2115)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2166)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:721)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:900)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:704)
	dotty.tools.dotc.core.Types$Type.member(Types.scala:688)
	dotty.tools.dotc.core.Denotations$.select$1(Denotations.scala:1306)
	dotty.tools.dotc.core.Denotations$.recurSimple$1(Denotations.scala:1336)
	dotty.tools.dotc.core.Denotations$.recur$1(Denotations.scala:1338)
	dotty.tools.dotc.core.Denotations$.staticRef$$anonfun$1(Denotations.scala:1343)
	dotty.tools.dotc.util.GenericHashMap.getOrElseUpdate(GenericHashMap.scala:134)
	dotty.tools.dotc.core.Denotations$.staticRef(Denotations.scala:1343)
	dotty.tools.dotc.core.Symbols$.requiredClass(Symbols.scala:898)
	dotty.tools.dotc.core.classfile.ClassfileParser.lookupTopLevel$1(ClassfileParser.scala:118)
	dotty.tools.dotc.core.classfile.ClassfileParser.classNameToSymbol(ClassfileParser.scala:127)
	dotty.tools.dotc.core.classfile.ClassfileParser.sig2type$1(ClassfileParser.scala:429)
	dotty.tools.dotc.core.classfile.ClassfileParser.dotty$tools$dotc$core$classfile$ClassfileParser$$sigToType(ClassfileParser.scala:550)
	dotty.tools.dotc.core.classfile.ClassfileParser$ConstantPool.getType(ClassfileParser.scala:1289)
	dotty.tools.dotc.core.classfile.ClassfileParser.unpickleOrParseInnerClasses(ClassfileParser.scala:1018)
	dotty.tools.dotc.core.classfile.ClassfileParser.parseClass(ClassfileParser.scala:189)
	dotty.tools.dotc.core.classfile.ClassfileParser.$anonfun$1(ClassfileParser.scala:87)
	dotty.tools.dotc.core.classfile.ClassfileParser.run(ClassfileParser.scala:82)
	dotty.tools.dotc.core.ClassfileLoader.load(SymbolLoaders.scala:412)
	dotty.tools.dotc.core.ClassfileLoader.doComplete(SymbolLoaders.scala:407)
	dotty.tools.dotc.core.SymbolLoader.complete(SymbolLoaders.scala:341)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.completeFrom(SymDenotations.scala:174)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.completeOnce(SymDenotations.scala:385)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.unforcedDecls(SymDenotations.scala:409)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.typeParamsFromDecls(SymDenotations.scala:1882)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.typeParams(SymDenotations.scala:1895)
	dotty.tools.dotc.core.TypeApplications$.typeParams$extension(TypeApplications.scala:183)
	dotty.tools.dotc.core.TypeApplications$.typeParamSymbols$extension(TypeApplications.scala:220)
	dotty.tools.dotc.typer.Typer.adaptType$1(Typer.scala:4189)
	dotty.tools.dotc.typer.Typer.adapt1(Typer.scala:4276)
	dotty.tools.dotc.typer.Typer.adapt(Typer.scala:3590)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3187)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3191)
	dotty.tools.dotc.typer.Typer.typedType(Typer.scala:3306)
	dotty.tools.dotc.typer.Namer.typedAheadType$$anonfun$1(Namer.scala:1653)
	dotty.tools.dotc.typer.Namer.typedAhead(Namer.scala:1646)
	dotty.tools.dotc.typer.Namer.typedAheadType(Namer.scala:1653)
	dotty.tools.dotc.typer.Namer.defDefSig(Namer.scala:1789)
	dotty.tools.dotc.typer.Namer$Completer.typeSig(Namer.scala:791)
	dotty.tools.dotc.typer.Namer$Completer.completeInCreationContext(Namer.scala:934)
	dotty.tools.dotc.typer.Namer$Completer.complete(Namer.scala:814)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.completeFrom(SymDenotations.scala:174)
	dotty.tools.dotc.core.Denotations$Denotation.completeInfo$1(Denotations.scala:187)
	dotty.tools.dotc.core.Denotations$Denotation.info(Denotations.scala:189)
	dotty.tools.dotc.typer.Namer$ClassCompleter.completeConstructor(Namer.scala:1459)
	dotty.tools.dotc.typer.Namer$ClassCompleter.completeInCreationContext(Namer.scala:1589)
	dotty.tools.dotc.typer.Namer$Completer.complete(Namer.scala:814)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.completeFrom(SymDenotations.scala:174)
	dotty.tools.dotc.core.Denotations$Denotation.completeInfo$1(Denotations.scala:187)
	dotty.tools.dotc.core.Denotations$Denotation.info(Denotations.scala:189)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeMembersNamed(SymDenotations.scala:2145)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.membersNamed(SymDenotations.scala:2115)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2166)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:721)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:900)
	dotty.tools.dotc.typer.TypeAssigner.selectionType(TypeAssigner.scala:155)
	dotty.tools.dotc.typer.TypeAssigner.selectionType$(TypeAssigner.scala:16)
	dotty.tools.dotc.typer.Typer.selectionType(Typer.scala:117)
	dotty.tools.dotc.typer.Typer.typedSelect(Typer.scala:682)
	dotty.tools.dotc.typer.Typer.typeSelectOnTerm$1(Typer.scala:756)
	dotty.tools.dotc.typer.Typer.typedSelect(Typer.scala:793)
	dotty.tools.dotc.typer.Typer.typedNamed$1(Typer.scala:3019)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3114)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3187)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3191)
	dotty.tools.dotc.typer.Typer.typedExpr(Typer.scala:3303)
	dotty.tools.dotc.typer.Applications.realApply$1(Applications.scala:941)
	dotty.tools.dotc.typer.Applications.typedApply(Applications.scala:1101)
	dotty.tools.dotc.typer.Applications.typedApply$(Applications.scala:352)
	dotty.tools.dotc.typer.Typer.typedApply(Typer.scala:117)
	dotty.tools.dotc.typer.Typer.typedUnnamed$1(Typer.scala:3050)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3115)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3187)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3191)
	dotty.tools.dotc.typer.Typer.typedExpr(Typer.scala:3303)
	dotty.tools.dotc.typer.Typer.typedValDef(Typer.scala:2424)
	dotty.tools.dotc.typer.Typer.typedNamed$1(Typer.scala:3023)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3114)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3187)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3191)
	dotty.tools.dotc.typer.Typer.traverse$1(Typer.scala:3213)
	dotty.tools.dotc.typer.Typer.typedStats(Typer.scala:3259)
	dotty.tools.dotc.typer.Typer.typedPackageDef(Typer.scala:2812)
	dotty.tools.dotc.typer.Typer.typedUnnamed$1(Typer.scala:3083)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3115)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3187)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3191)
	dotty.tools.dotc.typer.Typer.typedExpr(Typer.scala:3303)
	dotty.tools.dotc.typer.TyperPhase.typeCheck$$anonfun$1(TyperPhase.scala:44)
	dotty.tools.dotc.typer.TyperPhase.typeCheck$$anonfun$adapted$1(TyperPhase.scala:50)
	scala.Function0.apply$mcV$sp(Function0.scala:42)
	dotty.tools.dotc.core.Phases$Phase.monitor(Phases.scala:440)
	dotty.tools.dotc.typer.TyperPhase.typeCheck(TyperPhase.scala:50)
	dotty.tools.dotc.typer.TyperPhase.runOn$$anonfun$3(TyperPhase.scala:84)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.immutable.List.foreach(List.scala:333)
	dotty.tools.dotc.typer.TyperPhase.runOn(TyperPhase.scala:84)
	dotty.tools.dotc.Run.runPhases$1$$anonfun$1(Run.scala:246)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.ArrayOps$.foreach$extension(ArrayOps.scala:1323)
	dotty.tools.dotc.Run.runPhases$1(Run.scala:262)
	dotty.tools.dotc.Run.compileUnits$$anonfun$1(Run.scala:270)
	dotty.tools.dotc.Run.compileUnits$$anonfun$adapted$1(Run.scala:279)
	dotty.tools.dotc.util.Stats$.maybeMonitored(Stats.scala:71)
	dotty.tools.dotc.Run.compileUnits(Run.scala:279)
	dotty.tools.dotc.Run.compileSources(Run.scala:194)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:165)
	scala.meta.internal.pc.MetalsDriver.run(MetalsDriver.scala:45)
	scala.meta.internal.pc.SelectionRangeProvider.$anonfun$1(SelectionRangeProvider.scala:44)
	scala.collection.immutable.List.map(List.scala:246)
	scala.meta.internal.pc.SelectionRangeProvider.selectionRange(SelectionRangeProvider.scala:64)
	scala.meta.internal.pc.ScalaPresentationCompiler.selectionRange$$anonfun$1(ScalaPresentationCompiler.scala:354)
```
#### Short summary: 

java.lang.AssertionError: assertion failed: denotation class WithPureFuns invalid in run 3. ValidFor: Period(1..5, run = 4)