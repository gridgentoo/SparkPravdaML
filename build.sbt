name := "odkl-ml-pipelines"

version := "1.0"

scalaVersion := "2.11.11"

libraryDependencies ++= {
  val sparkVer = "1.6.3"
  Seq(
    "org.apache.spark"     %% "spark-core"              % sparkVer withSources(),
    "org.apache.spark"     %% "spark-mllib"             % sparkVer withSources(),
    "org.apache.spark"     %% "spark-sql"               % sparkVer withSources(),
    "org.apache.spark"     %% "spark-streaming"         % sparkVer withSources(),

    "com.esotericsoftware" % "kryo" % "4.0.1"
  )
}

lazy val scalatest = "org.scalatest" %% "scalatest" % "3.0.4"
libraryDependencies += scalatest % Test

libraryDependencies ++= {
  val luceneVersion = "5.4.1"
  Seq(
    "org.apache.lucene"    % "lucene-core"             % luceneVersion,
    "org.apache.lucene"    % "lucene-analyzers-common" % luceneVersion,

    "com.optimaize.languagedetector" % "language-detector"  % "0.6"
  )
}