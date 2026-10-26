# Vortex
WIP Workflow app

## Dev setup

After cloning, run once:

```
./scripts/setup-dev
```

This wires up the local pre-commit hook (ktlint + detekt on staged files). The same checks also run in CI on every PR via `.github/workflows/lint.yml`.
