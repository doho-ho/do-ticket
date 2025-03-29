plugins {
    `java-library`
    alias(libs.plugins.kotlin.jvm)
}


java { toolchain { languageVersion.set(JavaLanguageVersion.of(libs.versions.java.get())) } }

dependencies {
    implementation(platform(libs.spring.boot.dependencies))
    api(projects.services.auth.api) // 초기엔 DTO 재사용 가능(후속 분리 고려)
//    testImplementation(kotlin("test"))
}

tasks.test { useJUnitPlatform() }
