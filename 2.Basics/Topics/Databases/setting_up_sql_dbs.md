#### Start docker
```
systemctl --user start docker-desktop
```
### Microsoft SQL Server Docker Image

    docker run --name sqlserver2019 -e 'ACCEPT_EULA=Y' -e 'SA_PASSWORD=Adam123456' -p 1401:1433 -d mcr.microsoft.com/mssql/server:2019-latest

### PostgreSQL Docker Image
    docker run --name postgresql -p 5401:5432 -e POSTGRES_PASSWORD=Adam123456 -d postgres:latest

> We can build multiple database servers of the same image, we have to change the name & the port listening for the change (5401 above). 

> For the above example, the container listens for changes from port 5401 and sends to postgres server inside container on port 5432.

### Docker Commands ###

#### view all running containers
```
docker ps
```
#### view all containers regardless of status
```
docker ps -a
```

#### stop a container
```
docker stop <name>
```

### start a container
```
docker start <name>
```

### remove a container
```
docker rm sqlserver2019
```