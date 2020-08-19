plugins {
  kotlin("jvm") version "1.4.0"
}

repositories {
  mavenLocal()
  System.getenv("LOCAL_MVN_PROXY")?.let {
    maven {
      name = "LOCAL_MVN_PROXY"
      url = uri(it)
  	}
  }
  mavenCentral()
}

dependencies {
  "api"("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
  "testImplementation"("io.mockk:mockk:1.10.0")
  "testImplementation"("org.junit.jupiter:junit-jupiter-engine:5.6+")
}

tasks {
  withType<Test> {
    useJUnitPlatform()
  }
}