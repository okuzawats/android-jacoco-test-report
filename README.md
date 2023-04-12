# Android Test Report with JaCoCo

## How to run test and generate test report

```console
$ ./gradlew testDebugUnitTest
```

## How to generate separate test report

```console
$ ./gradlew jacocoDebugUnitTest
```

and test reports are generated here.

- app/build/jacoco/
- another/build/jacoco/

## How to merge test reports

```console
% ./gradlew koverMergedReport
```

and merged test report is generated here.

- build/reports/kover/merged/
