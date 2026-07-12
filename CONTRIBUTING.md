# Contributing to My Prose

Thank you for your interest in contributing to My Prose.

Contributions can include:

- Bug reports.
- Feature requests.
- Source code changes.
- Unit tests.
- Documentation improvements.
- Build and workflow improvements.
- Security improvements.
- Code reviews.

Please read this document before opening an issue or pull request.

## Code of Conduct

All contributors must follow the rules in [CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md).

By participating in this project, you agree to communicate respectfully and constructively.

## Before You Start

Before creating a contribution:

1. Read the project [README.md](README.md).
2. Search existing issues and pull requests.
3. Confirm that the problem or idea has not already been reported.
4. Create an issue before implementing a large change.
5. Never include passwords, tokens, private keys, personal data, or other secrets.

Small typo corrections and minor documentation fixes may be submitted directly as a pull request.

## Development Requirements

The project requires:

- Java 21.
- Apache Maven 3.9 or newer.
- Git.
- A GitHub account.
- Access to the required GitHub Packages dependencies.

Check your installed versions with:

- `java --version`
- `mvn --version`
- `git --version`

## Repository Setup

Fork the repository on GitHub or clone it directly if you have write access.

Clone your fork:

`git clone https://github.com/MeldaSardogan/my-prose.git`

Enter the project directory:

`cd my-prose`

Add the original repository as an upstream remote when working from a fork:

`git remote add upstream https://github.com/PROJECT_OWNER/my-prose.git`

Verify the remotes:

`git remote -v`

The expected setup is:

- `origin` points to your fork.
- `upstream` points to the original repository.

## Maven Authentication

The project may use dependencies from GitHub Packages.

Store Maven credentials in your personal Maven settings file:

- Windows: `C:\Users\Name\.m2\settings.xml`
- Linux and macOS: `~/.m2/settings.xml`

Never place a personal access token inside:

- `pom.xml`
- Source code.
- Test code.
- Workflow files.
- README files.
- Git commits.

Never commit `settings.xml` to the repository.

## Build the Project

Run the full build with:

`mvn clean package`

A successful build should end with:

`BUILD SUCCESS`

## Run the Tests

Run all tests before creating a pull request:

`mvn clean test`

Every functional change must include suitable tests.

A pull request must not be merged while tests are failing.

## Run the Application

Run the application with:

`mvn exec:java`

Confirm that the expected prose is printed to the terminal.

## Working with Issues

Use GitHub issues for:

- Bug reports.
- Feature proposals.
- Documentation tasks.
- Refactoring proposals.
- Build or dependency problems.

A useful issue should contain:

- A clear title.
- A description of the problem or requested change.
- Steps to reproduce the problem, when applicable.
- Expected behavior.
- Actual behavior.
- Acceptance criteria.
- Relevant version and environment information.

Do not report security vulnerabilities in a public issue. Follow [SECURITY.md](SECURITY.md).

## Branching Model

All changes must be developed on a separate branch.

Update your local `main` branch before creating a new branch:

`git switch main`

`git pull --ff-only`

Create a branch:

`git switch -c feature/short-description`

Recommended branch prefixes:

- `feature/` for new functionality.
- `fix/` for bug fixes.
- `docs/` for documentation.
- `test/` for test changes.
- `refactor/` for internal restructuring.
- `ci/` for workflow changes.
- `chore/` for maintenance work.

Examples:

- `feature/add-closing-sentence`
- `fix/empty-prose-output`
- `docs/improve-installation-guide`
- `test/add-prose-builder-tests`
- `ci/update-pr-workflow`

Do not commit directly to `main`.

## Coding Style

Follow these Java conventions:

- Use four spaces for indentation.
- Do not use tabs for indentation.
- Use descriptive class, method, and variable names.
- Use `PascalCase` for class names.
- Use `camelCase` for methods and variables.
- Use `UPPER_SNAKE_CASE` for constants.
- Keep methods small and focused.
- Avoid unnecessary duplication.
- Prefer clear code over clever code.
- Remove unused imports.
- Do not leave commented-out code.
- Add Javadoc where it improves understanding.
- Preserve the existing package structure.

## License Headers

Every new Java source or test file must begin with:

`/*`

` * Copyright 2026 Melda Sardogan`

` * SPDX-License-Identifier: Apache-2.0`

` */`

The header must appear before the `package` declaration.

Do not remove existing copyright or license notices from files.

## Tests

Add tests for every new or changed behavior.

Tests should:

- Have descriptive names.
- Test one behavior at a time.
- Avoid depending on execution order.
- Avoid external services where possible.
- Produce repeatable results.
- Cover normal and relevant edge cases.

Examples of descriptive test names:

- `getReturnsExpectedSentence`
- `getReturnsNonBlankText`
- `registerCombinesSentencesInOrder`

Run all tests locally before pushing:

`mvn clean test`

