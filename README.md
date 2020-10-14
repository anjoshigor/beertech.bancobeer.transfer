# Legacy POC - Lúpulo

## Como executar

### Execução automática

Para buildar a aplicação e criar a imagem docker:

`./gradlew build docker`

Para subir todos os serviços:

`docker-compose up -d`

### Em desenvolvimento, rodando pela IDE

Para subir o rabbitmq:

`docker-compose up -d rabbitmq`

Para subir o mysql:

`docker-compose up -d db`

Execute a aplicação no seu editor favorito.

