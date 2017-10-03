name := "kubernetes-scala-client"

version := "0.1"

scalaVersion := "2.12.3"

libraryDependencies ++= Seq(
  "io.swagger" % "swagger-core" % "1.5.16",
  "joda-time" % "joda-time" % "2.9.9",
  "org.joda" % "joda-convert" % "1.9.2",
  "com.typesafe" % "config" % "1.2.1",
  "com.typesafe.akka" % "akka-actor_2.12" % "2.5.6",
  "org.json4s" % "json4s-jackson_2.12" % "3.5.3" exclude("org.scala-lang", "scala-xml"),
  "com.typesafe.akka" % "akka-http_2.12" % "10.0.10",
  "com.typesafe.akka" % "akka-http-spray-json_2.12" % "10.0.10",
  "com.typesafe.akka" % "akka-stream_2.12" % "2.5.6"
)