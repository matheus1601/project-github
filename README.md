# project-github
Intrucões para teste após rodar projeto:
# 1) 
Após rodar o projeto, enviar para o endpoint (GET) http://localhost:8080/auth o objeto:
{
    "username":"admin",
    "password":"12345"
}
# 2)
Esta requisição retornará em seu header, a chave Authorization e o valor dela será o Bearer Token

# 3)
Após copia-lo, utilizar o endpoint (GET) http://localhost:8080/github/list/{username}, passando em seu header a chave Authorization com o valor do Bearer Token copiado anteriormente
