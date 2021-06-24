### for deployment:
  * modify cluster name (kubeContext) in skaffold.yaml according to your defined clusters
  * create namespace k8s-in-practice
  * build and deploy with skaffold:
  ```shell
  skaffold run
  ```
### check upstatus
```shell
watch -n1 http --check-status --timeout=1 GET http://hello-world.localhost/actuator/health
```
