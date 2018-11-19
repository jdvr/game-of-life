# The following are targers that do not exist in the filesystem as real files and should be always executed by make
.PHONY: build liveshell test

# Name of this project
PROJECT_NAME := trydocker

build:
	docker build -t $(PROJECT_NAME):latest -f ./Dockerfile .

liveshell: build
	docker run -it --rm -v $(PWD):/code $(PROJECT_NAME):latest /bin/bash

test: build
	docker run -it --rm $(PROJECT_NAME):latest mvn test

log:
	git log --decorate --stat --oneline --reverse