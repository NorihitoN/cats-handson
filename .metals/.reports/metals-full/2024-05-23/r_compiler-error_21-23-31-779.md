file://<WORKSPACE>/build.sbt
### java.lang.AssertionError: assertion failed: denotation module class Map$ invalid in run 7. ValidFor: Period(1..5, run = 8)

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.3/scala3-library_3-3.3.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 652
uri: file://<WORKSPACE>/build.sbt
text:
```scala
val catsVersion = "2.4.2"
val catsCore = "org.typelevel" %% "cats-core" % catsVersion
val catsFree = "org.typelevel" %% "cats-free" % catsVersion
val catsLaws = "org.typelevel" %% "cats-laws" % catsVersion
val catsMtl = "org.typelevel" %% "cats-mtl-core" % "0.7.1"

val simulacrum = "org.typelevel" %% "simulacrum" % "1.0.1"
val kindProjector = compilerPlugin("org.typelevel" % "kind-projector" % "0.11.3" cross CrossVersion.full)
val resetAllAttrs = "org.scalamacros" %% "resetallattrs" % "1.0.0"
val munit = "org.scalameta" %% "munit" % "0.7.22"
val disciplineMunit = "org.typelevel" %% "discipline-munit" % "1.0.6"

val catsEffectVersion = "3.0.2"
v@@

ThisBuild / scalaVersion := "2.13.5"

lazy val root = (project in file("."))
  .settings(
    organization := "com.example",
    name := "something",
    libraryDependencies ++= Seq(
      catsCore,
      catsFree,
      catsMtl,
      simulacrum,
      kindProjector,
      resetAllAttrs,
      catsLaws % Test,
      munit % Test,
      disciplineMunit % Test,
    ),
    scalacOptions ++= Seq(
      "-deprecation",
      "-encoding", "UTF-8",
      "-feature",
      "-language:_"
    )
  )

scalacOptions += "-Ymacro-annotations"

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
	dotty.tools.dotc.core.unpickleScala2.Scala2Unpickler$.setClassInfo(Scala2Unpickler.scala:115)
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
	dotty.tools.dotc.core.SymDenotations$ModuleCompleter.complete(SymDenotations.scala:2802)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.completeFrom(SymDenotations.scala:174)
	dotty.tools.dotc.core.Denotations$Denotation.completeInfo$1(Denotations.scala:187)
	dotty.tools.dotc.core.Denotations$Denotation.info(Denotations.scala:189)
	dotty.tools.dotc.core.Types$TermRef.underlying(Types.scala:2837)
	dotty.tools.dotc.core.Types$Type.typeSymbol(Types.scala:521)
	dotty.tools.dotc.core.Types$Type.isRepeatedParam(Types.scala:408)
	dotty.tools.dotc.core.TypeApplications$.translateFromRepeated$extension(TypeApplications.scala:462)
	dotty.tools.dotc.core.unpickleScala2.Scala2Unpickler$LocalUnpickler.parseToCompletion$1(Scala2Unpickler.scala:623)
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

java.lang.AssertionError: assertion failed: denotation module class Map$ invalid in run 7. ValidFor: Period(1..5, run = 8)