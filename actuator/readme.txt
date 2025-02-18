Actuator:
    1. The actuator mainly exposes operational information about the running application — health, metrics, info, dump, env, etc.
Dependency:
    implementation 'org.springframework.boot:spring-boot-starter-actuator'
Configuration:
    Visibility: Public
        management.endpoints.web.exposure.include=health,info
        management.endpoints.web.exposure.include=*
    Visibility: Private
        spring-security
        management.endpoints.web.exposure.exclude=health,info
End-points:
    1. health - app down/up
    2. info
    3. mappings
    4. beans