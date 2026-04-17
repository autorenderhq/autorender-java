plugins {
    id("autorender.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":autorender-java-core"))
    implementation(project(":autorender-java-client-okhttp"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :autorender-java-example:run` to run `Main`
    // Use `./gradlew :autorender-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "io.autorender.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
