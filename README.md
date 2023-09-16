# Android Test Report with JaCoCo

[![codecov](https://codecov.io/github/okuzawats/android-jacoco-test-report/graph/badge.svg?token=F4OY18XUV4)](https://codecov.io/github/okuzawats/android-jacoco-test-report)

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
