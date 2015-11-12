name := "swing"

version := "1.0"

scalaVersion := "2.11.7"

scalacOptions ++= Seq("-deprecation", "-feature")

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-swing" % "1.0.1"
)

baseAssemblySettings

assemblyJarName in assembly := "swing.jar"

mainClass in assembly := Some("demo.Button")
