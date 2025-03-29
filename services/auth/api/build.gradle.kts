plugins {
    `java-library`
    alias { libs.plugins.kotlin.jvm }
}

java { toolchain { languageVersion.set(JavaLanguageVersion.of(libs.versions.java.get())) } }

dependencies {
    implementation(platform(libs.spring.boot.dependencies))
    api(libs.spring.web)
    api(libs.jakarta.validation)
    api(libs.jackkson.databind)
}

tasks.test { useJUnitPlatform() }