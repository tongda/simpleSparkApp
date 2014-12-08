name := "Simple Spark App"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  ("org.apache.spark" % "spark-core_2.10" % "1.1.0").
    exclude("org.eclipse.jetty.orbit", "javax.mail.glassfish").
    exclude("org.eclipse.jetty.orbit", "javax.transaction").
    exclude("commons-logging", "commons-logging").
    exclude("org.mortbay.jetty", "servlet-api").
    exclude("commons-beanutils", "commons-beanutils-core").
    exclude("commons-collections", "commons-collections").
    exclude("commons-collections", "commons-collections").
    exclude("com.esotericsoftware.minlog", "minlog")
)

libraryDependencies += "com.typesafe" % "config" % "1.2.1"

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"
