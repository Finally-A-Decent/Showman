repositories {
    maven(url = "https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    api(project(":bukkit-common"))
    api(project(":bukkit-1_12"))

    compileOnly("org.github.paperspigot:paperspigot-api:1.8.8-R0.1-SNAPSHOT")
}