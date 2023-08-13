import os
from pathlib import Path

debug = os.environ.get("DEBUG", True)


def get_env(key: str):
    if debug:
        return os.environ.get(key)
    return os.environ[key]


yml = f"""
app:
  env: {get_env('ENV')}
  hello: {get_env('HELLO')}
"""

DIR = Path(__file__).parent
with open(DIR / "application-prod.yml", "w") as f:
    print(yml, file=f)
