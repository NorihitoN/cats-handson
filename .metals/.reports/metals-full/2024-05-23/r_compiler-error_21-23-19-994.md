file://<WORKSPACE>/build.sbt
### java.lang.AssertionError: assertion failed: denotation class Number invalid in run 3. ValidFor: Period(1..2, run = 4)

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.3/scala3-library_3-3.3.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 620
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

v@@a

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
	dotty.tools.dotc.core.Symbols$Symbol.name(Symbols.scala:260)
	scala.meta.internal.pc.IndexedContext$.fromImportInfo$1$$anonfun$1(IndexedContext.scala:192)
	scala.collection.immutable.List.filter(List.scala:529)
	scala.meta.internal.pc.IndexedContext$.allAccessibleSymbols$1(IndexedContext.scala:168)
	scala.meta.internal.pc.IndexedContext$.fromImportInfo$1(IndexedContext.scala:193)
	scala.meta.internal.pc.IndexedContext$.scala$meta$internal$pc$IndexedContext$$$extractNames(IndexedContext.scala:210)
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
	scala.meta.internal.pc.IndexedContext$LazyWrapper.<init>(IndexedContext.scala:99)
	scala.meta.internal.pc.IndexedContext$.apply(IndexedContext.scala:88)
	scala.meta.internal.pc.IndexedContext$LazyWrapper.<init>(IndexedContext.scala:99)
	scala.meta.internal.pc.IndexedContext$.apply(IndexedContext.scala:88)
	scala.meta.internal.pc.completions.CompletionProvider.completions(CompletionProvider.scala:62)
	scala.meta.internal.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:147)
```
#### Short summary: 

java.lang.AssertionError: assertion failed: denotation class Number invalid in run 3. ValidFor: Period(1..2, run = 4)