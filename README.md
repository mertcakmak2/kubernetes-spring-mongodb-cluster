# kubernetes-spring-mongodb-cluster
1 primary 2 secondary node.


```bash
  helm install my-release my-repo/mongodb --set architecture=replicaset,replicaCount=3,global.storageClass=standard
```


![image](https://user-images.githubusercontent.com/21373505/222368905-fad8ef65-8787-4cc7-98d6-8072a21a3196.png)
