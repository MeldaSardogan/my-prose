# My Prose

My Prose is a small Java and Maven application that combines sentence
implementations using the external `prose-builder` library.

## Features

- Implements the `Sentence` interface.
- Registers multiple sentences with `ProseBuilder`.
- Prints the generated prose to the terminal.
- Includes JUnit tests.
- Runs automated tests for pull requests.
- Can be published as a Maven package.

## Requirements

- Java 21
- Apache Maven
- Git
- A GitHub account
- A GitHub Packages token for the `prose-builder` dependency

## Installation

Clone the repository:

```bash
git clone https://github.com/MeldaSardogan/my-prose.git
cd my-prose
```

Configure your GitHub Packages credentials in:

```text
~/.m2/settings.xml
```

Example:

```xml
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
                              https://maven.apache.org/xsd/settings-1.0.0.xsd">

    <servers>
        <server>
            <id>prose-builder</id>
            <username>MeldaSardogan</username>
            <password>AccessToken</password>
        </server>
    </servers>

</settings>
```

Never commit your personal access token or `settings.xml` to this
repository.

## Build

Build the application with Maven:

```bash
mvn clean package
```

The generated JAR file can be found in the `target` directory.

## Test

Run all unit tests:

```bash
mvn clean test
```

## Run

Start the application with:

```bash
mvn exec:java
```

## Example output

```text
Am frühen Morgen öffnete die Stadt langsam ihre Augen.
Kurz darauf begann ein neugieriger Roboter, nach einem verlorenen Stern zu suchen.
```

## Project structure

```text
my-prose/
├── .github/
│   └── workflows/
├── src/
│   ├── main/
│   │   └── java/
│   └── test/
│       └── java/
├── .gitignore
├── CHANGELOG.md
├── CODE_OF_CONDUCT.md
├── CONTRIBUTING.md
├── LICENSE
├── NOTICE
├── README.md
├── SECURITY.md
└── pom.xml
```

## Contributing

Contributions are welcome.

Before creating an issue or pull request, please read
[CONTRIBUTING.md](CONTRIBUTING.md).

All contributors are expected to follow the rules defined in
[CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md).

## Security

Do not report security vulnerabilities through public GitHub issues.

Please follow the reporting instructions in
[SECURITY.md](SECURITY.md).

## Changelog

Changes and releases are documented in
[CHANGELOG.md](CHANGELOG.md).

## License

Copyright 2026 Melda Sardogan.

This project is licensed under the Apache License, Version 2.0.

See [LICENSE](LICENSE) and [NOTICE](NOTICE) for details.