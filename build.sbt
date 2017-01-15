name := "turtles"

version := "0.1"

scalaVersion := "2.12.1"

scalacOptions in ThisBuild ++= Seq("-Ypartial-unification")

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats" % "0.8.1",
  "org.scalacheck" %% "scalacheck" % "1.13.4" % "test",
  "org.scalatest" %% "scalatest" % "3.0.1"
)
