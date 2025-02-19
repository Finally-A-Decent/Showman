repositories {
    maven(url = "https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    api(project(":backend"))
    api(project(":bukkit-1_14"))

    compileOnly("org.github.paperspigot:paperspigot-api:1.8.8-R0.1-SNAPSHOT")
}