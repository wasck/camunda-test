# camunda test
## Initialize Database with docker
```
docker run -dit -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=camunda-test -p 127.0.0.1:5432:5432 --name postgres postgres:12-alpine
```