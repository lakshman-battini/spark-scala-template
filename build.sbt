name := "spark-scala-template"

organization  := "com.lbattini"

description   := "Spark Scala Template Project" 

version := "1.0"
 
scalaVersion := "2.11.8"

val sparkVersion = "2.3.0"

libraryDependencies ++= Seq(
  "org.apache.spark"  %% "spark-core"      % sparkVersion,
  "org.apache.spark"  %% "spark-sql"       % sparkVersion)