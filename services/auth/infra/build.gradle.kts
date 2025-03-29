plugins {
    `java-library`
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.spring)
    alias(libs.plugins.spring.deps)
}

java { toolchain { languageVersion.set(JavaLanguageVersion.of(libs.versions.java.get())) } }

dependencies {
    implementation(platform(projects.platform))
    api(projects.services.auth.domain)   // 포트 구현이니 domain은 api 가시성으로 노출 가능(팀 컨벤션에 따라 implementation로도 가능)

    implementation(libs.spring.boot.starter.data.jpa)
    testImplementation(libs.bundles.spring.test)
    testImplementation(libs.bundles.kotlin.test)
}

tasks.test { useJUnitPlatform() }
