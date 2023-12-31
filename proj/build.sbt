val scala3Version = "3.3.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "proj",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq("org.scalameta" %% "munit" % "0.7.29" % Test
    ,"org.scala-lang" % "scala-reflect" % "2.13.12"
    )
  )