## Documentation

Update documentation when a change affects:

- Installation.
- Configuration.
- Public behavior.
- Command-line usage.
- Dependencies.
- Security.
- Contribution rules.
- Releases.

Relevant files may include:

- `README.md`
- `CONTRIBUTING.md`
- `SECURITY.md`
- `CHANGELOG.md`
- JavaDoc comments.

## Commit Guidelines

Create small and focused commits.

Each commit should represent one logical change.

Use short, imperative commit messages.

Good examples:

- `Add closing sentence implementation`
- `Fix blank prose output`
- `Add tests for sentence length`
- `Improve Maven setup documentation`
- `Configure pull request test workflow`

Avoid messages such as:

- `changes`
- `update`
- `fix stuff`
- `work`
- `final version`

Review your changes before committing:

`git status`

`git diff`

Stage the intended files:

`git add PATH_TO_FILES`

Review the staged changes:

`git diff --staged`

Create the commit:

`git commit -m "Add meaningful description"`

## Pull Requests

Push your branch to your fork or repository:

`git push -u origin YOUR_BRANCH_NAME`

Open a pull request from your branch to `main`.

A pull request should include:

- A concise summary.
- The reason for the change.
- A list of important changes.
- Testing information.
- A reference to the related issue.
- Screenshots or output when useful.

Use the following structure:

## Summary

Explain what the pull request changes and why.

## Related Issue

Closes #ISSUE_NUMBER

## Changes

- Describe the first important change.
- Describe the second important change.

## Verification

- `mvn clean test` succeeds.
- The application was run manually when relevant.
- Documentation was reviewed.
- No secrets or generated files are included.

## Additional Notes

Add information that reviewers should know.

Use `Closes #123` when the pull request should automatically close issue 123 after merging.

## Pull Request Requirements

Before requesting review, confirm that:

- The branch is based on the latest `main`.
- The change has a related issue when required.
- The project compiles.
- All tests pass.
- New behavior has tests.
- Documentation is updated.
- License headers are present.
- No generated files are committed.
- No credentials or secrets are included.
- The pull request is small enough to review.
- GitHub Actions checks are successful.

## Updating Your Branch

Fetch changes from the original repository:

`git fetch upstream`

Switch to your branch:

`git switch YOUR_BRANCH_NAME`

Rebase onto the latest upstream `main`:

`git rebase upstream/main`

Resolve conflicts when necessary.

After rebasing a branch that already exists on your fork, update it carefully with:

`git push --force-with-lease`

Use `--force-with-lease`, not plain `--force`.

## Code Review

Reviewers may request changes.

When responding to review feedback:

- Be respectful.
- Ask questions when feedback is unclear.
- Add new commits for requested changes.
- Explain decisions when you choose a different approach.
- Resolve review conversations only after the concern is addressed.
- Do not treat technical criticism as personal criticism.

Reviewers should:

- Provide specific and actionable feedback.
- Explain the reason for requested changes.
- Acknowledge good work.
- Focus on correctness, maintainability, tests, security, and clarity.
- Avoid unnecessary style discussions that are not covered by project rules.

## Generated Files

Do not commit generated or local files, including:

- `target/`
- Compiled `.class` files.
- IDE metadata.
- Log files.
- Local environment files.
- Personal Maven settings.
- Tokens or credentials.

Check the repository before committing:

`git status`

## Dependencies

When adding or updating a dependency:

- Explain why the dependency is needed.
- Prefer actively maintained dependencies.
- Check its license.
- Avoid unnecessary dependencies.
- Add or update tests.
- Verify the build.
- Update documentation when required.

## Security

Do not disclose security vulnerabilities publicly.

Follow [SECURITY.md](SECURITY.md) for private reporting instructions.

Never commit:

- Personal access tokens.
- Passwords.
- Private keys.
- API keys.
- Session cookies.
- Production configuration.
- Personal user data.

If a secret is committed accidentally:

1. Revoke or rotate it immediately.
2. Notify the maintainers.
3. Remove it from the repository history when necessary.
4. Do not assume deleting the file from the latest commit is sufficient.

## Changelog

User-visible changes should be added to [CHANGELOG.md](CHANGELOG.md) under the `Unreleased` section.

Use categories such as:

- Added.
- Changed.
- Deprecated.
- Removed.
- Fixed.
- Security.

## Licensing

By contributing to this project, you agree that your contribution may be distributed under the Apache License 2.0.

Only contribute code or content that:

- You created yourself.
- You have permission to contribute.
- Is compatible with the project license.
- Retains required third-party copyright and license notices.

Do not copy code from another project without checking its license and attribution requirements.

## Getting Help

When you need help:

- Search existing issues.
- Read the README and contribution guide.
- Open a GitHub Discussion when available.
- Open an issue with a clear description.
- Ask focused questions and include relevant error output.

Thank you for helping improve My Prose.