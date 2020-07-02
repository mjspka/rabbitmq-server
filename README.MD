# How to start RabbitMQ?
> Docker compose file is provided in the project. Spin-up the docker

```
$ docker-compose up -d
```

> Here we have defined three services rabbit1, rabbit2, rabbit3.
> rabbit1 — Master
> rabbit2 — Slave (links to master node rabbit1)
> rabbit3 — Slave (links to master node rabbit1, rabbit2)

# How to check the health of RabbitMQ?

```
$ docker-compose ps
```

# How to access management UI of RabbitMQ?

> The default credentials are admin / admin

```
http://localhost:15672
```

> Create queue, exchange and routing key as given in the application.yml file

# How to install rabbitMQ connector in confluent kafka

* Pre-requisites
** Spin-up all-in-one confluent kafka with docker 
** Install the RabbitMQ connector

```
$ docker-compose exec connect confluent-hub install --no-prompt confluentinc/kafka-connect-rabbitmq:latest
```
>> Access ksql console

```
$ docker-compose exec ksqldb-cli ksql http://ksql-server:8088

```

* Source: https://medium.com/@kailashyogeshwar/rabbitmq-cluster-using-docker-compose-7397ea378d73

