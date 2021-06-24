### for deployment:
  * modify cluster name in skaffold.yaml
  * build and deploy with skaffold:
  ```shell
  skaffold run
  ```
### check upstatus
```shell
watch -n1 http --check-status --timeout=1 GET http://hello-world.localhost/actuator/health
```
