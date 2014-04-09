scalaVersion := "2.11.0-RC4"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-xml"     % "1.0.1",
  "org.scala-lang"         %  "scala-reflect" % "2.11.0-RC4",
  "org.scalatest"          %% "scalatest"     % "2.1.3"
)

initialCommands in console := """
  import scala.reflect.runtime.universe._
  import org.scalamacros.xml.RuntimeLiftables._
"""