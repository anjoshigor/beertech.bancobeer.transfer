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

## Como testar

Após o passo anterior, abra o navegador em `http://localhost:15672/#/queues`.

Se necessitar de usuário e senha, utilize `guest` para ambos.

Para enviar as requisições assíncronas, utilize as seguintes filas e os respectivos jsons

### operation_inbound
```json
{
  "tipo": "SAQUE",
  "contaHash": "105a15d8-0dc1-11eb-adc1-0242ac120002",
  "valor": 10.50
}
```
### transfer_inbound
```json
{
  "hashContaDe": "105a15d8-0dc1-11eb-adc1-0242ac120002",
  "hashContaPara": "40e77ccc-0dc1-11eb-adc1-0242ac120002",
  "valor": 10.50
}
```

Para gerar novas contas, utilize os endpoints disponíveis no swagger:

`http://localhost:8080/swagger-ui.html`
