name := "ProjectForTesting"

version := "1.0"

scalaVersion := "2.10.4"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "spray repo" at "http://repo.spray.io"

libraryDependencies += "io.spray" % "spray-can" % "1.3.1"

libraryDependencies += "org.scala-lang" % "scala-library" % "2.10.4"

libraryDependencies += "com.typesafe.akka" % "akka-actor_2.10" % "2.3.5"

libraryDependencies += "postgresql" % "postgresql" % "9.1-901-1.jdbc4"