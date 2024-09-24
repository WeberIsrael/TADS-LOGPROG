
all: build run

build:
	@echo "#### $@ ####"
	javac -d bin Main.java
	javac -d bin trabalhos/*.java

build-teste: build
	javac -d bin testes/*.java
	javac -d bin Teste.java

run: 
	@java -cp bin Main

clear:
	rm -r bin/*

git:
	@echo "=== Configuraçõe para Git ==="
	@bash -c ' read -p "Email: " EMAIL; git config --global user.email $$EMAIL '
	@bash -c ' read -p "Nome: "  NOME ; git config --global user.name  $$NOME  '