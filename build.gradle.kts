plugins {
    kotlin("jvm") version "2.0.20" apply false
}

tasks {
    delete {
        delete("jar")
    }
}
