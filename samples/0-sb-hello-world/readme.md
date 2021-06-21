- check up status
```shell
watch -n1 http --check-status --timeout=1 GET http://hello-world.localhost/actuator/health
```