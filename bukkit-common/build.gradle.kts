repositories {
    maven(url = "https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    api(project(":backend"))

    compileOnly("org.github.paperspigot:paperspigot-api:1.8.8-R0.1-SNAPSHOT")
}