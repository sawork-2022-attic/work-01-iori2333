plugins {
  java
  application
}

group = "me.iori"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.springframework:spring-context:5.3.16")
}

application {
  mainClass.set("me.iori.sa.Main")
}
