import Dependencies._

lazy val root = (project in file(".")).
settings(
  inThisBuild(List(
    organization := "$organization$",
    scalaVersion := "$scalaVersion$",
    version      := "0.1.0-SNAPSHOT"
  )),
    name := "$name$",
    libraryDependencies += scalaTest % Test
  )
