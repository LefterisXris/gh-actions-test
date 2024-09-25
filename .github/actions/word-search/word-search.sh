#!/bin/bash

# Get the word to search for from the input parameter
WORD_TO_SEARCH="${1:-punishment}"

# Recursively search for the word in all files
FOUND=$(grep -r -l "$WORD_TO_SEARCH" .)

if [ -n "$FOUND" ]; then
  echo "Word \"$WORD_TO_SEARCH\" found in the following files:"
  echo "$FOUND"
  echo "Failing the build."
  exit 1  # Fail the action
else
  echo "Word \"$WORD_TO_SEARCH\" not found in any file. Build is successful."
  exit 0  # Success
fi
