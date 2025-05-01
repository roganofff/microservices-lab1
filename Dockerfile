FROM openjdk:17-jdk-slim AS build
LABEL authors="quo vadis"

WORKDIR /app

COPY build.gradle.kts settings.gradle.kts gradlew ./
COPY gradle gradle
RUN ./gradlew --no-daemon dependencies || true

COPY src src
RUN ./gradlew --no-daemon installDist

FROM openjdk:17-jdk-slim AS runtime
WORKDIR /app

COPY --from=build /app/build/install/lab ./

EXPOSE 8080
ENTRYPOINT ["bin/lab"]