name := "unindent"

version := "0.1"

scalaVersion := "2.11.6"

initialCommands in console := """
  |import unindent._
""".trim.stripMargin

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"