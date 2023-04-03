



CN=YangShijie, OU=TS, O=TS, L=BJ, ST=BJ, C=CN

通过\JDK8\bin keytool生成jks文件
```shell
keytool -genkey -alias cloud_ninja -keyalg RSA -keysize 1024 -keystore cloud_ninja.jks -validity 3650 -keypass cloud_ninja -storepass cloud_ninja
```

获取jks文件的公钥
```shell
keytool -list -rfc --keystore cloud_ninja.jks | openssl x509 -inform pem -pubkey
```