name := "example-sink"

version := "0.2"

scalaVersion := "2.11.4"

// dependencies
libraryDependencies ++= Seq(
    "com.amazonaws"                   %  "amazon-kinesis-client"      % "1.2.1",
    "com.amazonaws"                   %  "aws-java-sdk"               % "1.9.34",
    "com.amazonaws"                   %  "amazon-kinesis-connectors"   % "1.2.0"
)

// repos
resolvers ++= Seq(
    "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/",
    "Sontaytype Repo" at "http://repo.typesafe.com/typesafe/sonatype-snapshots/",
    "Spray repo" at "http://repo.spray.io/",
    "Akka repo" at "http://repo.akka.io/releases/",
    "thenewmotion" at "http://nexus.thenewmotion.com/content/repositories/releases-public",
    "central" at "http://repo.maven.apache.org/maven2/",
    "clojars.org" at "http://clojars.org/repo",
    "ScalaToolsMaven2Repository" at "http://scala-tools.org/repo-releases",
    Resolver.url("sbt-plugin-snapshots", new URL("http://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns),
    Resolver.url("play-plugin-snapshots", new URL("http://repo.scala-sbt.org/scalasbt/sbt-plugin-snapshots/"))(Resolver.ivyStylePatterns),
    Resolver.url("Alex's GitHub Repository", url("http://alexanderjarvis.github.com/snapshots/"))(Resolver.ivyStylePatterns),
    // For scalazon
    "BintrayJCenter" at "http://jcenter.bintray.com"
  )
