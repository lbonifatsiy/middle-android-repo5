plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(gradleApi())
}

allprojects {
    repositories {
        mavenCentral()
    }
}

gradlePlugin {
    plugins {
        create("untranslated") {
            id = "com.yandex.practicum.middle_homework_5.gradle_plugins.untranslated"
            implementationClass =
                "com.yandex.practicum.middle_homework_5.gradle_plugins.FindUntranslatedStringsPlugin"
        }
    }
}
