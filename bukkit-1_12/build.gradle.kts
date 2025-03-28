repositories {
    maven(url = "https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    api(project(":bukkit-common"))

    compileOnly("org.bukkit:bukkit:1.12-R0.1-SNAPSHOT")
}