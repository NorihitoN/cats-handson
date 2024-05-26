file://<WORKSPACE>/src/main/scala/Main.scala
### java.lang.IndexOutOfBoundsException: 1 is out of bounds (min 0, max 0)

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.13
Classpath:
<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.13/scala-library-2.13.13.jar [exists ]
Options:



action parameters:
uri: file://<WORKSPACE>/src/main/scala/Main.scala
text:
```scala


object Main extends IOApp {
  def withHttpClient[A](f: Client[IO] => IO[A]): A = {
    val threadPool = Exe
    val client = BlazeClientBuilder[IO](global).resource
    client.use(f)
  }
}

```



#### Error stacktrace:

```
scala.collection.mutable.ArrayBuffer.apply(ArrayBuffer.scala:103)
	scala.reflect.internal.Positions.setChildrenPos(Positions.scala:295)
	scala.reflect.internal.Positions.atPos(Positions.scala:410)
	scala.reflect.internal.Positions.atPos$(Positions.scala:399)
	scala.reflect.internal.SymbolTable.atPos(SymbolTable.scala:28)
	scala.tools.nsc.ast.parser.Parsers$Parser.atPos(Parsers.scala:807)
	scala.tools.nsc.ast.parser.Parsers$Parser.atPos(Parsers.scala:804)
	scala.tools.nsc.ast.parser.Parsers$Parser.path(Parsers.scala:1395)
	scala.tools.nsc.ast.parser.Parsers$Parser$PatternContextSensitive.simpleType(Parsers.scala:1203)
	scala.tools.nsc.ast.parser.Parsers$Parser$PatternContextSensitive.simpleType$(Parsers.scala:1171)
	scala.tools.nsc.ast.parser.Parsers$Parser$$anon$2.simpleType(Parsers.scala:2350)
	scala.tools.nsc.ast.parser.Parsers$Parser$PatternContextSensitive.$anonfun$annotType$1(Parsers.scala:1159)
	scala.tools.nsc.ast.parser.Parsers$Parser.placeholderTypeBoundary(Parsers.scala:522)
	scala.tools.nsc.ast.parser.Parsers$Parser$PatternContextSensitive.annotType(Parsers.scala:1159)
	scala.tools.nsc.ast.parser.Parsers$Parser$PatternContextSensitive.annotType$(Parsers.scala:1159)
	scala.tools.nsc.ast.parser.Parsers$Parser$$anon$2.annotType(Parsers.scala:2350)
	scala.tools.nsc.ast.parser.Parsers$Parser.startAnnotType(Parsers.scala:2368)
	scala.tools.nsc.ast.parser.Parsers$Parser.readAppliedParent$1(Parsers.scala:3304)
	scala.tools.nsc.ast.parser.Parsers$Parser.templateParents(Parsers.scala:3310)
	scala.tools.nsc.ast.parser.Parsers$Parser.template(Parsers.scala:3342)
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
	scala.tools.nsc.ast.parser.Parsers$UnitParser.$anonfun$smartParse$1(Parsers.scala:265)
	scala.tools.nsc.ast.parser.Parsers$UnitParser.smartParse(Parsers.scala:240)
	scala.tools.nsc.ast.parser.SyntaxAnalyzer.scala$tools$nsc$ast$parser$SyntaxAnalyzer$$initialUnitBody(SyntaxAnalyzer.scala:94)
	scala.tools.nsc.ast.parser.SyntaxAnalyzer$ParserPhase.apply(SyntaxAnalyzer.scala:106)
	scala.tools.nsc.Global$GlobalPhase.applyPhase(Global.scala:481)
	scala.tools.nsc.Global$Run.$anonfun$compileLate$2(Global.scala:1688)
	scala.tools.nsc.Global$Run.$anonfun$compileLate$2$adapted(Global.scala:1687)
	scala.collection.IterableOnceOps.foreach(IterableOnce.scala:619)
	scala.collection.IterableOnceOps.foreach$(IterableOnce.scala:617)
	scala.collection.AbstractIterator.foreach(Iterator.scala:1303)
	scala.tools.nsc.Global$Run.compileLate(Global.scala:1687)
	scala.tools.nsc.interactive.Global.parseAndEnter(Global.scala:668)
	scala.tools.nsc.interactive.Global.typeCheck(Global.scala:678)
	scala.meta.internal.pc.SemanticdbTextDocumentProvider.textDocument(SemanticdbTextDocumentProvider.scala:33)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$semanticdbTextDocument$1(ScalaPresentationCompiler.scala:400)
```
#### Short summary: 

java.lang.IndexOutOfBoundsException: 1 is out of bounds (min 0, max 0)