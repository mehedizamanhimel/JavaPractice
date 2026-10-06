#!/bin/sh
# Turns on the project's git hooks for this clone (run once after cloning).
# Afterwards every `git commit` runs all unit tests first and is cancelled if any fail.
cd "$(git rev-parse --show-toplevel)" || exit 1
chmod +x scripts/git-hooks/*
git config core.hooksPath scripts/git-hooks
echo "Git hooks installed: every commit now runs the unit tests first."
echo "Results are stored in .test-results/ (history.log has one line per commit attempt)."
