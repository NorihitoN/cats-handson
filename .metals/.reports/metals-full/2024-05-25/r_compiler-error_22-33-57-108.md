file://<WORKSPACE>/src/main/scala/Main.scala
### java.lang.IndexOutOfBoundsException: -1 is out of bounds (min 0, max 0)

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.13
Classpath:
<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.13/scala-library-2.13.13.jar [exists ]
Options:



action parameters:
offset: 107
uri: file://<WORKSPACE>/src/main/scala/Main.scala
text:
```scala


object Main extends IOApp {
  def withHttpClient[A](f: Client[IO] => IO[A]): A = {
    val threadPool = E@@
    val client = BlazeClientBuilder[IO](global).resource
    client.use(f)
  }
}

```



#### Error stacktrace:

```
scala.collection.mutable.ArrayBuffer.apply(ArrayBuffer.scala:102)
	scala.reflect.internal.Trees$TreeContextApiImpl.onlyChild(Trees.scala:198)
	scala.reflect.internal.Positions.atPos(Positions.scala:408)
	scala.reflect.internal.Positions.atPos$(Positions.scala:399)
	scala.reflect.internal.SymbolTable.atPos(SymbolTable.scala:28)
	scala.tools.nsc.ast.parser.Parsers$Parser.atPos(Parsers.scala:807)
	scala.tools.nsc.ast.parser.Parsers$Parser.atPos(Parsers.scala:805)
	scala.tools.nsc.ast.parser.Parsers$Parser.typeParam$1(Parsers.scala:2679)
	scala.tools.nsc.ast.parser.Parsers$Parser.$anonfun$typeParamClauseOpt$4(Parsers.scala:2698)
	scala.tools.nsc.ast.parser.Parsers$Parser.$anonfun$typeParamClauseOpt$3(Parsers.scala:869)
	scala.tools.nsc.ast.parser.Parsers$Parser.typeParamClauseOpt(Parsers.scala:66)
	scala.tools.nsc.ast.parser.Parsers$Parser.funDefRest(Parsers.scala:3053)
	scala.tools.nsc.ast.parser.Parsers$Parser.funDefOrDcl(Parsers.scala:3040)
	scala.tools.nsc.ast.parser.Parsers$Parser.defOrDcl(Parsers.scala:2894)
	scala.tools.nsc.ast.parser.Parsers$Parser.nonLocalDefOrDcl(Parsers.scala:2906)
	scala.tools.nsc.ast.parser.Parsers$Parser$$anonfun$templateStat$1.$anonfun$applyOrElse$2(Parsers.scala:3525)
	scala.tools.nsc.ast.parser.Parsers$Parser.joinComment(Parsers.scala:800)
	scala.tools.nsc.ast.parser.Parsers$Parser$$anonfun$templateStat$1.applyOrElse(Parsers.scala:3525)
	scala.tools.nsc.ast.parser.Parsers$Parser$$anonfun$templateStat$1.applyOrElse(Parsers.scala:3520)
	scala.tools.nsc.ast.parser.Parsers$Parser.statSeq(Parsers.scala:3452)
	scala.tools.nsc.ast.parser.Parsers$Parser.$anonfun$templateStats$1(Parsers.scala:3519)
	scala.tools.nsc.ast.parser.Parsers$Parser.checkNoEscapingPlaceholders(Parsers.scala:499)
	scala.tools.nsc.ast.parser.Parsers$Parser.templateStats(Parsers.scala:3519)
	scala.tools.nsc.ast.parser.Parsers$Parser.templateStatSeq(Parsers.scala:3506)
	scala.tools.nsc.ast.parser.Parsers$Parser.templateBody(Parsers.scala:3411)
	scala.tools.nsc.ast.parser.Parsers$Parser.templateBodyOpt(Parsers.scala:3418)
	scala.tools.nsc.ast.parser.Parsers$Parser.template(Parsers.scala:3343)
	scala.tools.nsc.ast.parser.Parsers$Parser.templateOpt(Parsers.scala:3380)
	scala.tools.nsc.ast.parser.Parsers$Parser.objectDef(Parsers.scala:3265)
	scala.tools.nsc.ast.parser.Parsers$Parser.tmplDef(Parsers.scala:3199)
	scala.tools.nsc.ast.parser.Parsers$Parser.topLevelTmplDef(Parsers.scala:3180)
	scala.tools.nsc.ast.parser.Parsers$Parser$$anonfun$topStat$1.$anonfun$applyOrElse$1(Parsers.scala:3475)
	scala.tools.nsc.ast.parser.Parsers$Parser.joinComment(Parsers.scala:800)
	scala.tools.nsc.ast.parser.Parsers$Parser$$anonfun$topStat$1.applyOrElse(Parsers.scala:3475)
	scala.tools.nsc.ast.parser.Parsers$Parser$$anonfun$topStat$1.applyOrElse(Parsers.scala:3468)
	scala.tools.nsc.ast.parser.Parsers$Parser.statSeq(Parsers.scala:3452)
	scala.tools.nsc.ast.parser.Parsers$Parser.topStatSeq(Parsers.scala:3467)
	scala.tools.nsc.ast.parser.Parsers$Parser.topstats$1(Parsers.scala:3664)
	scala.tools.nsc.ast.parser.Parsers$Parser.$anonfun$compilationUnit$1(Parsers.scala:3670)
	scala.tools.nsc.ast.parser.Parsers$Parser.checkNoEscapingPlaceholders(Parsers.scala:499)
	scala.tools.nsc.ast.parser.Parsers$Parser.compilationUnit(Parsers.scala:3634)
	scala.tools.nsc.ast.parser.Parsers$SourceFileParser.$anonfun$parseStartRule$1(Parsers.scala:168)
	scala.tools.nsc.ast.parser.Parsers$Parser.$anonfun$parse$1(Parsers.scala:369)
	scala.tools.nsc.ast.parser.Parsers$Parser.parseRule(Parsers.scala:362)
	scala.tools.nsc.ast.parser.Parsers$Parser.parse(Parsers.scala:369)
	scala.tools.nsc.interactive.CompilerControl.parseTree(CompilerControl.scala:249)
	scala.tools.nsc.interactive.CompilerControl.parseTree$(CompilerControl.scala:248)
	scala.tools.nsc.interactive.Global.parseTree(Global.scala:114)
	scala.meta.internal.pc.MetalsGlobal.$anonfun$locateUntyped$1(MetalsGlobal.scala:624)
	scala.tools.nsc.interactive.CompilerControl.onUnitOf(CompilerControl.scala:71)
	scala.tools.nsc.interactive.CompilerControl.onUnitOf$(CompilerControl.scala:70)
	scala.tools.nsc.interactive.Global.onUnitOf(Global.scala:114)
	scala.meta.internal.pc.MetalsGlobal.locateUntyped(MetalsGlobal.scala:623)
	scala.meta.internal.pc.SelectionRangeProvider.$anonfun$selectionRange$1(SelectionRangeProvider.scala:42)
	scala.collection.immutable.List.map(List.scala:247)
	scala.meta.internal.pc.SelectionRangeProvider.selectionRange(SelectionRangeProvider.scala:30)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$selectionRange$1(ScalaPresentationCompiler.scala:412)
```
#### Short summary: 

java.lang.IndexOutOfBoundsException: -1 is out of bounds (min 0, max 0)