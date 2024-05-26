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
val http4sVersion = "1.0.0-M21"

val catsEffect = "org.typelevel" %% "cats-effect" % catsEffectVersion
val http4sBlazeClient = "org.http4s" %% "http4s-blaze-client" % http4sVersion
val http4sCirce = "org.http4s" %% "http4s-circe" % http4sVersion

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
      catsEffect,
      http4sBlazeClient,
      http4sCirce,
    ),
    scalacOptions ++= Seq(
      "-deprecation",
      "-encoding", "UTF-8",
      "-feature",
      "-language:_"
    )
  )

scalacOptions += "-Ymacro-annotations"
