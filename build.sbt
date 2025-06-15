name := "llm"
organization := "objektwerks"
version := "1.0.0"
scalaVersion := "3.7.1"
libraryDependencies ++= {
  Seq(
    "ch.qos.logback" % "logback-classic" % "1.5.18"
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)