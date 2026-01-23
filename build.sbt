name := "langchain4j"
organization := "objektwerks"
version := "5.0.0"
scalaVersion := "3.8.0-RC6"
libraryDependencies ++= {
  val langchain4jVersion = "1.10.0"
  Seq(
    "dev.langchain4j" % "langchain4j" % langchain4jVersion,
    "dev.langchain4j" % "langchain4j-open-ai" % langchain4jVersion,
    "ch.qos.logback" % "logback-classic" % "1.5.25"
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
